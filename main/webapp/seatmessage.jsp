<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title id="title">Seat-Availabilities</title>
    <link rel="stylesheet" href="seatmessage.css">
    <link rel="shortcut icon" href="image/BusRev_icon.ico" type="image/x-icon">
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
                <div>
                    <h1><pre id="heading"> Seat-Availabilities! </pre></h1>

                    <div id="conformation">
                        <div id="holder">
                        <% HttpSession ses = request.getSession(); 
                           int check = (int) ses.getAttribute("check");
                           int seatcount = (int) ses.getAttribute("seatcount");
                           
                           if(check == 1){ %>
                          <p id="failerMessage">Currenty No Seats are available :( </p>
                          <%} else{%>
                            <div id="tablecontiner">
                            	<table id="busdetails">
                            		<tr>
                            		 	<td>No. of Seat's available:</td>
                            		</tr>
                            			<td id="seatcount"><%= seatcount %></td>
                            	</table>
								<% } %>
                                <!-- table area -->
                                
                            </div>
                  

                        </div>    
                    </div>
                 
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