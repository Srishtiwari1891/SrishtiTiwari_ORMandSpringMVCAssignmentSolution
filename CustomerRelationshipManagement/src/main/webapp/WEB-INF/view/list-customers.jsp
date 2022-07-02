<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<title>Customer RelationShip Management</title>
</head>
<body>
	<div style="margin: 20px;">
		<header>
			<div
				style="background-color: grey; text-align: center; margin: 20px; padding: 10px;">
				<h2 class="display-4">
					<b>CUSTOMER RELATIONSHIP MANAGEMENT</b>
				</h2>
			</div>
		</header>
		<main>
			<div style="margin: 20px;">
				<a href="showFormForAdd" class="btn btn-info btn-sm">Add
					Customer</a>
			</div>
			<div style="margin: 20px;">
				<table class="table table-bordered table-striped"
					text-align="center">
					<thead class="thead-dark">
						<tr>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Email</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${customer}" var="customers">
							<tr>
								<td>${customers.firstName}</td>
								<td>${customers.lastName}</td>
								<td>${customers.email}</td>
								<td><a
									href="showFormForUpdate?customerId=${customers.customerId}"
									class="btn btn-info btn-sm">Update</a> <a
									href="delete?customerId=${customers.customerId}"
									onclick="if (!(confirm('Are you sure you want to delete this Customer?'))) return false"
									class="btn btn-danger btn-sm">Delete</a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</main>
		<footer>
			<div
				style="background-color: grey; text-align: center; margin: 20px; padding: 10px; position: fixed; width: 93%; bottom: 0; height: 60px;">
				<b>Developed by: Srishti Tiwari<br> <a
					href="mailto:code.with.srishti@gmail.com" style="color: #212529;">code.with.srishti@gmail.com</a></b>
			</div>
		</footer>
	</div>
</body>
</html>