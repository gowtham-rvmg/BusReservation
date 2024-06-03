package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import DAO.BookingDAO;
import DTO.Booking;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Fticketcancellation")
public class Fticketcancellation extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Booking booking = new Booking();
		BookingDAO bookingdao = new BookingDAO();

		booking.setBusNo(Integer.parseInt(req.getParameter("TCbusno")));

		booking.setBooking_id(Integer.parseInt(req.getParameter("Tcbookingid")));
		
		String dateinput = req.getParameter("Tcbookeddate");
		HttpSession ses = req.getSession();
		
		Date date;
		//Date format
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
					try {
						date = dateformat.parse(dateinput);
						booking.setDate(date);
						

						try {
							Boolean status = booking.ticketstatus(booking.getBusNo(), booking.getBooking_id(), booking.getDate());
							if(status) {
								
										try {
											int DeleteStatus = bookingdao.delBooking(booking);
											
											if (DeleteStatus != 0) {
												ses.setAttribute("Deletestatus", 0);
												req.getRequestDispatcher("ticketcancellation_message.jsp").include(req, res);
												PrintWriter ps = res.getWriter();
												ps.print("cancelled");
												
																} 
										
											}catch (Exception e) {	
												e.printStackTrace();
											} 

										}
								else {
									ses.setAttribute("Deletestatus", 1);
									req.getRequestDispatcher("ticketcancellation_message.jsp").include(req, res);
									PrintWriter ps = res.getWriter();
									ps.print("cNancelled");
								}
							
							} catch (Exception e) {
								e.printStackTrace();
							}
					
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					
		
	}

}
