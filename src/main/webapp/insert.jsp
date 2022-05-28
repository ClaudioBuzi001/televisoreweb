<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>
</head>
	<body>
	<form action="ExecuteInsertTelevisoreServlet" method="post">
		<label for="marcaInputId">Marca:</label><br>
		<input type="text" name="marcaInput" id="marcaInputId">
		<br>
		<label for="modelloInputId">Modello:</label><br>
		<input type="text" name="modelloInput" id="modelloInputId">
		<br>
		<label for="prezzoInputId">Prezzo:</label><br>
		<input type="text" name="prezzoInput" id="prezzoInputId">
		<br>
		<label for="numeroPolliciInputId">Pollici:</label><br>
		<input type="text" name="numeroPolliciInput" id="numeroPolliciInputId">
		<br>
		<label for="codiceInputId">Codice:</label><br>
		<input type="text" name="codiceInput" id="codiceInputId">
		<br><br>
		
		<input type="submit" value="inserisci">

	</form>
		
	
	</body>
</html>