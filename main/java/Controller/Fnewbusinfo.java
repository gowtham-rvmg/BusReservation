package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import DAO.BusDAO;
import DTO.Bus;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Fnewbusinfo")
public class Fnewbusinfo extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		Bus bus = new Bus();
		BusDAO busdao = new BusDAO();
		
		bus.setBusno(Integer.parseInt(req.getParameter("ABbusno")));
		
		bus.setAc(Boolean.parseBoolean(req.getParameter("ABac")) );
		
		bus.setCapacity(Integer.parseInt(req.getParameter("ABcapacity")));
		
		bus.setDrivername(req.getParameter("ABdrivername"));
		
		bus.setDriver_Contact(Integer.parseInt(req.getParameter("ABcontact")));
		
		HttpSession ses = req.getSession();
		try {
			busdao.addbusinfo(bus);
			ses.setAttribute("success", 0);
			req.getRequestDispatcher("newbusinfo_message.jsp").include(req, res);
			PrintWriter ps2 = res.getWriter();
			ps2.print("Bus information successfully added to DB");
			
		} catch (Exception e) {
			ses.setAttribute("success", 1);
			req.getRequestDispatcher("newbusinfo_message.jsp").include(req, res);
			
			e.printStackTrace();
		} 
		
		System.out.println("Bus information successfully added to DB");
		PrintWriter ps2 = res.getWriter();
		ps2.print(bus.getBusno());
	}

}
