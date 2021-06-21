
public class customer extends person implements Runnable {
Rachel rachel;
	customer(Rachel R){
		super();
		
		Thread t1=new Thread(this);
		try {
			
		
		t1.start();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	customer(String nam,int ag ,Rachel R){
		
		name=nam;
		age=ag;
		rachel=R;
		
		Thread t1 =new Thread(this);
		try{
		t1.start();
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(rachel) {
		rachel.pour();
		System.out.println(name);
		}
		
	}
}
