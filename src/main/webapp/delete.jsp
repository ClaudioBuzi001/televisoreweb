<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
	<body>
		<%Televisore daEliminare = (Televisore)request.getAttribute("identificativo_televisore"); %>
		
		<p>Marca: <%=daEliminare.getMarca() %> </p>
		<p>Modello: <%=daEliminare.getModello()	 %> </p>
		<p>Prezzo: <%= daEliminare.getPrezzo() %> </p>
		<p>Numero Pollici: <%=daEliminare.getNumeroPollici() %> </p>
		<p>Codice: <%=daEliminare.getCodice() %> </p> 
		
		<br><br>
		
		<form action="ExecuteDeleteTelevisoreServlet" method="post">
			<input type="submit" value="Conferma">
			<input type="hidden" name="idTelevisore" value ="<%=daEliminare.getIdTelevisore()%>">
		</form>
	
	</body>
</html>