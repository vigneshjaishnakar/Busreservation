package busresv.edu.co;
import java.util.Date;
import java.sql.*;
public class bookingDAO {

	public int getBookedCount(int busno,Date date) throws Exception {
		
		String query = "select count(passenger_name) from booking where bus_no=? and travel_date=?";
		Connection con=dbconnection.getConnection();
		PreparedStatement pst = con.prepareCall(query);
		
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1,busno);
		pst.setDate (2,sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
		
	}
	
	public void addbooking(booking booking) throws Exception{
		
		String query = "insert into booking values(?,?,?)";
		Connection con = dbconnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		pst.setString(1,booking.passengername);
		pst.setInt(2, booking.busno);
		pst.setDate(3, sqldate);
		
		pst.executeUpdate();
		
	}
}
