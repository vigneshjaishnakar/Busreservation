
package busresv.edu.co;

import java.sql.*;

public class BusDAO {

    public void displaybusinfo() throws SQLException {

        String query = "select * from bus";
        Connection con = dbconnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println("Bus no: " + rs.getInt(1));

            if (rs.getBoolean(2)) {
                System.out.println("AC: Yes");
            } else {
                System.out.println("AC: No");
            }

            System.out.println("Capacity: " + rs.getInt(3));
        }
        
    }
    
    public int getcapacity(int id) throws SQLException{
    	String query = "select  capacity from bus where id="+id;
    	Connection con =dbconnection.getConnection();
    	Statement st = con.createStatement();
    	ResultSet rs=st.executeQuery(query);
    	rs.next();
    	
    	return rs.getInt(1);
    	
    }
}
