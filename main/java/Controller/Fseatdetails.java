package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import DTO.Booking;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Fseatdetails")
public class Fseatdetails extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	 
		Booking booking = new Booking();

		booking.setBusNo(Integer.parseInt(req.getParameter("SAbusno")));
		
		String dateinput = req.getParameter("SAdate");
		
		HttpSession ses = req.getSession();

		Date date;
		//Date format
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
					try {
						date = dateformat.parse(dateinput);
						booking.setDate(date);
						

							try {
								int seatAvailabilities = booking.displaySeats(booking);
								if (seatAvailabilities>0) {
									ses.setAttribute("seatcount", seatAvailabilities);
									ses.setAttribute("check", 0);								
									req.getRequestDispatcher("seatmessage.jsp").forward(req, res);
									PrintWriter ps = res.getWriter();
									ps.print(seatAvailabilities);
									
								} else {
									ses.setAttribute("check", 1);
									req.getRequestDispatcher("seatmessage.jsp").forward(req, res);

								}
								
								} catch (Exception e) {
									
									PrintWriter ps = res.getWriter();
									ps.print("no1");
									e.printStackTrace();
								}
								
						} catch (Exception e) {
							
							PrintWriter ps = res.getWriter();
							ps.print("no");
							
							e.printStackTrace();
						}
			
						}
					
			}
