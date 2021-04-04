
public class AccessModifiers {
	public static void main(String[] args) {
		 System.out.println(testprivate());
		 System.out.println(testpublic());
		 System.out.println(testprotected());
	}
	
	private static String testprivate() {
		String a = "test private";
		return a;
	}
	
	public static  String testpublic() {
		String a = "test public";
		return a;
	}
	
	protected  static  String testprotected() {
		String a = "test protected";
		return a;
	}
}
