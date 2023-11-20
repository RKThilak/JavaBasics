package Oparators;
import java.util.Scanner;
public class ShoppingCart {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Quantity:");
		int q=sc.nextInt();
		System.out.println("Enter the Price:");
		int p=sc.nextInt();
		int t=q*p;
		System.out.println("The Festival Offer is 10%");
		double total=0.1*t;
		double ftotal=t-total+0.07*t;
		System.out.println("then the Final Amount will be"+" "+"Rs"+" "+ftotal+" "+" Including GST");
		
	}

}
