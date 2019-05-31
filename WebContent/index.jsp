<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	h3
	{
		text-align: center;
	}
</style>
</head>
<body>
	<h3> Table content move in Excel </h3>
	<br/>
	<form method="post" action="ExportdbExcelServlet">
		<table border="0">
			<tr>
				<td> Table name </td>
				<td> <select name="tname">
					 	<option value="RL_EST_CITY">CITY</option>
					 	<option value="RL_EST_LAND">LAND</option>
					 	<option value="RL_EST_LAND_USER">LAND USER</option>
					 	<option value="RL_EST_LOCATION">LOCATION</option>
					 	<option value="RL_EST_PROPERTYTYPE">PROPERTY TYPE</option>
					 </select>
				</td>
			</tr>
			<tr> <td> &nbsp; </td> </tr>
			<tr>
				<td> <input type="submit" value="Move"> </td>
			</tr>
		</table>
	</form>
</body>
</html>