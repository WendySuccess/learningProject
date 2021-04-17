
class thrd2 implements Runnable {
 public void run() {
		try { 
			//some code
			System.out.println("Test");
		}
			catch (Exception e) {System.out.println(e);}
}
 
}


public class MultithreadingByRunnable {
	public static void main(String[] args) {
		Thread object = new Thread(new thrd());
		object.start();

		 }
}
