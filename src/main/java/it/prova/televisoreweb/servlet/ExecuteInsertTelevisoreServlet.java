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
 * Servlet implementation class ExecuteInsertTelevisoreServlet
 */
@WebServlet("/ExecuteInsertTelevisoreServlet")
public class ExecuteInsertTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExecuteInsertTelevisoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Binding dati
		String marcaInput= request.getParameter("marcaInput");
		String modelloInput = request.getParameter("modelloInput");
		Integer prezzoInput = Integer.parseInt(request.getParameter("prezzoInput"));
		Integer numeroPolliciInput = Integer.parseInt(request.getParameter("numeroPolliciInput"));
		String codiceInput = request.getParameter("codiceInput");
		
		Televisore daAggiungere = new Televisore(marcaInput, modelloInput, prezzoInput, numeroPolliciInput, codiceInput);
		
		//aggiungiamo il televisore
		try {
			MyServiceFactory.getTelevisoreServiceInstance().inserisciNuovo(daAggiungere);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Settiamo la lista di televisori nel db come attributo
		try {
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
