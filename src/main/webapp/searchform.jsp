<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Search Televisore</title>
	</head>
	<body>
		<% if(request.getAttribute("messaggioDiErrore") != null){ %>
			<p style="color: red;"><%=request.getAttribute("messaggioDiErrore") %></p>
		<%  }else{ %>
			Inserire dati da ricercare<br>
		<%}    %>
		
		<form action="ExecuteSearchTelevisoreServlet" method="post">
			<label for="marcaInputId">Marca:</label><br>
			<input type="text" name="marcaInput" id="marcaInputId">
			<br>
			<label for="modelloInputId">Modello:</label><br>
			<input type="text" name="modelloInput" id="modelloInputId">
			<br><br>
			<input type="submit" value="Cerca">
		</form>
	
	</body>
</html>