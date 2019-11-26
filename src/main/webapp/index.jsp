<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<content="width=device-width, initial-scale=1">
<title>Leonard Logistics Login</title>
<style>
html, body {font-family: Arial, Helvetica, sans-serif;
	margin: 0;
	padding: 0	}
<!--form {border: 1px solid #f1f1f1;}-->
input[type=text], input[type=password] {
	width: 25%;
  padding: 12px 20px;
  margin: auto;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: auto;
  border: none;
  cursor: pointer;
  width: 12%;
}
button:hover {
  opacity: 0.8;
}
.cancelbtn {
  width: 12;
  padding: 10px 18px;
  background-color: #f44336;
}
.imgcontainer {
  text-align: center;
  margin: 0px 0 0px 0;
}
img.leonard {
  width: 15%;
  border-radius: 50%;
}
.container {
  padding: 16px;
}
span.psw {
  float: right;
  padding-top: 16px;
}
/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
</head>
<body>
<div class="header">
<center><h1>Leonard Logistics Login</h1></center>
</div>
	<h4 id="errMsg" class="text-danger" align="center">${error_message}</h4>
	<form id="user_login_form" name="loginForm" method="POST" action="LoginServlet">
	<div class="imgcontainer">
    <img src="resources/img/leonard.jpg" alt="Leonard" class="leonard">
  </div>	
		<div class="container">
			<center><label for="username"><b>Username</b></label></center>
			<br>
    		<center><input type="text" id="username" placeholder="Enter Username:" name="username" required></center>
			<br>
			<center><label for="password"><b>Password</b></label></center>
			<br>
    		<center><input type="password" id="password"placeholder="Enter Password:" name="password" required> </center>
			<br>
			<center><button type="submit">Login</button>
			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		<label><input type="checkbox" checked="checked" name="remember"> Remember me</label></center>
  		</div>
  
  	<center><div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    
    <span class="password">Forgot <a href="#">password?</a></span></div></center> 
    </form>
    <h4 id="errMsg" class="text-danger" align="center">${error_message}</h4>
  		
<%-- <%@ include file="footer.jsp" %> --%>

</body>
</html>