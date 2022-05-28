<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dettaglio</title>
</head>
	<body>
	
		<%Televisore result = (Televisore)request.getAttribute("televisoreDaMandareAllaPagina"); %>
		
		<p>Marca: <%=result.getMarca() %> </p>
		<p>Modello: <%=result.getModello() %> </p>
		<p>Prezzo: <%=result.getPrezzo() %> </p>
		<p>Pollici: <%=result.getNumeroPollici() %> </p>
		<p>Codice: <%= result.getCodice() %> </p>
		
		<br><br>
		
		<a href="searchform.jsp">Home</a>
	
	</body>
</html>