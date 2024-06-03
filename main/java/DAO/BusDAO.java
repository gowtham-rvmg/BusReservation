package DAO;

import java.sql.*;

import DTO.Bus;

public class BusDAO {
	
	public void busdisplayinfo(){
		String query = " select * from bus_details";
		
		try {
			Connection con = DBconnection.getconnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.print("Bus.No : "+rs.getInt(1)+",");
				System.out.print("Ac : "+rs.getBoolean(2)+",");
				System.out.print("Capacity : "+rs.getInt(3)+",");
				System.out.print("Driver_Name : "+rs.getString(4)+",");
				System.out.print("Contact : "+rs.getInt(5)+"\n");
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("------------------------------------");
	}
	
	public int getCapacity(int busNo) throws SQLException, ClassNotFoundException {
		String query = " select capacity from bus_details where id="+busNo;
		Connection con = DBconnection.getconnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
		
		
	}
	
	public void addbusinfo(Bus bus) throws SQLException, ClassNotFoundException {
		String query = "insert into bus_details values(?,?,?,?,?)";
		Connection con = DBconnection.getconnection();
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1,bus.getBusno());
		pst.setBoolean(2, bus.isAc());
		pst.setInt(3,bus.getCapacity());
		pst.setString(4, bus.getDrivername());
		pst.setInt(5, bus.getDriver_Contact());
		pst.executeUpdate();
		
		
		
		
	}


}
