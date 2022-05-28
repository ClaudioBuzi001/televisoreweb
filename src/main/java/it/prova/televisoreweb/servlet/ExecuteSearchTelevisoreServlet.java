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
 * Servlet implementation class ExecuteSearchTelevisoreServlet
 */
@WebServlet("/ExecuteSearchTelevisoreServlet")
public class ExecuteSearchTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExecuteSearchTelevisoreServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = null;

		// Binding dati
		String marcaInput = request.getParameter("marcaInput");
		String modelloInput = request.getParameter("modelloInput");

		if (marcaInput.equals("") && modelloInput.equals("")) {
			String messaggioDaInviareAPagina = "Attenzione! E' necessario valorizzare almeno un campo.";
			request.setAttribute("messaggioDiErrore", messaggioDaInviareAPagina);
			destinazione = "searchform.jsp";
		} else {
			request.setAttribute("listTelevisoriAttributeName",
					MyServiceFactory.getTelevisoreServiceInstance().cercaPerMarcaEModello(marcaInput, modelloInput));

			destinazione = "results.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

}
