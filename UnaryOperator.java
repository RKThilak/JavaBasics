package Oparators;
import java.util.Scanner;
public class UnaryOperator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int b=a++;// Post Increament
		System.out.println(b);
		System.out.println(a);
		int c=++a;// Pre Increament
		System.out.println(c);
		System.out.println(a);
		int d=--a;//Pre decreament
		System.out.println(d);
		System.out.println(a);
		int e=a--;//Post decreament
		System.out.println(e);
		System.out.println(a);
	}

}
