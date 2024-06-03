<%@page import="DTO.Booking"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success!!</title>
    <link rel="shortcut icon" href="image/BusRev_icon.ico" type="image/x-icon">
    <link rel="stylesheet" href="ticketstatusSUCCESS.css">
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
                    <h1><pre> Ticket-Status </pre></h1>

                    <div id="conformation">
                        <div id="holder">
                            <p id="failerMessage"></p>
                            <div id="table" >
                                <table id="passengerdetails">
                                <% HttpSession ses = request.getSession(); %>
                                <% Booking booking = (Booking) ses.getAttribute("booking"); %>
                                    <tbody>
                                        <element>
                                        	<tr>
                                        		<td>Passenger Name:</td>
                                        		<td id="Tpassengername"> <%= booking.getPassengerName() %></td>
                                        	</tr>
                                        </element>
                                        <tr>
                                            <td>Bus No:</td>
                                            <td id="Tbusno"><%= booking.getBusNo() %></td>
                                        </tr>
                                        <tr>
                                            <td>Travel Date:</td>
                                            <td id="Ttraveldate"><%= ses.getAttribute("normaldate") %></td>
                                        </tr>
                                        <tr>
                                            <td>Booking Id:</td>
                                            <td id="Tbookingid"><%= booking.getBooking_id()%></td>
                                        </tr>
                                    </tbody>
                                </table>
                                <div id="buttonholder">
                                    <button id="download" onclick="buttonholder()">Download</button>
                                </div>
                            </div>
                        </div>
                        <div id="buttonholder">
                            
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
<script src="ticketstatusSUCCESS.js"></script>
</html>