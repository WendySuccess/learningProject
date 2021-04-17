import java.io.File;
import java.util.Scanner;


public class ExampleFileHandling {
	static Scanner sc= new Scanner(System.in); 
	public static void main (String[] args) {
		KeyIn();
		
		
	}
	
	public static void KeyIn() {	
		System.out.println("Please Select the action you prefer. A,B or C");  
		System.out.println("1. read the Log File - A");  
		System.out.println("2. write the log file - B");  
		System.out.println("3. Append the log file - C");  
		
		char res = sc.next().charAt(0); 
		
		LogFile obj = new LogFile();
		
		switch (res )
		{
		case 'A':
			obj.readFile();
		case 'B':
			obj.writeFile();
		case 'C':
			obj.appendFile() ;
		default: 
			//System.out.println("Invalid selection.");  
			Retry();
		}
		
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
