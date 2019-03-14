<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bikes</title>
<style>
@
keyframes swing { 0% {
	transform: rotate(0deg);
}
10%
{
transform:rotate(10deg);
}
30%
{
transform:rotate(0deg);
}
40%
{
transform:rotate(-10deg);
}
50%
{
transform:rotate(0deg);
}
60%
{
transform:rotate(5deg);
}
70%
{
transform:rotate(0deg);
}
80%
{
transform:rotate(-5deg);
}
100%
{
transform:rotate(0deg);
}
}
@
keyframes sonar { 0% {
	transform: scale(0.9);
	opacity: 1;
}
100%
{
transform:scale(2);
opacity:0;
}
}
body {
	font-size: 1.2rem;
}

.page-wrapper .sidebar-wrapper, .sidebar-wrapper .sidebar-brand>a,
	.sidebar-wrapper ul li a i, .page-wrapper .page-content,
	.sidebar-wrapper .sidebar-search input.search-menu, .sidebar-wrapper .sidebar-search .input-group-text,
	.sidebar-wrapper .sidebar-menu ul li a, #show-sidebar, #close-sidebar {
	-webkit-transition: all 0.3s ease;
	-moz-transition: all 0.3s ease;
	-ms-transition: all 0.3s ease;
	-o-transition: all 0.3s ease;
	transition: all 0.3s ease;
}
/*----------------toggeled sidebar----------------*/
.page-wrapper.toggled .sidebar-wrapper {
	left: 0px;
}

@media screen and (min-width: 768px) {
	.page-wrapper.toggled .page-content {
		padding-left: 600px;
	}
}
/*----------------sidebar-wrapper----------------*/
.sidebar-wrapper {
	width: 260px;
	height: 100%;
	max-height: 100%;
	position: fixed;
	top: 0;
	left: -300px;
	z-index: 999;
}

.sidebar-wrapper ul {
	list-style-type: none;
	padding: 0;
	margin: 0;
}
/*----------------sidebar-content----------------*/
.sidebar-content {
	max-height: calc(100% - 30px);
	height: calc(100% - 30px);
	overflow-y: auto;
	position: relative;
}

/*--------------------sidebar-brand----------------------*/
.sidebar-wrapper .sidebar-brand>a {
	text-transform: uppercase;
	font-size: 30px;
	font-family: 'Kaushan Script', cursive;
}
/*-----------------------sidebar-search------------------------*/
.sidebar-wrapper .sidebar-search>div {
	padding: 10px 20px;
}

/*----------------------sidebar-menu-------------------------*/
.sidebar-wrapper .sidebar-menu .header-menu span {
	font-weight: bold;
	font-size: 14px;
	padding: 15px 20px 5px 20px;
	display: inline-block;
}

.sidebar-wrapper .sidebar-menu ul li a {
	display: inline-block;
	width: 100%;
	text-decoration: none;
	position: relative;
	padding: 8px 30px 8px 20px;
}

.sidebar-wrapper .sidebar-menu ul li a i {
	margin-right: 10px;
	font-size: 12px;
	width: 30px;
	height: 30px;
	line-height: 30px;
	text-align: center;
	border-radius: 4px;
}

.sidebar-wrapper .sidebar-menu ul li a:hover>i::before {
	display: inline-block;
	animation: swing ease-in-out 0.5s 1 alternate;
}
/*-----------------------------chiller-theme-------------------------------------------------*/
.chiller-theme .sidebar-wrapper {
	background: #31353D;
}

.chiller-theme .sidebar-wrapper .sidebar-header, .chiller-theme .sidebar-wrapper .sidebar-search,
	.chiller-theme .sidebar-wrapper .sidebar-menu {
	border-top: 1px solid #3a3f48;
}

.chiller-theme .sidebar-wrapper .sidebar-search input.search-menu,
	.chiller-theme .sidebar-wrapper .sidebar-search .input-group-text {
	border-color: transparent;
	box-shadow: none;
}

.chiller-theme .sidebar-wrapper .sidebar-header .user-info .user-role,
	.chiller-theme .sidebar-wrapper .sidebar-header .user-info .user-status,
	.chiller-theme .sidebar-wrapper .sidebar-search input.search-menu,
	.chiller-theme .sidebar-wrapper .sidebar-search .input-group-text,
	.chiller-theme .sidebar-wrapper .sidebar-brand>a, .chiller-theme .sidebar-wrapper .sidebar-menu ul li a,
	.chiller-theme .sidebar-footer>a {
	color: white;
}

