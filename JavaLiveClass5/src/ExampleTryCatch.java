
public class ExampleTryCatch {


	public static void main (String[] args) {
	test();
	}
	
	static void test() {
		try {
			int i = 10/0;
		    System.out.println("See the message print or not  :)"); //will not print out because of the exception catch 
		}catch(ArithmeticException ex ) {
			System.err.println("Error :" + ex.getMessage() );
		}
		
		try {
			String  Array[] = new   String [2] ;
			  System.out.println( Array[3]);	
			  System.out.println("See the message print or not  :)"); //will not print out because of the exception catch 
		}catch(ArithmeticException ex ) {
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.err.println("Error :" + e.getMessage() );
		}
		
	}
	
}
