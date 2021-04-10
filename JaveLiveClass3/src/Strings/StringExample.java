package Strings;

public class StringExample {

	public static void main (String[] args) {
		String str1 = "Noah";
		String str2 = new String ("Args");
		
		char[] ch = {'a', 'k', 'a'};
		String s = new String (ch);
		
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.substring(6,9));
		System.out.println(s.replace(' ', '_'));
		System.out.println(s.indexOf('a', 5));
		System.out.println(s.toUpperCase());
	}
}
