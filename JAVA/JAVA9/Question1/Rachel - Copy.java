
public class Rachel extends person{

	coffee_pot cp;
	
	Rachel(){
		super("Rachel", 69);
		cp=new coffee_pot();
		
	}
	
	
	 public  void pour() {
		synchronized(cp) {
		if(cp.coffee_type.equals("coffee"))
			cp.coffee_type="cappucino";
		else 
		 cp.coffee_type="coffee";
		System.out.print("Pouring "+ cp.coffee_type+ " to ");
		
		
	}
}
}
