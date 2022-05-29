<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<%Televisore daModificare = (Televisore)request.getAttribute("televisoreDaModificareAttributeName"); %>
		
		<form action="ExecuteUpdateTelevisoreServlet" method="post">
			<input type="hidden" name="idTelevisore" value = <%=daModificare.getIdTelevisore() %>>
			
			<label for="marcaInputId" >Marca:</label><br>
			<input type="text" name="marcaInput" id="marcaInputId" value="<%=daModificare.getMarca()%>">
			<br>
			<label for="modelloInputId"	>Modello:</label> <br>
			<input type="text" name="modelloInput" id="modelloInputId" value="<%=daModificare.getModello()%>">
			<br>
			<label for="prezzoInput">Prezzo</label><br>
			<input type="text" name="prezzoInput" id="prezoInputId" value="<%=daModificare.getPrezzo() %>">
			<br>
			<label for="numeroPolliciInputId">Numero Pollici:</label><br>
			<input type="text" name="numeroPolliciInput" id="numeroPolliciInputId" value="<%=daModificare.getNumeroPollici() %>">
			<br>
			<label for="codiceInputId">Codice:</label><br>
			<input type="text" name="codiceInput" id="codiceInputId" value="<%=daModificare.getCodice() %>">
			
			<br><br>
			<input type="submit" value="Conferma">
		
		</form>
		
	</body>
</html>