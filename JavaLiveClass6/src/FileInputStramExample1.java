import java.io.*;

public class FileInputStramExample1 {
	public static void main(String[] args) {
		// Directory Detail 
		File dir = new File("C:/");
		File files[] = dir.listFiles();
		for (File file : files) {
			System.out.println(file.getName());
		}
		
		try(FileInputStream fin = new FileInputStream ("javaFile123.txt")){ // it will close when the finish  not fout.write
		for(int i = 0 ; i<3 ;i++)
		{
			//int ch = (char) fin.read(); // output = 659899
			char ch = (char) fin.read();
			System.out.print(ch);
		}
		
//		while((int i = fin.read()!= -1 ) {
//			
//			
//		}
//		
		}catch (Exception e){
			System.out.println(e);
			
		}
		
}
}
