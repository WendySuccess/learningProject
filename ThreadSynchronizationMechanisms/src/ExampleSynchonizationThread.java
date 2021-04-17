
public class ExampleSynchonizationThread implements Runnable{
	int i ; 
	String Test;
	
	ExampleSynchonizationThread(String test){
		Test= test;
	}
	
	public void run() {
		 System.out.println("ExampleSynchonizationThread ");
		// TODO Auto-generated method stub
		i = 0;
		synchronized(this)
		{
		while (true) {
			System.out.println("This is Synchonize " + Test + " "+ i ++);
			if (i ==50) {
				break;
				
			}
			
		}
		}
		
	}
}
