package busresv.edu.co;
import java.util.*;
import java.text.SimpleDateFormat;

public class booking {

    String passengername;
    int busno;
    Date date;

    booking() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter passenger name:");
        passengername = s.next();

        System.out.println("Enter bus number:");
        busno = s.nextInt();

        System.out.println("Enter date (dd-MM-yy):");
        String dateinput = s.next();

        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yy");
        try {
            date = dateformat.parse(dateinput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable() throws Exception{
    	
    	BusDAO busdao = new BusDAO();
    	bookingDAO bookingdao = new bookingDAO();
    	
        int capacity = busdao.getcapacity(busno);
     

        int booked = bookingdao.getBookedCount(busno,date);
        
        return booked < capacity;
    }
}
