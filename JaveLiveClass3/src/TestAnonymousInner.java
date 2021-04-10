//Annoymous Inner Class

abstract class Person {
	abstract void eat();
	
}

public class TestAnonymousInner {
 public static void main(String args[]) {
	 Person p = new Person() {
		 void eat() {
		 System.out.println("nice fruts");
	 }
	 
 };
 p.eat();
	 
 }}

class TestAnnoymousInner$1 extends Person{
	TestAnnoymousInner$1(){}
	
	void eat()
	{
		System.out.println("nice fruts2");
	}
}

