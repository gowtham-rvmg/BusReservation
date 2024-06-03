<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add-Bus</title>
    <link rel="shortcut icon" href="image/BusRev_icon.ico" type="image/x-icon">
    <link rel="stylesheet" href="newbusinfo.css">
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
                    <h1><pre> Add New Bus </pre></h1>
                    <div id="conformation">
                        <!-- body  -->
                        <form id="holder" action="Fnewbusinfo">
                         
                            <table id="tablecontiner">
                                <!-- table area -->
                                <tr>
                                    <td><label for="ABbusno">Bus No:</label></td>
                                    <td><input type="number" min="0" name="ABbusno" id="ABbusno" required="required"></td>
                                </tr>
                                <tr>
                                    <td><label for="ABac">Ac:</label></td>
                                    <td id="ABac">
                                        <input type="radio" name="ABac" id="true" required="required">
                                        <label for="true">True</label>
                                        <input type="radio" name="ABac" id="False" required="required">
                                        <label for="False">False</label>
                                    </td>
                                </tr>
                                <tr>
                                    <td><label for="ABcapacity">Capacity:</label></td>
                                    <td><input type="text" name="ABcapacity" id="ABcapacity" required="required"></td>
                                </tr>
                                <tr>
                                    <td><label for="ABdrivername">Driver Name:</label></td>
                                    <td><input type="text" name="ABdrivername" id="ABdrivername" required="required"></td>
                                </tr>
                                <tr>
                                    <td><label for="ABcontact">Contact:</label></td>
                                    <td><input type="text" name="ABcontact" id="ABcontact" required="required"></td>
                                </tr>
                                
                            </table>

                            <input type="submit" id="ABsubmit">
                  

                        </form>    
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
<script src="newbusinfo.js"></script>
</html>