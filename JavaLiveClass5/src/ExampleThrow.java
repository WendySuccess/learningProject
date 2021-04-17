
public class ExampleThrow {
	public static void main (String[] args) {
		test(11);
		}
		
	static void test(int age) {
		if(age < 10 ) {
			throw new ArithmeticException ("Cannot to allowed age lower than " + age );
		}
		else 
			
		System.out.println("Everything okay !");
	}
	
	
	
}
