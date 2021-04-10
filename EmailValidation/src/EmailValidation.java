import java.util.*;  

public class EmailValidation {
	String[] emailarray = new String[10];
	Scanner sc= new Scanner(System.in); 
	int length = 10; 
	public void EmailValidate(String search ){
		int check = 0 ; 
		for (int i=0; i<=length-1;i++) {
			if (search.equals(emailarray[i])) {
				System.out.println( search + " existed in list.");
				check = 1 ; 
			
			}
		}
		
		if (check == 0)
		{
			System.out.println( search + " not existed in list.");
			System.out.println( );
		}
		
		Retry() ;
	}
	
	public void list() {		
		
		for (int i=0; i<length;i++) {
			emailarray[i]= "Admin" + i +"@test.com";
		}
		
		System.out.println("Below list of email id");
		for (int i=0; i<length;i++) {
			System.out.println(i+1 + ". " +emailarray[i]);
		} 
	
	}
	
	public void KeyIn() {		
		System.out.println("Please key in the email ID to be search");  
		String search = sc.next();
		EmailValidate(search);
	}
	
	public void Retry() {		
		System.out.print("Do you want try again ? Y/N "); 
		char res = sc.next().charAt(0); 
		if (res == 'Y' ||res == 'y') {	
			System.out.println();
			KeyIn();
		} else
			System.out.print("Thanks for using. bye");  
		
	}
	
	public static void main (String[] args) {
		EmailValidation obj = new EmailValidation();
		obj.list();
		obj.KeyIn() ;
		
	}
	
}
