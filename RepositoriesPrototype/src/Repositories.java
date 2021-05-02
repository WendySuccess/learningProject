import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Repositories {
	static Scanner sc= new Scanner(System.in); 
	public void viewAllfile(File dir) {
		System.out.println();
		try {
			File[] files = dir.listFiles();
			int n = files.length;
			String[] filesNames = new String [n];
			int i = 0 ; 
			for (File file : files) {
	               filesNames[i] = file.getName();
	               i ++;
	            } 	
			//Retrieving the file names in an ascending order (QuickSort)
			sort(filesNames,0,n-1);
			printFileList(filesNames);
			System.out.println();
	    }catch (NullPointerException ex) {
	    	System.out.println("File Repository not been setup. Kindly check with admin.");
	    }
	}
	
	private void printFileList(String[] arr) {
		int n = arr.length;
		System.out.println("List of File");
		for (int i = 0; i <n ;++i ) {
			System.out.println((i+1) + ". "+arr[i]);
		}
		System.out.println();
	}
	
	private void sort(String[] arr, int low, int high) {
		if(low< high){	
			int pi = partition(arr,low, high);
			sort(arr,low,pi -1);
			sort(arr,pi , high);
		}
	}
	
	private int partition(String[] arr, int low, int high) {
		String pivot = arr[high];
		int i = (low-1);
		for(int j = low ; j < high ; j++)
		{
			if(arr[j].compareTo(pivot)<0) {
				i ++;
				String temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		String temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	//Option
	//Option to add a user specified file to the application
	public void addfile(File dir) {
		System.out.print("Please enter new File name : ");
		String filename = sc.nextLine(); 
		File myFile = new File(dir.getAbsolutePath() + "/" +filename);
		try {
			if(myFile.createNewFile()) { //create file
				System.out.println("New File is created! File Name : " + filename);
				System.out.println();
			}
			else
			{
				System.out.println("File existing!");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to create file. Kindly check with admin.");
		} 
		
		appendFile(dir.getAbsolutePath() + "/" +filename);
	}
	//Option to delete a user specified file from the application
	
	private void appendFile(String filename) {
		
		String originaldata = ""; 
		String newdata = ""; 
		try (BufferedReader in2 = new BufferedReader(new FileReader(filename))){
			
			String s2= in2.readLine();		
						while (s2 !=null) {
					originaldata = originaldata + s2 + System.lineSeparator();
					//System.out.println("Read :" +s2);
					s2 = in2.readLine();	
					
				}}catch (Exception eX) {
					
					eX.printStackTrace();
				} 		
			
		try(FileOutputStream fout =  new FileOutputStream(filename);){
			
			System.out.println("please key in some new data"); 
			String res = sc.nextLine(); 
				  newdata  = originaldata + res + System.lineSeparator();
			  fout.write( newdata.getBytes());
			  System.out.println("Success Added."); 
	
			} catch (IOException eX2) {
					eX2.printStackTrace();
		}
		
		
	}
	
	public void deletefile() {
		
	}
	
	public void seachfile() {
		
	}
}
