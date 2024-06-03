package DTO;


import java.sql.SQLException;
import java.util.Date;

import DAO.*;

public class Booking {
	
	
	private String passengerName;
	private int busNo;
	private Date date;
	private int booking_id;
	private int booked;
	private Boolean isDatecorrect = true;


	//empty constructor
		public Booking(){
			
		}
	 
	 //constructors
	 
	 public Booking(String passengerName, int busNo, Date date, int booking_id, int booked, Boolean isDatecorrect) {
		this.passengerName = passengerName;
		this.busNo = busNo;
		this.date = date;
		this.booking_id = booking_id;
		this.booked = booked;
		this.isDatecorrect = isDatecorrect;
	}
	

	//getters  setters
			public int getBooking_id() {
				return booking_id;
			}
			
			public void setBooking_id(int booking_id) {
				this.booking_id = booking_id;
			}
			
			 public String getPassengerName() {
					return passengerName;
				}

				public void setPassengerName(String passengerName) {
					this.passengerName = passengerName;
				}


				public int getBusNo() {
					return busNo;
				}


				public void setBusNo(int busNo) {
					this.busNo = busNo;
				}


				public Date getDate() {
					return date;
				}


				public void setDate(Date date) {
					this.date = date;
				}
				
				public Boolean getIsDatecorrect() {
					return isDatecorrect;
				}


				public void setIsDatecorrect(Boolean isDatecorrect) {
					this.isDatecorrect = isDatecorrect;
				}
				
		
	
	
	public boolean isAvailable() throws SQLException, ClassNotFoundException {
		
		
		BusDAO busdao = new BusDAO();
		BookingDAO bookingdao = new BookingDAO();
		
		int capacity = busdao.getCapacity(busNo);
		
		booked = bookingdao.getBookingCount(busNo,date);
		
		setBooking_id(booked+1101);
		
		return capacity>booked;
	}
	
	public boolean ticketstatus(int busno,int bookingId,Date date ) throws SQLException, ClassNotFoundException {
		BookingDAO bookingdao = new BookingDAO();
		
		int Status = bookingdao.findTicket(busno, bookingId, date);
		
		return Status>0;
		
		
		
	}
	
	public int displaySeats(Booking booking) throws SQLException, ClassNotFoundException {
		BusDAO busdao = new BusDAO();
		BookingDAO bookingdao = new BookingDAO();
		
		int capacity = busdao.getCapacity(booking.getBusNo());
		
		booked = bookingdao.getBookingCount(booking.getBusNo(),booking.getDate());
	
		if (capacity>booked) {
			
	    	return capacity-booked;	
	    	
		}
		else {
			return 0;
		}
	}
	
	

}
