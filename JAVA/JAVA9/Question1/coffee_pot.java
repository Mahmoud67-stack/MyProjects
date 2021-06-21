
public class coffee_pot {

	String coffee_type="coffee";
	
	public synchronized String getState() {
		
		return coffee_type;
	}
	
	public synchronized void setState(String x) {
		coffee_type = x;
	}
	
	
	
}
