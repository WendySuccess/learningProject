
public class IncreasingSubsequence {
	public int n =100; 

	public static void main (String[] args) {
	
		 int[] Arr  = {10 , 20 , 5 , 70 , 60 ,80 , 100 , 90 , 200 , 700};
		 
		 for (int j = 0 ; j <Arr.length ; j ++) {
		    	if (Arr[j] != 0)
		    System.out.print(Arr[j] + " ");
		    }
		 System.out.println();
		 System.out.println("Full Length :" +Arr.length);
		 IncreasingSubsequence obj = new IncreasingSubsequence();
		 System.out.println("Below show each combination of sequence!" );
		 obj.test(Arr);
		
	}
	

	private int LengthofSeq(int[] Arr , int start) {
		int prev = 0 ;
		int Length = 1; 
		int size = Arr.length;
		int[] Test  = new int[n];
		Test[0] = Arr[start];
		prev = Test[0];
	    for(int i = start +1 ; i <size ; i ++) {  	
	      		if ( Arr[i] > prev) {
	      			Test[Length] = Arr[i];
	      			Length += 1; 
	      			prev = Arr[i];
	      		}
	      		
	    }   
	    for (int j = 0 ; j <Test.length ; j ++) {
	    	if (Test[j] != 0)
	    System.out.print(Test[j] + " ");
	    }
	    System.out.println();
	    System.out.println("Sequence Length :" +Length);
	    return Length;
	}
	
	void test(int[] Arr){
		int LongestLength = 0; 
		for(int i = 0 ; i <Arr.length ; i ++) {  	
			int thislength = LengthofSeq(Arr , i );
			if ( thislength > LongestLength)
				LongestLength = thislength;
		}
		 System.out.println();
		    System.out.println("Longest Sequence Length :" +LongestLength);
	}
	
	
	
}
