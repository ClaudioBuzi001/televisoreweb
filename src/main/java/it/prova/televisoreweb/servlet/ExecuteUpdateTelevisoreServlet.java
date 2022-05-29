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
 * Servlet implementation class ExecuteUpdateTelevisoreServlet
 */
@WebServlet("/ExecuteUpdateTelevisoreServlet")
public class ExecuteUpdateTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExecuteUpdateTelevisoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//faccio il Binding dei dati 
		String idTelevisoreDaModificare = request.getParameter("idTelevisore");
		
		String marcaInput = request.getParameter("marcaInput");
		String modelloInput= request.getParameter("modelloInput");
		Integer prezzoInput = Integer.parseInt(request.getParameter("prezzoInput"));
		Integer numeroPolliciInput = Integer.parseInt(request.getParameter("numeroPolliciInput"));
		String codiceInput = request.getParameter("codiceInput");
		
		//mi costruisco il nuovo Televisore
		Televisore daModificare = new Televisore(Long.parseLong(idTelevisoreDaModificare), marcaInput, modelloInput, prezzoInput, numeroPolliciInput, codiceInput);
		
		//chiamo il metodo del service UPDATE
		try {
			MyServiceFactory.getTelevisoreServiceInstance().modifica(daModificare);
			
			//setto come parametro la lsta con i dati aggiornati del db
			request.setAttribute("listTelevisoriAttributeName", MyServiceFactory.getTelevisoreServiceInstance().listaTuttiTelevisori());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//forward
		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
	}

}
