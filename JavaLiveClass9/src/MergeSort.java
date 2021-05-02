
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 11,13,5,6,7};
		
		System.out.println("Given Array");
		MergeSort obj = new  MergeSort();
		obj.printArray(arr);
		 
		 obj.sort(arr,0,arr.length-1);
		 obj.printArray(arr);
	}
	
	void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i <n ;++i ) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}

	void sort(int[] arr, int low, int high) {
		if(low< high){
			int mid = (low + high) /2;
			sort(arr,low,mid);
			sort(arr,mid +1 , high);
			merge(arr, low, mid,high );
		}
	}
	 // recurtion function 
	 void merge(int[] arr, int low,int mid, int high) {
		
		int n1 = mid - low +1;
		int n2 = high - mid;
		
		int [] left = new int [n1];
		int [] right = new int [n2];
		
		for (int i = 0 ;  i <n1 ; i ++)
			left[i] = arr[low + i];
				
			for (int j = 0 ;  j <n2 ; j ++)
			right[j] = arr[mid +1 + j];
			
			int i = 0 ;
			int j = 0;
			int k = low;
			
			while (i<n1&& j<n2) {
				if(left[i]>= right[j]) {
					arr[k] = left[i];
					i++;
				}else
				{
					arr[k] = right[j];
					j++;
				}
				
				k++;
			}
		
		while(i<n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}
