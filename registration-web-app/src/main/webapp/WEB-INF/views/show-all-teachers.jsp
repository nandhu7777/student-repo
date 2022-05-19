<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
<div class="container">
		<h2 align="center">Teacher List</h2>
		
			<div class="form-group" align="left">
				
			</div>
		

		<table class="table">
			<thead>
				<tr>					
					<th>Adhar Card</th>
					<th> Name</th>
					<th>Birthdate</th>
					<th>Address</th>
					<th>Email</th>
					<th>Mobile</th>	
					<th>Qualification</th>
					<th>Gender</th>
					<th>Salary</th>
													
				</tr>
			</thead>
			<tbody>
			    <%-- <c:forEach> is a jstl core tag that iterates through a list --%>
				<%-- we are able to iterate through an arraylist
				     using jstl tag without writing any Java code --%>
				<c:forEach var="c" items="${teacherList}">
					<tr class="success">						
						<td>${c.adharcard}</td>
						<td>${c.name}</td>	
						<td>${c.birthdate}</td>
						<td>${c.address}</td>
						<td>${c.email}</td>	
						<td>${c.mobile}</td>
						<td>${c.qualification}</td>
					    <td>${c.gender}</td>
					    <td>${c.salary}</td>	
										
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>