
public class BubbleSort {
	public static void main (String[] args) {
		int[] Arr  = {10 , 20 , 5 , 70 , 60 ,80 , 100 , 90 , 200 , 700};
		bubbleSortdesc(Arr);
		for(int i = 0 ; i <Arr.length ; i ++) {
			System.out.println(Arr[i]);
		}
	}
	
	public static void bubbleSort(int [] Arr) {
		int len = Arr.length;
		int temp = 0;
		for(int i =1 ; i<len; i++) {
			for(int j=1; j<len;j++) {
				if(Arr[j-1]>Arr[j]) {
					temp = Arr[j-1];
					Arr[j-1]= Arr[j];
					Arr[j]= temp;
				}
			}
				
		}
		
	}
	
	public static void bubbleSortdesc(int [] Arr) {
		int len = Arr.length;
		int temp = 0;
		for(int i =1 ; i<len; i++) {
			for(int j=1; j<len;j++) {
				if(Arr[j-1]<Arr[j]) {
					temp = Arr[j-1];
					Arr[j-1]= Arr[j];
					Arr[j]= temp;
				}
			}
				
		}
		
	}
}
