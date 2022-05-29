package it.prova.televisoreweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.televisoreweb.service.MyServiceFactory;

/**
 * Servlet implementation class ExecuteDeleteTelevisoreServlet
 */
@WebServlet("/ExecuteDeleteTelevisoreServlet")
public class ExecuteDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExecuteDeleteTelevisoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Binding dei dati
		String idTelevisoreDaRimuovere = request.getParameter("idTelevisore");
		
		//Chiamo il service per cancellare il Televisore e poi carico la lista di dati per la request _Setto un attributo_
		try {
			MyServiceFactory.getTelevisoreServiceInstance().rimuovi(Long.parseLong(idTelevisoreDaRimuovere));
			//Setto l attributo
			request.setAttribute("listTelevisoriAttributeName", MyServiceFactory.getTelevisoreServiceInstance().listaTuttiTelevisori());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Forward
		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
		
	}

}
