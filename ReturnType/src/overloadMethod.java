//method overloading
public class overloadMethod {
	
	int val = 10;
	
	overloadMethod(){
		val = 1;
	}
	
	overloadMethod(int val){
		this.val = val;
	}
	
public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

overloadMethod ob=new overloadMethod();
       ob.area(10,12);
       ob.area(5);  
       
       overloadMethod ob2 =new overloadMethod(10);
       ob2.area(10,12);
       ob2.area(5);  
   }
}
