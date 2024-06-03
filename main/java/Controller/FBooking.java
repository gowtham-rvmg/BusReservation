package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import DAO.*;
import DTO.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/FBooking")
public class FBooking extends HttpServlet {
	


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//Booking BookingDAO --> Package
		Booking booking = new Booking();
		BookingDAO bookingdao = new BookingDAO();
		req.setAttribute("booking", booking);
		
		booking.setPassengerName(req.getParameter("passengername"));
		
		booking.setBusNo(Integer.parseInt(req.getParameter("busNo")));
		
		String dateinput = req.getParameter("traveldate");
		
		HttpSession ses = req.getSession();

		
		
		
		Date date;
		//Date format
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
					try {
						date = dateformat.parse(dateinput);
						
						booking.setDate(date);
						
						java.sql.Date sqldate = new java.sql.Date(booking.getDate().getTime());
						ses.setAttribute("normaldate", sqldate);
						
						try {
							if (booking.isAvailable()) {
								bookingdao.addBooking(booking);
								
								ses.setAttribute("booking",booking);
								req.getRequestDispatcher("ticketstatusSUCCESS.jsp").include(req, res);
								PrintWriter ps1 = res.getWriter();
								ps1.print("booked..");
									}
							else {
								req.getRequestDispatcher("ticketstatusFail.jsp").include(req, res);
								PrintWriter ps2 = res.getWriter();
								ps2.print("Nbooked..");
							}
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						} catch (SQLException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
						
					} catch (ParseException e) {
						e.printStackTrace();
					}
				
	}

}
