
public class SelectionSort {
	public static void main(String[] args) {
		int[] Arr  = {10 , 20 , 5 , 70 , 60 ,80 };
		//selectionSort(Arr);
		selectionSortdesc(Arr);
		for (int i : Arr)
		{
			System.out.println(i);
		}
	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < arr.length -1 ; i++) {
			int index = i;
			for (int j = i +1 ; j< arr.length ; j++ ) {
				if(arr[j] < arr[index]) {
					index = j ;
				}
			}
			int smallNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNumber;
		}
	}
	
	private static void selectionSortdesc(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < arr.length -1 ; i++) {
			int index = i;
			for (int j = i +1 ; j< arr.length ; j++ ) {
				if(arr[j] > arr[index]) {
					index = j ;
				}
			}
			int smallNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNumber;
		}
	}
}
