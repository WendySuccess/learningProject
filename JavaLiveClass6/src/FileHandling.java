import java.io.*;

public class FileHandling {

	public static void main(String[] args) {
		
		String path = "";
		boolean bool = false;
		try {
		File file = new File ("javaFile123.txt");
		if(file.createNewFile()) { //create file
			System.out.println("New File is created!");
		}
		else{
			System.out.println("File existing!");
		}
		System.out.println(file);
		File file2 = file.getCanonicalFile(); // create new canonical from file object 
		System.out.println(file2);
		bool = file2.exists();
		path= file2.getAbsolutePath(); //return absolute pathname
		System.out.println(bool);
		if(bool){
			System.out.println(path + " exists " + bool);
		}
		}catch (IOException e) {e.printStackTrace();}
		//update a file 	
		try (FileOutputStream fout = new FileOutputStream("javaFile123.txt")  ){
			fout.write(90);
			System.out.println("success Update ...");
		}catch (Exception e )
		{
			System.err.println(e);
		}
		//read a file 	
		try (FileInputStream fin= new FileInputStream("javaFile123.txt")  ){
			char text = (char) fin.read();
			System.out.println(text );
		}catch (Exception e )
		{
			System.err.println(e);
		}		
	}
}
