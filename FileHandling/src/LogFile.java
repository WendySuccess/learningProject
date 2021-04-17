import java.io.File;
import java.util.*;  

public class LogFile {
	File myFile;
	Scanner sc= new Scanner(System.in); 
	LogFile(){}
		
	void newFile(){
		//myFile = new File("log" + "datetime");
		myFile = new File("log" + "datetime" + ".txt");
	}
		
	void readFile(){
		System.out.println("read File");  
		
	}
	
	void writeFile() {}
	
	void appendFile() {}

}
