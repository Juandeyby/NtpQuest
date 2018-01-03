package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Empresa;
import model.EmpresaDao;

/**
 * Servlet implementation class dataRegister
 */
@WebServlet("/dataRegister")
public class DataRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);

		String enterpriseName = request.getParameter("enterprise_name");
		String madurityLevel = request.getParameter("madurity_level");
		String rtLevel = request.getParameter("rtlvl");
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		String securePassword = request.getParameter("password_secure");

		System.out.println(enterpriseName);
		System.out.println(madurityLevel);
		System.out.println(rtLevel);

		Empresa enterprise;
		EmpresaDao enterpriseDao;
		boolean hasError = validate(enterpriseName, madurityLevel, user, password, securePassword);
		if (password.equals(securePassword)) {
			String errorString = "Passwords differents!";
			// Store errorMessage in request attribute, before forward.
			request.setAttribute("errorString", errorString);
			
			/* Forward to /jsp/registro.jsp
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/jsp/registro.jsp");
			dispatcher.forward(request, response);
			*/
		}

		if (!hasError) {
			try {
				enterpriseDao = EmpresaDao.getInstance();
				Empresa verificationE = enterpriseDao.getByUser(user);
				if (verificationE != null) {
					String errorString = "User already exists!";
					// Store errorMessage in request attribute, before forward.
					request.setAttribute("errorString", errorString);
					/* Forward to /jsp/registro.jsp
					RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/jsp/registro.jsp");
					dispatcher.forward(request, response);
					*/

				} else {
					enterprise = new Empresa();
					enterprise.setEMP_Nom(enterpriseName);
					enterprise.setEMP_MivMr(madurityLevel.charAt(0));
					enterprise.setEMP_User(user);
					enterprise.setEMP_Pass(password);
					enterprise.setEMP_RutL(rtLevel);

					enterpriseDao.insert(enterprise);
					System.out.println("Registered Successfully");
					String valideString = "Enterprise stored";
					request.setAttribute("userValide", valideString);
					// Forward to login
					session.setAttribute("user", enterprise);
					RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/jsp/collection.jsp");
					dispatcher.forward(request, response);
				}

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			// If error, forward to (exception) same page
			String errorString = "Required all data!";

			// Store errorMessage in request attribute, before forward.
			request.setAttribute("errorString", errorString);

			/* Forward to /jsp/registro.jsp
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/jsp/registro.jsp");
			dispatcher.forward(request, response);
			*/
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	private boolean validate(String enterpriseName, String madurityLevel, String user, String password,
			String securePassword) {
		// TODO Auto-generated method stub

		boolean error = false;
		if (enterpriseName == null || madurityLevel == null || user.length() == 0 || password.length() == 0) {
			error = true;
		}
		return error;
	}

}
