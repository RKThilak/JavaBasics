package Oparators;
import java.util.Scanner;
public class BitwiseOperator {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a|b;// Bitwise Operation
	System.out.println("Bitwise Operation(|) of a and b ="+" "+c);
			
	}
}
