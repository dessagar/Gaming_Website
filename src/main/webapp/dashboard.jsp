<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Game On | Dashboard</title>
 <link rel="shortcut icon" href="icon.jpg" type="image/x-icon" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
      crossorigin="anonymous"
    ></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/dashboard.css" />
    <link href='https://fonts.googleapis.com/css?family=Arbutus' rel='stylesheet'>
</head>
<body>
<%!String name; %>
<%name=(String)session.getAttribute("name"); %>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header div1" >
    
    
     <a class="navbar-brand " href="#" style="font-family: 'Arbutus';font-size: 7rem; margin-left: 0px;">Game On</a> 
    </div>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<span class="glyphicon glyphicon-user" style="font-size: 20px;">&nbsphello <%=name %></span> </a></li>
      <li><a href="index.html">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<span class="glyphicon glyphicon-log-out" style="font-size: 20px;">&nbspLog Out</span></a></li>
    </ul>
  </div>
</nav>
     
 <h1 style="font-family: 'Arbutus';font-size: 5rem; color: white;"><center>Games</center></h1>
    <div id="div1">
    
    </div>

    <div class="container">
      <div class="row">
        <div class="col-lg-3">
          <div class="boxall box">
            <!--<h2 style="text-align: center; font-size: 2rem;">🎲</h2> -->
             <img src="images/dice.jpeg" style="height: 70px; width: 90px; align-items: center;" alt="UI/UX design" />
            <h2 style="color: black;">The Dice Game</h2>
            <div class="btn btn-lg "><a href="dice.html"><button class="apply" >Play</button></a></div>
            
          </div>
        </div>
        <div class="col-lg-3">
          <div class="boxall box1">
            <!--<h2 style="text-align: center; font-size: 2rem;">🥁</h2>-->
             <img src="images/drum.jpeg" style="height: 70px; width: 90px; align-items: center;" alt="UI/UX design" />
            <h2 style="color: black">The Drum Kit</h2>
            <div class="btn btn-lg "><a href="drum.html"><button class="apply" >Play</button></a></div>
           
          </div>
        </div>
        <div class="col-lg-3">
          <div class="boxall box2">
            <!--<h2 style="text-align: center; font-size: 2rem;">🐍</h2>-->
             <img src="images/snake.jpeg" style="height: 70px; width: 90px; align-items: center;" alt="UI/UX design" />
            <h2 style="color: black">The Snake Game</h2>
            <div class="btn btn-lg "><a href="snake.html"><button class="apply" >Play</button></a></div>
           
          </div>
        </div>
		<div class="col-lg-3">
			<div class="boxall box3">
        <!--<h2 style="text-align: center; font-size: 2rem;">💡</h2>-->
         <img src="images/simon.jpeg" style="height: 70px; width: 90px; align-items: center;" alt="UI/UX design" />
				<h2 style="color: black">The Simon Game</h2>
        <div class="btn btn-lg "><a href="simon.html"><button class="apply" >Play</button></a></div>
			
			  </div>

		</div>
      </div>
    </div>

    <!-- <script>
		function display() {
			alert('Do You want to login our page?')
		}
	</script> -->
</body>
</html>