
import java.util.Scanner;


public class ExampleFileHandling {
	static Scanner sc= new Scanner(System.in); 
	public static void main (String[] args) {
		System.out.println("- Welcome to Log Management - ");
		System.out.println();
		KeyIn();
		
		
	}
	
	public static void KeyIn() {	
		System.out.println("---------------------------------------------");
		System.out.println("Please Select the action you prefer. A,B or C");  
		System.out.println("1. read the Log File - A");  
		System.out.println("2. Overwrite the log file - B");  
		System.out.println("3. Append the log file - C");  
		System.out.println();
		char res = sc.next().charAt(0); 
		
		LogFile obj = new LogFile();
		
		switch (res )
		{
		case 'A' :case 'a' :case '1' :
			obj.readFile();
		    break;
		case 'B' :case 'b' :case '2' :
			obj.writeFile();
		    break;
		case 'C' :case 'c' :case '3' :
			obj.appendFile() ;
		    break;
		default: 
			//System.out.println("Invalid selection.");  
			
		}
		Retry();
	}
	
	public static void Retry() {		
		System.out.print("Do you want try again ? Y/N "); 
		char res = sc.next().charAt(0); 
		if (res == 'Y' ||res == 'y') {	
			System.out.println();
			KeyIn();
		} else
			System.out.print("Thanks for using. bye");  
		
	}

}
