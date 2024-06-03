<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="DAO.DBconnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bus-Details</title>
    <link rel="stylesheet" href="busdetails.css">
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
                    <h1><pre> Bus - Availabilities! </pre></h1>

                    <div id="conformation">
                        <div id="holder">
                        <%try{
                        	String query = "select count(id) from bus_details";
                    		Connection con = DBconnection.getconnection();
                    		Statement st = con.createStatement();
                    		ResultSet rs = st.executeQuery(query);
                    		rs.next();
                    		if( rs.getInt(1) == 0) {%>
                    			<p id="failerMessage">Currenty No Buses are available :( </p>
                    		
	                    		<%}
	                   		 } catch (Exception e) {
								
	                   			 e.printStackTrace();
	                   			 
								} %>

                    		
                    		<div id="tablecontiner">
                            <% try {
                            	String query = " select * from bus_details";
                            	Connection con = DBconnection.getconnection();
                        		Statement st = con.createStatement();
                    			ResultSet rs = st.executeQuery(query);
                    			while(rs.next()) {%>
                            	<table id="busdetails">
                            		<tr>
                            			<td>Bus No:</td>
                            			<td id="Bbusno"> <%= rs.getInt(1) %></td>
                            		</tr>
                            		<tr>
                            			<td>Ac:</td>
                            			<td id="Bac"> <%= rs.getBoolean(2) %></td>
                            		</tr>
                            		<tr>
                            			<td>Capacity:</td>
                            			<td id="Bcapacity"><%= rs.getInt(3) %></td>
                            		</tr>
                            		<tr>
                            			<td>Driver Name:</td>
                            			<td id="Bdrivername"><%= rs.getString(4) %></td>
                            		</tr>
                            		<tr>
                            			<td>Contact:</td>
                            			<td id="Bcontact"><%= rs.getInt(5) %></td>
                            		</tr>
                            	</table>
                            	<% }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} %>

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
<script src="busdetails"></script>
</html>