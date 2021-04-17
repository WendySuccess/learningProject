
public class ExampleThrows {
	public static void main (String[] args) {
		try {
		test(11);
		} catch (Exception e) {
			System.err.println("Error :" + e.getMessage() );
		}
		}
	
	private static void test(int i) throws ArithmeticException{
		// TODO Auto-generated method stub
		throw new ArithmeticException ("This can not !");
	}


}
