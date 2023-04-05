package sn.isi.controller;

import java.io.IOException; 
import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import sn.isi.dao.IStudentLocal;
import sn.isi.entities.Student;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/Student")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private IStudentLocal studentdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException {
		
   	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setAttribute("students", studentdao.liste());
		request.getRequestDispatcher("student.jsp").forward(request, response);
	}
    
		//cela veut dire que lorsqu'on use la servlet student, il recup la liste des cours dans la base et les affiche dans
		//le fichier sp�cifi�
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String firstname = request.getParameter("firstname");
	String lastname = request.getParameter("lastname");
	String birthdate = request.getParameter("birthdate");
	String phone = request.getParameter("phone");
	
	Student s = new Student();
	s.setFirstname(firstname);
	s.setLastname(lastname);
	s.setBirthdate(birthdate);
	s.setPhone(phone);
	studentdao.add(s);
	 
	//response.sendRedirect(request.getContextPath()+"student.jsp");
	
	doGet(request, response);
	
	//request.getRequestDispatcher("student.jsp").forward(request, response);
}

}
