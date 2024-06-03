package DAO;

import java.sql.*;
import java.util.Date;

import DTO.Booking;

public class BookingDAO {
	
public int getBookingCount(int busno,Date date) throws SQLException, ClassNotFoundException {
		
		String query = "select count(passenger_name) from booking where bus_no=? and travel_date=?";
		Connection con = DBconnection.getconnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, busno);
		pst.setDate(2, sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
		
	}
	
	public void addBooking(Booking booking) throws SQLException, ClassNotFoundException {
		String query = "Insert into booking values(?,?,?,?)";
		Connection con = DBconnection.getconnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(booking.getDate().getTime());
		pst.setString(1, booking.getPassengerName());
		pst.setInt(2, booking.getBusNo());
		pst.setDate(3, sqldate);
		pst.setInt(4, booking.getBooking_id());
		pst.executeUpdate();
		
	}
	
	public int findTicket(int busno,int bookingid,Date date) throws SQLException, ClassNotFoundException {
		String query = "   select count(passenger_name) from booking where bus_no=? and booking_id=? and travel_date=?";
		Connection con = DBconnection.getconnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, busno);
		pst.setInt(2, bookingid);
		pst.setDate(3, sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	
	}
	
	public int delBooking(Booking booking) throws SQLException, ClassNotFoundException {
		String query = "   delete from booking where bus_no=? and booking_id=? and travel_date=?";
		Connection con = DBconnection.getconnection();
		java.sql.Date sqldate = new java.sql.Date(booking.getDate().getTime());
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, booking.getBusNo());
		pst.setInt(2, booking.getBooking_id());
		pst.setDate(3, sqldate);
		int rs = pst.executeUpdate();
		return rs;
	}
	
	

}
