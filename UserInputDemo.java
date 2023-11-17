package com.edu;
import java.util.Scanner;
public class UserInputDemo {
public static void main(String[] args) {
	while(true) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your name");
	String name=sc.nextLine();
	System.out.println("My name is "+name);
	System.out.println("Enter your Age");
	int age=sc.nextInt();
	System.out.println("I'm"+age +" " +" old");
	System.out.println();
	System.out.println("Enter your Marks");
	float marks=sc.nextFloat();
	System.out.println("My Marks are"+marks);
}
	

}
}
