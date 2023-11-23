package Tasks;
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String use_name="RK_Thilak";
		String password="RKthilak@3";
		System.out.println("Please Enter Your User Name:");
		String name_in=sc.next();
		System.out.println("Enter your Password:");
		String password_in=sc.next();
		if (name_in.equalsIgnoreCase(use_name) && password_in.equalsIgnoreCase(password))
		{
		System.out.println("Successfully Logged in as"+" "+use_name);
		}
		else 
		{
		System.out.println("Log in Failed");
		}
		
			
		}
		
		
	}


