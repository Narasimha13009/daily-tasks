package tasks;

public class accessmodifiers {
    public static void main(String args[]) {
    	System.out.println("guess what ");
    	another2();
    	another3();
    	accessmodifiers2.another5();
    }
    public void another() {
    	System.out.println("yeah i think");
    }
    static void another2() {
    	System.out.println("i am thinking");
    }
    private static void another3() {
    	System.out.println("maybe you don't know ");
    }
    protected String another4() {
    	String x="go and learn java";
    	return x;
    }
    
}
class accessmodifiers2 extends accessmodifiers {
	static void another5() {
    accessmodifiers abc = new accessmodifiers();
    System.out.println(abc.another4());
	}
}
