

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PlantillaGen
 */
@WebServlet("/PlantillaGen")
public class PlantillaGen extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PlantillaGen() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String descripcion = request.getParameter("descrip");
		String direccion = request.getParameter("dirdoc");

		request.setAttribute("direccion", direccion);
		request.setAttribute("descripcion", descripcion);

		
		System.out.println("datos Generados ....."+descripcion+" "+direccion);
		String pathDocX = "doc/example.docx";
		String realPathDocX = getServletContext().getRealPath(pathDocX);
		
		String pathLogo = "logo/logo_lidyi.jpg";
		String realPathLogo = getServletContext().getRealPath(pathLogo);
		
		//String pathGen = "doc_gen/" + direccion + "_user.docx";
		String pathGen = "doc_gen/" + direccion + "_user.docx";
		String realPathGen = getServletContext().getRealPath(pathGen);
		System.out.println(realPathGen);
		CrearDocs cd = new CrearDocs(realPathLogo, realPathDocX, realPathGen, "Empresa X");
		try {
			cd.generarDoc();
		} catch (Exception e) {
			System.out.println("------");
		}
		
		//modificarDoc("http://localhost:8080/NtpQuest/img/sample-1.jpg", "http://localhost:8080/NtpQuest/docs/"+direccion+".docx", "\"http://localhost:8080/NtpQuest/docs/"+direccion+"_user.docx\"", "Empresa X");
		//cd.modificarDoc("http://localhost:8080/NtpQuest/img/sample-1.jpg", "C:\\Users\\isiva\\casntp\\workspace\\NtpQuest\\WebContent\\docs\\tesst.docx", "http://localhost:8080/NtpQuest/docs/"+direccion+"_user.docx\"", "Empresa X");
		
		
		System.out.println("**********");
		
		//generarPdfImage("http://localhost:8080/NtpQuest/img/sample-1.jpg", ""+descripcion+".pdf");
		getServletContext().getRequestDispatcher("/jsp/plantilla.jsp").forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
