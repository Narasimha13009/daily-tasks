package day_4;

    enum days1 {
	MONDAY(0,1,"good"),
	TUESDAY(1,2,"AVG"),
	WEDNESDAY(2,3,"AVG"),
	THURSDAY(3,4,"AVG"),
	FRIDAY(4,5,"happy"),
	SATURDAY(5,6,"njoy"),
	SUNDAY(6,7,"njoy a lot");
	private int workday;
	private int worktask;
	private String howwastheday;

	days1(int i, int j, String string) {
		 workday = i;
	     worktask = j;
	     howwastheday=string;
	}
	 int work() {
		   return workday;
	}
	 int workhours() {
		 return worktask;
	 }
	  String howwastheday(){
		  return howwastheday;
	  }
    }	
public class days{
	public static void main(String[] args) {
		System.out.println(days1.SUNDAY.howwastheday());
	}	
	}
	