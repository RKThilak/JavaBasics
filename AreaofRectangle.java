package Oparators;
import java.util.Scanner;
public class AreaofRectangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the lenght: ");
	double l = sc.nextInt();
	
	System.out.println("Enter the breath: ");
	double b = sc.nextInt();
	
	double c = l*b;
	System.out.println("The area of the recatngle is " +c);
}
}
