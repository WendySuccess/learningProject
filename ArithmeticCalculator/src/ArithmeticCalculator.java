import java.util.*;  
public class ArithmeticCalculator {
	
	private static double num1;
	private static double num2; 
	private static char ope ;
	static calculator obj = new calculator();
	static Scanner sc= new Scanner(System.in); 
	static Boolean start= true; 
	public static void main(String[] args) {
		
		
		do {
		startcal ();
		start = false;
		System.out.print("Do you want start again ? Y/N ");  
		char res = sc.next().charAt(0); 
		if (res == 'Y' ||res == 'y') {	
			start = true;
			System.out.print("\n");
		} else
			System.out.print("Thanks for using. bye");  
		}while (start == true) ;


}
	

	static void startcal () {

		System.out.print("Enter a first number: ");  
		num1 = sc.nextDouble(); 
		
		System.out.print("Enter a second number: ");  
		num2 = sc.nextDouble();     

		System.out.print("Choose a operation (+, -, *, /) : "); 
		ope = sc.next().charAt(0);
		obj.display(num1,num2,ope);
	}
	
}

class calculator {
	
	void display(double num1 , double num2 , char operator) {
		
		double Answer = 0;
		switch(operator) {
        case '+': Answer = num1 + num2;
           break;
        case '-': Answer = num1 - num2;
           break;
        case '*': Answer = num1 * num2;
           break;
        case '/': Answer = num1 / num2;
           break;
     default: System.out.printf("Error! Please Enter correct operator. ");
		}
		System.out.print("Output: "+num1+ " "+ operator + " "+  num2 + " = "+ Answer + "\n" );  

	}
	
}