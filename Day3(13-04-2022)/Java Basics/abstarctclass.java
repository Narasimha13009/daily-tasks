package tasks;

public class abstarctclass {
      public static void main(String args[]) {
    	  t2 task = new t2();
    	  task.sum();    	  
      }
}
abstract class t1{
	int a;
	int b;
	public abstract void sum();
	public int subtract(){
		return a-b;
	}
}
class t2 extends finalabstarctclass{
	t2(){
		System.out.print("learn ");
	}
	public void sum(){
		System.out.println("java");
	}
}
