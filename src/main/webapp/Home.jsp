<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
	crossorigin="anonymous"></script>

<script src="https://code.jquery.com/jquery-1.10.2.js"></script>

<!-- <link rel="stylesheet" href="/Style/Home.css"> -->
<link rel="stylesheet" href="/Style/carousel.css">
</head>
<body>
	<div class="bg">

		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container-fluid">

				<!-- 	<div class="container">   -->
				<a class="navbar-brand" href="#"> <img src="/Images/logo1.svg"
					alt="" width="30" height="24">
				</a>
				<!-- 	</div> -->

				<a class="navbar-brand" href="#">Food Waste System</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="/">Home</a></li>

						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-bs-toggle="dropdown" aria-expanded="false">
								Login/Register </a>
							<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
								<li><a class="dropdown-item" href="/loginDonor">As a
										Donor</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="/loginAgent">As a
										Agent</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="/loginAdmin">As a
										Admin</a></li>
							</ul></li>

						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Our Mission</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="/aboutus">About Us</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Contact Us</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<div id="carouselExampleControls" class="carousel slide"
			data-bs-ride="carousel">
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="/Images/food1.jpg" class="d-block w-70" alt="...">
				</div>
				<div class="carousel-item">
					<img src="/Images/food2.jpg" class="d-block w-70" alt="...">
				</div>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleControls" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleControls" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>
	</div>
</body>
</html>