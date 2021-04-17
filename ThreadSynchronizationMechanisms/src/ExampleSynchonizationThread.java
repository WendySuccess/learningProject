
public class ExampleSynchonizationThread implements Runnable{
	private static Object Lock1 = new Object();
	int i ; 
	String Test;
	
	
	ExampleSynchonizationThread(String test){
		Test= test;
	}
	
	public void run() {
		 System.out.println("ExampleSynchonizationThread ");
		// TODO Auto-generated method stub
		i = 0;
		synchronized(Lock1)
		{
			System.out.println("This is Synchonize " + Test + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println("This is Synchonize " + Test + "Done");
//		while (true) {
//			System.out.println("This is Synchonize " + Test + " "+ i ++);
//			if (i ==50) {
//				break;
//				
//			}
//			
//		}
		}
		
	}
}
