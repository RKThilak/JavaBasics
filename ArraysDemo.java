package Arrays;
import java.util.Arrays;
public class ArraysDemo {
	public static void main(String[] args) {
		int x[]= {1,2,3};
		System.out.println(x.length);
		String y[]= {"A","AB","ABC","ABCD"};
		int l=y[0].length();
		System.out.println("Length of First String"+" "+l);
		System.out.println("Length of Second String"+" "+y[2].length());
		int [] a= {1,2,3};
		int [] b=a.clone();// shallow copy()
		System.out.println(b);
		System.out.println(Arrays.toString(a));// Arrays.toString()
		System.out.println(Arrays.toString(b));
		
		
	}
	

}
