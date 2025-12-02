package busresv.edu.co;

public class Bus {

		
		int busno;
		boolean ac;
		int capacity;
		
		Bus(int busno,boolean ac,int capacity){
			this.busno=busno;
			this.ac=ac;
		    this.capacity=capacity;
		}
		
		public int getCapacity() {
			return capacity;
			}
		public void setCapacity(int capacity) {
				capacity=capacity;
			}
		
		public boolean getac() {
			return ac;
		}
		public void setac(int ac) {
			ac=ac;
		}
		
		public int getbusno() {
			return busno;
		}
		
		public void setbusno() {
			busno = busno;
		}
		
		
		}

	