import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Arr  = {10 , 20 , 5 , 70 , 60 ,80 , 100 , 90 , 200 , 700};
		Arrays.sort( Arr );  
		 for (int j = 0 ; j <Arr.length ; j ++) {
		    	if (Arr[j] != 0)
		    System.out.print(Arr[j] + " ");
		    }
		 System.out.println();
		 
		 search(Arr  ,90);

	}
	
	static void search(int[] Arr ,int searchint) {
		int start = 0;
		int length = Arr.length;
		int mid = mid(start, length);
		while(start  <= length ) {
			//System.out.println(start + Arr[mid]);
			if(Arr[mid] <searchint) {
				start = mid +1;
			}else if(Arr[mid] == searchint)
			{
				System.out.println(" found in " + Arr[mid]);
				break;
			}else
			{
				length = mid -1;
			}
			mid = mid(start, length);
		}
		
		
}
	static int mid(int first , int last ) {
				return (first + last)/2;
	}
	

}
