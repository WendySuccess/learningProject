import java.util.Arrays;

public class ExponentialSeach {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Arr  = {10 , 20 , 5 , 70 , 60 ,80 , 100 , 90 , 200 , 700};
		Arrays.sort( Arr );  
		 for (int j = 0 ; j <Arr.length ; j ++) {
		    	if (Arr[j] != 0)
		    System.out.print(Arr[j] + " ");
		    }
		 System.out.println();
		 
		int outcome = exponentialSearch(Arr, Arr.length , 90);
		if (outcome <0 )
			System.out.println("No item");
		else
			System.out.println("Present in " + outcome);

	}

	private static int exponentialSearch(int[] arr, int length, int value) {
		// TODO Auto-generated method stub
		if(arr[0] == value) {
		return 0;
		}
		
		int i =1 ;
		while(i < length && arr[i]<= value ) {
			i = i *2;
		}
		
		return Arrays.binarySearch(arr, i/2,Math.min(i, length),value);
	}
	
}
