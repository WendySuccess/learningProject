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
		try {
			System.out.println("file created "+myFile.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //returns the path string  
	}
		
	void readFile(){
		try {
			File file = new File("text.txt");
		}catch(Exception e) {
		newFile();
		}
//		File file = new File("text.txt");
		System.out.println("read File");  
//		ObjectInputStream in = null;
//		FileInputStream fin = null;
		try {
			BufferedReader in1 = new BufferedReader(new FileReader(myFile));
			String s; 
			s = in1.readLine();
			while (s !=null) {
				System.out.println("Read :" +s);
				s = in1.readLine();
			}
		
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
