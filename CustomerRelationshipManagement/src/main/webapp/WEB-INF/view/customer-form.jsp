<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<title>${mode}CustomerForm</title>
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
			<div style="margin: 20px; padding: 10px;">
				<p class="lead">
					<b>${mode} Customer Form</b>
				</p>
				<table style="width: 30%; text-align: center; align: left;">
					<form action="save" method="POST">
						<div class="form-inline">
							<input type=hidden name="customerId"
								value="${customers.customerId}" />
						</div>
						<tr>
							<div class="form-inline"
								style="margin-left: 20px; text-align: left;">
								<th style="text-align: left;">First Name</th>
								<td>:</td>
								<td align="center"><input type="text" name="firstName"
									value="${customers.firstName}" placeholder="First Name"
									class="form-control mb-4 col-15" required="required"></td>
							</div>
						</tr>
						<tr>
							<div class="form-inline"
								style="margin-left: 20px; text-align: left;">
								<th style="text-align: left;">Last Name</th>
								<td>:</td>
								<td align="center"><input type="text" name="lastName"
									value="${customers.lastName}" placeholder="Last Name"
									class="form-control mb-4 col-15" required="required"></td>
							</div>
						</tr>
						<tr>
							<div class="form-inline"
								style="margin-left: 20px; text-align: left;">
								<th style="text-align: left;">Email</th>
								<td>:</td>
								<td align="center"><input type="text" name="email"
									value="${customers.email}" placeholder="Email"
									class="form-control mb-4 col-15" required="required"></td>
							</div>
						</tr>
						<tr>
							<td colspan="3" align="center">
								<button type="submit" class="btn btn-info col-4">Save</button>
							</td>
						</tr>
					</form>
					<tr>
						<td colspan="3" style="text-align: left;"><a href="list">Back
								to Customers List</a></td>
					</tr>
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