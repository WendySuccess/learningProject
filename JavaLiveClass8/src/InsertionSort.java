
public class InsertionSort {
	public static void main(String[] args) {
		int[] Arr  = {10 , 20 , 5 , 70 , 60 ,80 , 100 , 90 , 200 , 700};
		
		InsertionSort(Arr);
		for(int i = 0 ; i <Arr.length ; i ++) {
			System.out.println(Arr[i]);
		}
	}

	private static void InsertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length ;
		for (int j =1 ;j <len ; j ++) {
			int key = arr[j];
			int i = j -1;
			while((i >-1)&& (arr[i]<key)) {
				arr[i +1] = arr[i];
				i --;
			}
			arr[i +1] = key ;
		}
		
	}
}
