import java.util.InputMismatchException;
import java.util.Scanner;
public class ImplimentExceptionHandlers {
	static Scanner sc2= new Scanner(System.in);
	static Scanner sc= new Scanner(System.in); 
	
	static double balanceInBank = 0;
	public static void main (String[] args) {
		balanceInBank = 2000.00;
		System.out.println("Welcome to my bank" );
		System.out.println("Your current balance : " + balanceInBank);
		
		KeyIn();
	
		}
	
	static void WithdrawMoney(double amounttowithdraw) throws  BalanceExceptionHandler    {
		if(amounttowithdraw > balanceInBank) {
			throw new  BalanceExceptionHandler    ("You are not able to take $" + amounttowithdraw);
		}
		else 
		System.out.println("Please take your amount ");
		balanceInBank = balanceInBank - amounttowithdraw;
		System.out.println("Your current balance :" + (balanceInBank ));
	}
	
	public static void KeyIn() {	
		
		System.out.println("Please key in the amount you want to withdraw");  
       int stop = 0; 
		try {
			double res = 0;
			res = sc.nextDouble(); 
			try{  
			WithdrawMoney(res );
			 }catch (Exception m) 
			{System.err.println("Error " + m );} 
		}catch (InputMismatchException e ) 
		{System.err.println("Error " + "You should key in the number. "  );
		stop = 1; 
		System.out.print("Thanks for using. bye"); 
		}catch (Exception e ) 
		{System.err.println("Error " + e );
		}
		finally {
			System.out.println("Thank for using our service");  
			
		}
		if (stop == 0)
		Retry();
	}
	
	public static void Retry() {		
		System.out.print("Do you want continue ? Y/N "); 
		
		char res2 = sc2.next().charAt(0); 
		if (res2 == 'Y' ||res2 == 'y') {	
			System.out.println();
			KeyIn();
		} else
			System.out.print("Thanks for using. bye");  
		
	}
	
}
