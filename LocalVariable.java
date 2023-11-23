package Variables.edu;

public class LocalVariable {
public static void main(String[] args) {
	int a=23;/*local Variable,
	it doesn't have any default value. 
	we cann't print a variable value without initilization.
	*/ 
	System.out.println("Local Variable="+a);
	float b=123.45f;
	System.out.println(b);
	String str="Apple";
	System.out.println(str);
	long c=12547l;
	System.out.println(c);
	String fn1="RK";
	String fn2="Thilak";
	int age=22;
	System.out.println("My name is "+fn1 +" " +fn2 +" "+" and I'm"+" "+age +" "+"year old");
}
}
