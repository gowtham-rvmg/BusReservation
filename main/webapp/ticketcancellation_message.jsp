<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ticket-Cancelation</title>
    <link rel="stylesheet" href="ticketcancellation_message.css">
</head>
<body>
    <div id = "container">
        <div id = "header">
            <span id="Title" class="white">
                <a href="home.jsp" target="_parent">Bus Reservation</a>
            </span>

            <div id="logo">
                <a href="home.jsp"><img src="image/BusRev_Logo.jpg" alt="Logo"></a>
            </div>    
        </div>

        <div id = "register">
            
            <div id = "innerContainer">
                 <!-- header part -->
                <div>
                    <h1><pre> Ticket Cancelation </pre></h1>
                    <div id="conformation">
                        <!-- body  -->
                        <div id="holder">
                         <% HttpSession ses = request.getSession(); %>
                         <% int success = (int) ses.getAttribute("Deletestatus"); 
                           
	                         	if(success == 0){%>
	                            	<p id="failerMessage">Booking Cancelled successfully!!</p>
	                            <% }
	                            else{%>
	                            	<p id="failerMessage">Sorry!! No such booking's found :(</p>
	                            <% }%>
                        
                        </div>    
                    </div>
                    <!-- footer part -->
                    <div id="social">
                       <ul  class="social">
                            <li><a href="https://www.instagram.com/gowtham_rvmg/">Instagram</a></li>
                                <li><a href="https://www.linkedin.com/in/gowtham-r-it5015?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app">LinkedIn</a></li>
                            <li><a href="https://github.com/gowtham-rvmg">Github</a></li>
                        </ul>
                    </div>
                </div>
                
            </div>
        </div>

    </div>
     
</body>
<script></script>
</html>