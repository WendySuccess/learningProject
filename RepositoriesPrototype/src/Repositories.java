import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
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
			  System.out.println();
			} catch (IOException eX2) {
					eX2.printStackTrace();
		}
		
		
	}
	
	public void deletefile(File dir) {
		viewAllfile(dir);
		System.out.println("please key in file name to delete"); 
		String resFileToDelete = sc.nextLine(); 
		int found = 0; 
		int status = 0 ;
		found = checkfile(dir , resFileToDelete) ;		
		if (found == 1) {
        try
        { 
            Files.delete(Paths.get(dir.getAbsolutePath() + "/"+ resFileToDelete)); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file exists"); 
            status = 1;
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
            status = 1;
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
            status = 1;
        } 
          if( status == 0)
        System.out.println("Deletion successful."); }

	}
	
	public void seachfile(File dir) {
		System.out.println("please key in file name to Search"); 
		String resFileToSearch = sc.nextLine(); 
		checkfile(dir , resFileToSearch) ;		
	}
	
	public int checkfile(File dir , String ToSearch) {
		int found =0;
		try {
			File[] files = dir.listFiles();
			int n = files.length;
			String[] filesNames = new String [n];
			int i = 0 ; 
			
			for (File file : files) {
	               filesNames[i] = file.getName();
	               i ++;
	            } 	
			sort(filesNames,0,n-1);
			found =search(filesNames ,ToSearch ) ;
	    }catch (NullPointerException ex) {
	    	System.out.println("File Repository not been setup. Kindly check with admin.");
	    }
		return found ;

	}
	
	private static int search(String[] Arr ,String searchint) {
		int start = 0;
		int length = Arr.length;
		int mid = mid(start, length);
		int found = 0 ;
		
		while(start  <= length ) {
			//System.out.println(start + " "+ mid + Arr[mid]);
			if(Arr[mid].compareTo(searchint)<0) {
				start = mid +1;
			}else if(Arr[mid].compareTo(searchint) ==0)
			{
				System.out.println(" File " + Arr[mid] + "found!" );
				found = 1;
				break;
			}else
			{
				length = mid -1;
			}
			mid = mid(start, length);
		}
		if (found == 0)
			System.out.println("No such file exists!");
		return found;
		
	}
	private static int mid(int first , int last ) {
				return (first + last)/2;
	}
	
}
