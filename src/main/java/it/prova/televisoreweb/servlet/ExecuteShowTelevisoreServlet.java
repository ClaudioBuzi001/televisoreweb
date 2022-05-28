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
 * Servlet implementation class ExecuteShowTelevisoreServlet
 */
@WebServlet("/ExecuteShowTelevisoreServlet")
public class ExecuteShowTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExecuteShowTelevisoreServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Binding id
		String parametroIdDellTelevisoreDaDettaglio = request.getParameter("idDaInviareComeParametro");

		// Mi carico questo oggetto e lo mando a dettaglio.jsp

		Televisore result = null;

		try {
			result = MyServiceFactory.getTelevisoreServiceInstance()
					.caricaSingoloTelevisore(Long.parseLong(parametroIdDellTelevisoreDaDettaglio));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("televisoreDaMandareAllaPagina", result);

		RequestDispatcher rd = request.getRequestDispatcher("dettaglio.jsp");
		rd.forward(request, response);

	}

}
