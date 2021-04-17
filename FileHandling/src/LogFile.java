import java.io.*;
import java.util.*;  

public class LogFile {
	File myFile;
	Scanner sc= new Scanner(System.in); 
	LogFile(){}
		
	void newFile(){
		//myFile = new File("log" + "datetime");
		//myFile = new File("log" + "datetime" + ".txt");
		myFile = new File("text.txt");
	}
		
	void readFile(){
		newFile();
		File file = new File("text.txt");
		System.out.println("read File");  
		ObjectInputStream in = null;
		FileInputStream fin = null;
		try {
			BufferedReader in1 = new BufferedReader(new FileReader(file));
			String s; 
		
		
		}catch (Exception e) {
			System.out.println(e);
		} finally {
			//in.close();
			
		}
		
		
	}
	
	void writeFile() {
		try(FileOutputStream fout =  new FileOutputStream("text.txt");){
			//to something
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	void appendFile() {}

}
