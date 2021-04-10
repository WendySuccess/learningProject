package Strings;

public class StringDemo{
	void test() {
		String test = "ABC";
		
		System.out.println("CharAt 2 " + test.charAt(2));
		System.out.println("compareTo ABCD " + test.compareTo("ABz"));
		System.out.println("concat 123 " + test.concat("123"));
		System.out.println("substring " + test.substring(2));
		
		StringBuffer sbr = new StringBuffer("This is a Buffer");
		System.out.println(sbr);
		
		StringBuilder sb = new StringBuilder();
		sb.append("This is a builder");
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		StringDemo obj = new StringDemo();
		obj.test();
	}

}
