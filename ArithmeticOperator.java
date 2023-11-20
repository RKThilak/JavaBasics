package Oparators;
import java.util.Scanner;
public class ArithmeticOperator {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a integer number a=");
		int a=sc.nextInt();
		System.out.println();
		System.out.println("Enter a integer number b=");
		int b=sc.nextInt();
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mdiv=a%b;
		System.out.println("Sum="+sum +" " +"Sub="+sub +" "+"Mul="+mul+" "+"Div="+div +" " +"Mdiv="+mdiv );
		}
	}


