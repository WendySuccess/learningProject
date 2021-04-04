import java.util.*;  
public class TypeCasting {

	
	public static void main(String[] args) {
	
		//implicit type conversion (type promotion )
		 System.out.println("Implicit Type Conversion  " );
		 
		 char a = 'a' ;
		 System.out.println("Value of a = " + a);
		 
		 int b = a ;
		 System.out.println("Value of b = " + b);
		 
		 float c = a ;
		 System.out.println("Value of c = " + c);
		 
		 long  d = a ;
		 System.out.println("Value of d = " + d);
		 
		 double e = a ;
		 System.out.println("Value of e = " + e);
		 
		 
		 System.out.println("\n");
		 
		 System.out.println("Explicit Type Conversion  " );
		 
		 double x = (double) 45.5 ;
		 System.out.println("Value of x = " + x);
		 
		 float y = (float) x ;
		 System.out.println("Value of y = " + y);
		 
		 
//		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
//		System.out.print("Enter a string: ");  
//		String str= sc.nextLine();              //reads string   
//		System.out.print("You have entered: "+str+ "\n" );        
//
//		try{
//		    int i = Integer.parseInt(str);
//		 
//		    System.out.println("String to int: " + i);
//		    
//		}catch(NumberFormatException nfe){
//		    System.out.println("Invalid number");
//		
//	}
}
	
}
