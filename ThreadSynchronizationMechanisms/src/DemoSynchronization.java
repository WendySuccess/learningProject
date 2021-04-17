
public class DemoSynchronization {
 public static void main (String[] args) {
	 ExampleThread r = new ExampleThread(" A ");
	 ExampleThread r1 = new ExampleThread(" B ");
	 ExampleSynchonizationThread  r2  = new ExampleSynchonizationThread(" C ");
	 ExampleSynchonizationThread  r3  = new ExampleSynchonizationThread(" D ");
	 Thread t = new Thread(r);
	 Thread t1 = new Thread(r1);
	 Thread t2= new Thread(r2);
	 Thread t3= new Thread(r3);
	 t.start();
	 t1.start();
	
	 t2.start();
	 t3.start();
 }
}
