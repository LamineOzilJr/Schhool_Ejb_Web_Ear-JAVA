package sn.isi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.ICoursLocal;
import sn.isi.entities.Cours;

/**
 * Servlet implementation class CoursController
 */
@WebServlet("/Cours")
public class CoursController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private ICoursLocal coursdao;
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
    public CoursController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException {
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index").forward(request, response);
	}
		
		//Pour tester une insertion
		//cela veut dire que lorsqu'on use la servlet cours, il recup la liste des cours dans la base et les affiche dans
		//le fichier sp�cifi�
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String programme = request.getParameter("programme");
		
		Cours c = new Cours();
		c.setName(name);
		c.setProgramme(programme);
		coursdao.add(c);
		response.sendRedirect(request.getContextPath()+"cours");
	}

	

}
