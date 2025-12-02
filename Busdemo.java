package busresv.edu.co;
import java.util.*;
public class Busdemo {

	public static void main(String[] args) {
		
		try {
		BusDAO busdao = new BusDAO();
		busdao.displaybusinfo();
		
		int userotp=1;
		Scanner s = new Scanner(System.in);
	

		
		while(userotp==1) {
			System.out.println("enter 1 for booking ,2 for exit");
		
			 userotp=s.nextInt();
			if(userotp==1) {
				booking booking = new booking();
				
				if(booking.isAvailable()) {
					bookingDAO bookingdao = new bookingDAO();
					bookingdao.addbooking(booking);
					System.out.println("booking is confirmed");
					
				}
				
				else {
					System.out.println("sorry bus is full , try another bus or date");
				}
			}
			
		}
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
