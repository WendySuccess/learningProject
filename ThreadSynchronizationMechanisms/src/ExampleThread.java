

public class ExampleThread implements Runnable{
	int i ; 
	String Test;

	ExampleThread(String test){
		Test= test;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is Synchonize " + Test + " ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("This is Synchonize " + Test + "Done");
//		i = 0;
//		while (true) {
//			System.out.println("This is " + Test + " "+  i ++);
//			if (i ==50) {
//				break;
//				
//			}
//			
//		}
		
	}

}
