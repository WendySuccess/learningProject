
public class ReturnType {
	public static void main(String[] args) {
	
		 System.out.println(test(1,2));
		 System.out.println(test(1.01,2.14));
		 System.out.println(test(1,2.14));
		 System.out.println(test(1.01,1,1));
	
	}
	
	public static int test(int a, int b) {
		b = a+ b ;
		return b;
	}
	
	public static float test(double a, double b) {
		b = a+ b ;
		return (float) b;
	}
	
	public static float test(int a, double b) {
		b = a+ b ;
		return (float) b;
	}
	
	public static float test(double a, int b, int c) {
		b = (int) (a+ b+c) ;
		return b;
	}
}
