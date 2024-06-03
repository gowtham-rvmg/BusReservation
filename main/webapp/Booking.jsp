
<%@page import="DAO.DBconnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Booking</title>
    <link rel="shortcut icon" href="image/BusRev_icon.ico" type="image/x-icon">
    <link rel="stylesheet" href="Booking.css">
</head>
<body onload="Tdate()">
    <div id = "container">
        <div id = "header">
            <span id="Title" class="white"><a href="home.jsp" target="_parent">Bus Reservation</a></span>
            <div id="logo"><a href="home.jsp"><img src="image/BusRev_Logo.jpg" alt="Logo"></a></div>
        </div>

        <div id = "register">
            
            <div id = "innerContainer">
                <div>
                    <h1><pre> Please enter
your Details!!</pre></h1>
                        <form action="FBooking" id="details" method="get">
                        
                            <ul style="list-style-type: none;" id="labellist">
                                <li>
                                    <label for="passengername">Passenger name: </label>
                                </li>
                                
                                <li>
                                    <label for="busNo">Bus No: </label>   
                                </li>
                                <li>
                                    <label for="traveldate">Travel Date: </label>    
                                </li>
                            </ul>
                            <ul id="inputlist">
                                <li><input id="passengername" type="text" name="passengername" required="required"> <br></li>
                                <li>
                                    <select name="busNo" id="busNo">
                                    <% try {
                            	String query = " select id from bus_details";
                            	Connection con = DBconnection.getconnection();
                        		Statement st = con.createStatement();
                    			ResultSet rs = st.executeQuery(query);
                    			while(rs.next()) {%>
                                        <option ><%= rs.getInt(1)%></option>
                                          <% }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} %>
                                    </select>
                                </li>
                                <li><input id="traveldate" type="date" name="traveldate" min="" required="required"> <br></li>
                            </ul>
                            <div >
                                <input type="submit" value="submit" id="submission">
                            </div>

                        </form>

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
<script>
	function Tdate(){
		   
		   let date = new Date().toISOString().split('T')[0];
		   document.getElementById("traveldate").setAttribute("min",date);
		   
		}
</script>

</html>