package ArrayLesson;

public class ArrayExample {
	public static void main (String[] args) {
		//Single Array
	int sizeArray = 1;
	
	int[] arrNum = new int[sizeArray];
	
	for(int i=0 ; i<sizeArray;i++)
	{
		arrNum[i] = 10 * (i+1);	
	}
	
	for(int i=0 ; i<sizeArray;i++)
	{
		//System.out.println(arrNum[i]);
		
	}
	
	//Multiple  Array
	
	int row = 3, col =3;
	int k = 10;
	int[][] arr = new int[row][col];
	
	for(int i=0 ; i<row;i++)
	{ 
		for(int j = 0 ; j<col; j++) {
		arr[i][j] = k;	
		k +=10;
		}
	}
	
	for(int i=0 ; i<row;i++)
	{
		for(int j = 0 ; j<col; j++) {
		System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	
	}
}
