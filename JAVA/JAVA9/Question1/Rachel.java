
public class Rachel extends person{

	coffee_pot cp;
	
	Rachel(){
		super("Rachel", 69);
		cp=new coffee_pot();
		
	}
	
	
	 public synchronized void pour() {
		
		if(cp.getState().equals("coffee"))
			cp.setState("cappucino");
		else 
		 cp.setState("coffee");
		System.out.print("Pouring "+cp.getState()+" to ");
		
		
	}
}
