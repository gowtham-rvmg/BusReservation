package DTO;

public class Bus {
	
	private int Busno;
	private boolean Ac;
	private int Capacity;
	private String Drivername; 
	private int Driver_Contact;

	//constructor
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public Bus(int busno, boolean ac, int capacity,String drivername,int driver_Contact) {
		this.Busno = busno;
		this.Ac = ac;
		this.Capacity = capacity;
		this.Drivername = drivername;
		this.Driver_Contact = driver_Contact;
	}

	//get set 
	public int getBusno() {
		return Busno;
	}

	public void setBusno(int busno) {
		Busno = busno;
	}

	public boolean isAc() {
		return Ac;
	}

	public void setAc(boolean ac) {
		Ac = ac;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	
	public String getDrivername() {
		return Drivername;
	}

	public void setDrivername(String drivername) {
		Drivername = drivername;
	}

	public int getDriver_Contact() {
		return Driver_Contact;
	}

	public void setDriver_Contact(int driver_Contact) {
		Driver_Contact = driver_Contact;
	}
	
	
	


}
