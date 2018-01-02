import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Empresa;
import model.EmpresaDao;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Empresa;
import model.EmpresaDao;
 
@WebServlet(urlPatterns = { "/home"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public HelloServlet() {
	}
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		ServletOutputStream out = response.getOutputStream();
		out.println("<html>");
		out.println("<head><title>Hello Servlet</title></head>");
		
		out.println("<body>");
		out.println("<h3>Hello World</h3>");
		out.println("This is my first Servlet");
		out.println("</body>");
		out.println("<html>");
		
		EmpresaDao edao;
		try {
			edao = EmpresaDao.getInstance();
			Empresa nuevo = new Empresa("prueba", "prueba", "prueba", "prueba", 'a');
			edao.insert(nuevo);
			System.out.println(edao.getById(1).getEMP_Nom());
			System.out.println(edao.getByNom("prueba").get(0).getEMP_Nom());
			Empresa nuevo2 = edao.getById(1);
			nuevo2.setEMP_Nom("Prueba2");
			edao.update(nuevo2, nuevo2.getEMP_Id());
			edao.delete(1);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
	
 
}
