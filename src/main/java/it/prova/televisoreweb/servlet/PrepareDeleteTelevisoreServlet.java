package it.prova.televisoreweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.televisoreweb.model.Televisore;
import it.prova.televisoreweb.service.MyServiceFactory;

/**
 * Servlet implementation class PrepareDeleteTelevisoreServlet
 */
@WebServlet("/PrepareDeleteTelevisoreServlet")
public class PrepareDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrepareDeleteTelevisoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Binding dei dati 
		String idTelevisoreDaEliminare = request.getParameter("idDaInviareComeParametro");
		
		//Mi carico il TelevisoreDaElimnare cosi glielo passo alla jsp in modo che possa far vedere tutti i suoi parametri
		try {
			Televisore daPassare = MyServiceFactory.getTelevisoreServiceInstance().caricaSingoloTelevisore(Long.parseLong(idTelevisoreDaEliminare));
		
			//Setto come attributo della request questo Televisore
			request.setAttribute("identificativo_televisore", daPassare);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Forward
		RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
		rd.forward(request, response);
	}


}




















