package Variables.edu;

public class InstanceDemo{
	String name="RK Thilak";
	String branch="EEE";
	int age=22;
	long ph=9989681700l;
	String email="rkthilak3@gmail.com";
	String address="6-38,Jeeduru,Mallanuru,Kuppam,AP - 517425";
	
	
	public static void main(String[] args) {
		
		InstanceDemo ob = new InstanceDemo();
		System.out.println("My name is"+" "+ob.name +",  "+"I'm"+" "+ob.age+" "+"years old"+" "+"and I have completed my graduation in the domain of"+" "+ob.branch +" " +" From"+" "+ob.address);
		System.out.println("You can reach me through"+" " +ob.ph +" "+" and" +" "+" can mail me through"+" "+ob.email);
	}
}
