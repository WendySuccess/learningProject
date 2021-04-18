import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;  

public class LogFile {
	File myFile;
	Scanner sc= new Scanner(System.in); 
	Date today = new Date ();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	String  dd = sdf.format(today);
	String filename = "LogFile"+ dd +".txt" ;	
	
	void newFile(){
  
		myFile = new File(filename);
		try {
			if(myFile.createNewFile()) { //create file
				System.out.println("New File is created! File Name : " + filename);
			}
			else
			{
				System.out.println("File existing!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
		
	void readFile(){
		String s; 
	
		try (BufferedReader in1 = new BufferedReader(new FileReader(filename))) {
			System.out.println("File name :" + filename);
			s = in1.readLine();
			System.out.println();
			System.out.println( "- Start of the file -");
			while (s !=null) {
				System.out.println( s);
				s = in1.readLine();
			}
			System.out.println( "- End of the file -");
			System.out.println();
		}catch (FileNotFoundException e) {
			System.out.println("Since there are no file yet, we will create once.");
			newFile();
		} catch (Exception e) {
			System.out.println(e);
		} 
				
	}
		
	void writeFile() {
		try(FileOutputStream fout =  new FileOutputStream(filename);){
			System.out.println("please key in new log of file"); 
			System.err.println("please noted the previous file will be overlap!!"); 
			String res = sc.nextLine(); 
		   res = today  + " - " +  res ;
			fout.write( res.getBytes());
			System.out.println("Success Added."); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void appendFile() {
		
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
			  res = today  + " - " +  res ;
				  newdata  = originaldata + res + System.lineSeparator();
			  fout.write( newdata.getBytes());
			  System.out.println("Success Added."); 
	
			} catch (IOException eX2) {
					eX2.printStackTrace();
		}
		
		
	}

}
