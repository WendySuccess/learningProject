class defAccessSpecifier2
{ 
  void display() 
     { 
         System.out.println("You are using default access specifier2"); 
     } 
} 
public class accessSpecifiers1 {
    public static void main(String[] args) {
        //default
        System.out.println("Dafault Access Specifier");
        defAccessSpecifier2 obj = new defAccessSpecifier2();           
                obj.display(); 
    }
}
