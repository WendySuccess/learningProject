
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] Arr  = {10 , 20 , 5 , 70 , 60 ,80 , 100 , 90 , 200 , 700};
		 
		 for (int j = 0 ; j <Arr.length ; j ++) {
		    	if (Arr[j] != 0)
		    System.out.print(Arr[j] + " ");
		    }
		 System.out.println();
		 search(Arr  ,90);
		 search(Arr  ,9022  );
	}
	
	static int search(int[] Arr ,int searchint) {
		boolean check = false ;
		   for(int i = 0 ; i <Arr.length ; i ++) {  	
		if(Arr[i] == searchint) {
			 System.out.println("The number " +  searchint + " at number " + (i +1) + " of the array" );
			 check = true;
			 return i;
		}
		
	}
		   if (check == false)
				System.out.println("The number " +  searchint + " at number is not found in the array" );
		   return -1;

}
	
}
