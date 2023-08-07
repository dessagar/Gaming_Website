<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="css/login.css">
    <title>Game On | Login</title>
</head>
<body bgcolor="black">
	<%
							try{
								
							
							   int o=(int)session.getAttribute("log");
							   if(o==1)
							   {
							%>
							   <h3 style="color: white; margin-top: 80px;"><center>Invalid credentials...!!</center></h3>
							<%
							   }
							}catch(Exception ex){
								ex.printStackTrace();
							}
							%>
    <div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<div class="user_card">
			
				<div class="d-flex justify-content-center">
				
					<div class="brand_logo_container">
					
						<img src="images/logo.jpeg" class="brand_logo" alt="Logo">
					</div>
					
				</div>
				<div class="d-flex justify-content-center form_container">
				
					<form action="loginServlet" method="post" >
						<div class="input-group mb-3">
						
							<div class="input-group-append">
							
							   
							   
						
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							
							</div>
							<input type="email" name="email" class="form-control input_user" value="" placeholder="Email">
						</div>
						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" name="pass" class="form-control input_pass" value="" placeholder="password">
						</div>
						<div class="form-group">
							<div class="custom-control custom-checkbox">
								<input type="checkbox" class="custom-control-input" id="customControlInline">
								<label class="custom-control-label" for="customControlInline">Remember me</label>
							</div>
						</div>
							<div class="d-flex justify-content-center mt-3 login_container">
				 	<button type="submit" name="button" class="btn login_btn">Login</button>
				   </div>
					</form>
				</div>
		
				<div class="mt-4">
					<div class="d-flex justify-content-center links">
						Don't have an account? <a href="register.jsp" class="ml-2">Sign Up</a>
					</div>
					<div class="d-flex justify-content-center links">
					<!--  	<a href="#">Forgot your password?</a>-->
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>