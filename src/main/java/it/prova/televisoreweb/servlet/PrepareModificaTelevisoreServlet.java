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
 * Servlet implementation class PrepareModificaTelevisoreServlet
 */
@WebServlet("/PrepareModificaTelevisoreServlet")
public class PrepareModificaTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrepareModificaTelevisoreServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Mi carico l id del Televisor da Modificare, Binding
		String idDaModificare = request.getParameter("idDaInviareComeParametro");

		// Mi carico l oggetto Televisore e lo passo all edit.jsp
		Televisore daModificare = null;
		try {
			daModificare = MyServiceFactory.getTelevisoreServiceInstance()
					.caricaSingoloTelevisore(Long.parseLong(idDaModificare));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Setto come attributo questo oggetto
		request.setAttribute("televisoreDaModificareAttributeName", daModificare);

		RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);

	}

}
