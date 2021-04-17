
public class ExampleFinal {
	public static void main (String[] args) {
		try {
		test(11);
		} catch (Exception e) {
			System.err.println("Error :" + e.getMessage() );
		}finally {
			System.out.println( "I want see here will run finnally !");
		} 
		}
	
	private static void test(int i) throws ArithmeticException{
		// TODO Auto-generated method stub
		throw new ArithmeticException ("This can not !");
	}

}
