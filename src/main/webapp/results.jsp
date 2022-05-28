<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Result</title>
	<style type="text/css">
	table, th, td {
	  border: 1px solid black;
	}
	
	th, td {
	  padding: 10px;
	}
	.center {
		margin-left: auto;
		margin-right: auto;
	}
	</style>
	</head>
	<body>
		<table class="center">
			<thead>
				<tr>
					<th>Marca</th>
					<th>Modello</th>
					<th>Azione</th>
				</tr>
			</thead>
			
			<%List<Televisore> listaDaServlet = (List<Televisore>)request.getAttribute("listTelevisoriAttributeName"); 
								for(Televisore televisoreItem : listaDaServlet){

				%>
				<tr>
					<td><%=televisoreItem.getMarca()%></td>
					<td><%=televisoreItem.getModello() %></td>
					<td>	
						<a href="ExecuteShowTelevisoreServlet?idDaInviareComeParametro=<%=televisoreItem.getIdTelevisore() %>">Dettaglio</a>
						<a href="PrepareModifcaTelevisoreServlet?idDaInviareComeParametro=<%=televisoreItem.getIdTelevisore() %>">Modifica</a>
						<a href="PrepareDeleteTelevisoreServlet?idDaInviareComeParametro=<%=televisoreItem.getIdTelevisore() %>">Elimina</a>			
					</td>
				</tr>
				
			<%} %>
			
		</table>
		
		<br><br>
		<a href="PrepareInsertTelevisoreServlet">Aggiungi Nuovo Televisore</a>

	</body>
</html>