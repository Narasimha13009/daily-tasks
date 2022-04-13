package tasks;

public class Staticproblem {
	public static void main(String[] args) {
		employee.id=1334;
		employee.name="sai";
		employee.show();	
	}

}

class employee{
    static int id;
    static String name;
    static String company = "zoho";
    employee(int i,String n){
    	id = i;
    	name = n;
    }
    static void show() {
    	System.out.println(id+" " + name + " " + company );
    }
}
