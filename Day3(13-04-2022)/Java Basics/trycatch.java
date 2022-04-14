package day_4;
import java.util.Scanner;
public class trycatch {
            public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int num1 = sc.nextInt(); 
              int num2 = sc.nextInt(); 
              try {
            	  int num3 = num1/num2;
            	  System.out.println(num3);
              }
              catch(ArithmeticException e){
            	  System.out.println("error is ArithmeticException");
              }
              finally {
            	  System.out.println("everything is fine");
              }
            }
}
