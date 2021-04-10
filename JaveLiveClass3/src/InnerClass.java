
public class InnerClass {
	private int data = 30;
	
	class Student
	{
		void test() {
		 System.out.print("This is a new student" +data);
		}
	}
	
	public static void main (String args[]) {
		InnerClass obj = new InnerClass();
		InnerClass.Student in = obj.new Student();
		in.test();
		
	}
	
}
