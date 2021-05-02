
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 11,13,5,6,7};
		
		System.out.println("Given Array 2");
		QuickSort obj = new  QuickSort();
		obj.printArray(arr);
		 
		 obj.sort(arr,0,arr.length-1);
		 obj.printArray(arr);

	}
	
	void sort(int[] arr, int low, int high) {
		if(low< high){
			
			int pi = partition(arr,low, high);
			sort(arr,low,pi -1);
			sort(arr,pi , high);
	
		}
	}
	
	void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i <n ;++i ) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}

	private int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = arr[high];
		int i = (low-1);
		for(int j = low ; j < high ; j++)
		{
			if(arr[j]>= pivot) {
				i ++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}

}