.chiller-theme .sidebar-wrapper .sidebar-menu ul li:hover>a,
	.chiller-theme .sidebar-wrapper .sidebar-menu .sidebar-dropdown.active>a,
	.chiller-theme .sidebar-wrapper .sidebar-header .user-info,
	.chiller-theme .sidebar-wrapper .sidebar-brand>a:hover, .chiller-theme .sidebar-footer>a:hover i
	{
	color: yellow;
}

.chiller-theme .sidebar-wrapper .sidebar-menu ul li a i, .chiller-theme .sidebar-wrapper .sidebar-search input.search-menu,
	.chiller-theme .sidebar-wrapper .sidebar-search .input-group-text {
	background: #3a3f48;
}

.chiller-theme .sidebar-wrapper .sidebar-menu .header-menu span {
	color: white;
}

@media ( min-width :1200px) {
	.navbar {
		padding-left: 100px;
	}
}

.navbar {
	font-size: 30px;
	font-family: 'Kaushan Script', cursive;
}

.fixed-top {
	position: fixed;
	top: 0;
	left: 260px;
	z-index: 1030;
}
.button {
  background-color: #0f1835;
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  font-size: 20px;
  margin: 4px 2px;
  opacity: 0.6;
  transition: 0.3s;
  display: inline-block;
  text-decoration: none;
  cursor: pointer;
  width:98%;
}
.button:hover{opacity: 1}
</style>
</head>
<body>
<header>
	<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark scrolling-navbar"
		class="navbar">
	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a><font color="white">Online
						Shopping</font> </a></li>
		</ul>

		<ul class="navbar-nav nav-flex-icons">
			<li class="nav-item">
			<a href="login.jsp">
				<button type="button"
					class="btn btn-danger waves-effect btn-sm" id="Logout">
					<i class="fa fa-power-off"></i>&nbsp;&nbsp;&nbsp;&nbsp;LogOut
				</button>
				</a>
			</li>
		</ul>
	</div>
	</nav>

	<div class="page-wrapper chiller-theme toggled">
		<a id="show-sidebar" class="btn btn-sm btn-dark" href="#"> <i
			class="fas fa-bars"></i>
		</a>
		<nav id="sidebar" class="sidebar-wrapper">
		<div class="sidebar-content">
			<div class="sidebar-brand">
				<a>Welcome !!</a><br></br>

			</div>
			<div class="sidebar-search">
				<div>
					<div class="input-group">
						<input type="text" class="form-control search-menu"
							placeholder="Search...">
						<div class="input-group-append">
							<span class="input-group-text"> <i class="fa fa-search"
								aria-hidden="true"></i>
							</span>
						</div>
					</div>
				</div>
			</div>
			<div class="sidebar-menu">
				<form action="CatagoryServlet" method="post">
				<ul>
					<li class="header-menu"><span>Category</span></li>
					<li class="sidebar-dropdown"><button type="submit" class="button" name="catagory" value="bike">Bike</button>
					</li>
					<li class="sidebar-dropdown"><button type="submit" class="button" name="catagory" value="mobile">Mobile</button>
					</li>
					<li class="sidebar-dropdown"><button type="submit" class="button" name="catagory" value="laptop">Laptop</button>
					</li>
					
				</ul>
				</form>
			</div>
			</div>
			</nav>
		</div>
	</header>
	<!-- sidebar-wrapper  -->
Name : 
${BIKE.name} 
<br>
Model : 
${BIKE.model} 
<br>
CC : 
${BIKE.cc} 
<br>
Mileage :
${BIKE.mileage} 
<br>
Stroke : 
${BIKE.stroke} 
<br>
Price : 
${BIKE.price} 
<br>
<form action="AddCartServlet" action="get">
<button type="submit" value="${BIKE.name}" name="name">ADD CART</button>
</form>
<form action="BuyNowServlet" action="post">
<button type="submit" value="${BIKE.name}">BUY NOW</button>
</form>
</body>
</html>