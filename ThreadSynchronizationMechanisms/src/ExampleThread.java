

public class ExampleThread implements Runnable{
	int i ; 
	String Test;

	ExampleThread(String test){
		Test= test;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		i = 0;
		while (true) {
			System.out.println("This is " + Test + " "+  i ++);
			if (i ==50) {
				break;
				
			}
			
		}
		
	}

}
