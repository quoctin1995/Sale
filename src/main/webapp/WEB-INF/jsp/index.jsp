<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">

<title>Home</title>

<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
</head>
<body>

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/">Home</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="new-location">New location</a></li>
				<li><a href="all-location">All location</a></li>
			</ul>
		</div>
	</nav>

	<c:choose>
		<c:when test="${mode == 'HOME'}">
			<div class="container" id="home">
				<div class="text-center">
					<h3>Welcome</h3>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'ALL'}">
			<div class="container text-center" id="home">
				<h3>All location</h3>
				<div class="col-sm-2"></div>
				<div class="table-responsive col-sm-8">
					<table class="table table-bordered table-striped text-left">
						<thead>
							<tr>
								<th>Location_Id</th>
								<th>Country</th>
								<th>City</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="location" items="${locations}">
								<tr>
									<td>${location.locationId}</td>
									<td>${location.country}</td>
									<td>${location.city}</td>
									<td>
										<a href="update-location?locationId=${location.locationId}">
											<span>update</span>
										</a>
									</td>
									<td>
										<a href="delete-location?locationId=${location.locationId}">
											<span>delete</span>
										</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'NEW' || mode == 'UPDATE'}">
			<div class="container text-center">
				<h3>New location</h3>
				<form class="form-horizontal" method="POST" action="save-location">
					<input type="hidden" name="locationId" value="${location.locationId}" />

					<div class="form-group">
						<label class="control-label col-md-3">Country</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="country"
								value="${location.country}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">City</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="city"
								value="${location.city}" />
						</div>
					</div>

					<div class="form-group">
						<input type="submit" class="btn btn-success" value="Save" />
					</div>
				</form>
			</div>
		</c:when>
	</c:choose>

	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>