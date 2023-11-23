package String;
import java.util.Scanner;

public class StringDemo {
	public static void main(StringDemo[] args) {
		Scanner sc=new Scanner(System.in);
		String a="Happy BirthDay";
		String b="happy birthday";
		System.out.println("Enter a Word:");
		String str=sc.nextLine();
		System.out.println("Enter another Word:");
		String str1=sc.nextLine();
		String str2=str.concat(str1);// concat()
		System.out.println(str.concat(str1));//method 1
		System.out.println(str2);// method 2
		int str3=str2.length();// length()
		System.out.println("Length of String 'Thank You'"+str3);
		char c=str2.charAt(2);//charAt()
		System.out.println("3rd Position of the the String 'str2' is "+c);
		String str4=str2.substring(0,2);//Substring()
		System.out.println("The SubString of string 'str2' is "+str4);
		System.out.println("Happy BirthDay=happy birthday ="+" "+a.equals(b));//equals()
		System.out.println("'Ignore the CaseSensitivity' ="+" "+a.equalsIgnoreCase(b));//equalsIgnoreCase()
		System.out.println(b.toUpperCase());// toUpperCase()
		System.out.println(a.toLowerCase());// toLowerCase()
		
		boolean d=a.contains("Happy");// contains()
		System.out.println("The String that contains Happy or Not"+d);
		String e=b.replace("d","D" );// replace()
		System.out.println("After Replacing the d to D: "+e);
		
		
		
		
		
		
		
	}

}
