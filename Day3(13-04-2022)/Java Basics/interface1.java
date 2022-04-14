package day_4;

public interface interface1 {
    final int a = 10;
    void show();
}

class Main implements interface1{
	public void show() {
		System.out.println("implemented interface");
	}
	public static void main(String[] args) {
		Main m1 = new Main();
		m1.show();
		System.out.println(a);
	}
}
