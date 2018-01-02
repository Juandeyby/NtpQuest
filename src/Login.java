

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Empresa;
import model.EmpresaDao;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 5778940022700850843L;

	public Login() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();

		String name = request.getParameter("name");
		String pass = request.getParameter("password");

		if (name == null || pass == null || name.isEmpty() || pass.isEmpty()) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Ingrese un usuario y/o password correcto');");
			out.println("location='http://localhost:8080/NtpQuest'");
			out.println("</script>");
		} else {
			if (comprobar(name, pass)) {
				HttpSession sesion = request.getSession(true);
				sesion.setAttribute("sesion", true);
				response.sendRedirect("collection");
			} else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Usuario no registrado');");
				out.println("location='http://localhost:8080/NtpQuest'");
				out.println("</script>");
			}

		}

		System.out.println(request.getParameter("name"));
	}

	private boolean comprobar(String name, String pass) {
		try {
			List<Empresa> result = EmpresaDao.getInstance().login(name, pass);
			if (result.size() == 0) {
				return false;
			}

			if (result.size() == 1) {
				String passw = result.get(0).getEMP_Pass();
				if (pass.equals(passw)) {
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
