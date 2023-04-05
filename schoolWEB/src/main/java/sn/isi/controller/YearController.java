package sn.isi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import sn.isi.dao.IYearLocal;
import sn.isi.entities.Cours;
import sn.isi.entities.Year;


@WebServlet("/Year")
public class YearController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private IYearLocal yeardao;
       
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YearController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException {
		
   	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
		
		//cela veut dire que lorsqu'on use la servlet cours, il recup la liste des cours dans la base et les affiche dans
		//le fichier sp�cifi�
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");

	
	Year y = new Year();
	y.setName(name);

	yeardao.add(y);
	response.sendRedirect(request.getContextPath()+"year");
}
}
