class thrd extends Thread {
	
	@Override 
	public void run (){
		try { 
			//some code
			System.out.println("Test");
		}
			catch (Exception e) {System.out.println(e);}
	}
	
	
}


public class MultithreadingByExtending {
	
	public static void main(String[] args) {
		thrd object = new thrd();
		object.start();
		 }

}
