import java.io.File;
import java.util.Scanner;

public class RepositoriesPrototype {
	private static final String String = null;
	static Scanner sc= new Scanner(System.in); 
	static File currentDir = new File("./FileStored");
	public static void main(String[] args) {
		welcome();
		Repositories obj = new Repositories();
		Menu(obj);
		
	}

	//welcome screen
	static void welcome(){
		System.out.println("*************************File Repositories Management System*************************");
		System.out.println("                              Company Lockers Pvt. Ltd.                             ");
		System.out.println("                              Developer: Soon Ming Poo                              ");

	}
	
	public static void Menu(Repositories obj ) {
		System.out.println("*************************************************************************************");
		System.out.println();
		obj.viewAllfile(currentDir);
		System.out.println("*********************************** Main Menu ***************************************");
		System.out.println("1. Add New File ");  
		System.out.println("2. Delete Existing File");  
		System.out.println("3. Search From Existing Files");  
		System.out.println("4. Exit Program");  
		System.out.println("*************************************************************************************");
		System.out.println();
		System.out.print("Enter Your Choice : ");  
		char res = sc.next().charAt(0); 

		switch (res )
		{
		case '1' :
			obj.addfile(currentDir);
		    break;
		case '2' :
			obj.deletefile(currentDir);
		    break;
		case '3' :
			obj.seachfile(currentDir) ;
		    break;
		case '4' :
			ExitProgram();
		    break;
		default: 
			//System.out.println("Invalid selection.");  
			
		}
		Retry(obj, res);
	}
	
	public static void Retry(Repositories obj , char res) {		
		switch (res )
		{
		case '1' :
			System.out.println("1. Add More File ");  
		    break;
		case '2' :
			System.out.println("1. Delete More Existing File");  
		    break;
		case '3' :
			System.out.println("1. Search More Files"); 
		    break;
		default: 
			System.out.println("Invalid selection.");  	
		}
		
		System.out.println("2. Back to Main Menu");  
		System.out.println("3. Exit Program");  
		//System.out.print("Do you want try again ? Y/N "); 
		char res1 = sc.next().charAt(0); 

		switch (res1 )
		{
		case '1' :
			switch (res )
			{
			case '1' :
				obj.addfile(currentDir);  
			    break;
			case '2' :
				obj.deletefile(currentDir);
			    break;
			case '3' :
				obj.seachfile(currentDir) ;
			    break;
			default: 
				System.out.println("Invalid selection.");  	
			}
		    break;
		case '2' :
			Menu(obj);
		    break;
		case '3' :
			ExitProgram();
		    break;
		default: 
			//System.out.println("Invalid selection.");  
			
		}
		Retry(obj, res);
	}
	
	public static void ExitProgram() {
		System.out.print("Thank you for using. See You Soon");  
		System.exit(1);
	}

}
