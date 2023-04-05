package sn.isi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.IInscriptionLocal;
import sn.isi.entities.Cours;
import sn.isi.entities.Inscription;

/**
 * Servlet implementation class InscriptionController
 */
@WebServlet("/Inscription")
public class InscriptionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private IInscriptionLocal inscriptiondao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionController() {
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String details = request.getParameter("details");
		
		Inscription i = new Inscription();
		i.setDetails(details);
		inscriptiondao.add(i);
		response.sendRedirect(request.getContextPath()+"inscription");
	}


}
