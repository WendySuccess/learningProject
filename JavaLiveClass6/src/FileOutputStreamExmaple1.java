import java.io.FileOutputStream;
//output to write
public class FileOutputStreamExmaple1 {
	public static void main(String[] args) {
		try(FileOutputStream fout = new FileOutputStream ("javaFile123.txt")){ // it will close when the finish  not fout.write
//			fout.write(65); //write a bit
			
			String s = "Enjoy the session";
			byte b[] = s.getBytes();
			fout.write(b);
			System.out.println("success ...");
		}catch (Exception e){
			System.out.println(e);
			
		}
	}
}
