package day_4;
//override
class base{
	public void f1(){
		System.out.println("f1 in base");
	}
	public void f2() {
		System.out.println("f2 in base");
	}
}
class derivied extends base{
	public void f3() {
		System.out.println("f3 in derivied");
	}
	public void f1() {
		System.out.println("f1 in derivied");
	}
}

public class override1 {
      public static void main(String[] args) {
    	  base b1 = new base();
          b1.f1();
          b1.f2();
          
          derivied b3=new derivied();
          b3.f3();
          
          base b2 = new derivied();
          b2.f1();
          b2.f2();
      }
}
