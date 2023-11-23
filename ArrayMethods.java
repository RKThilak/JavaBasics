package Arrays;
import java.util.Arrays;
public class ArrayMethods {
	public static void main(String[] args) {
		int a[]=new int [6];
		Arrays.fill(a,3);// fill()
		System.out.println();
		a[0]=1;
		a[2]=4;
		System.out.println(Arrays.toString(a));
		int [] x= {1,2,3};
		int [] b=x.clone();// shallow copy()
		System.out.println(b);
		System.out.println(Arrays.toString(x));// Arrays.toString()
		System.out.println(Arrays.toString(b));
		int p=Arrays.binarySearch(x, 2);// binarySearch() it shows the index value of the array.
		System.out.println(p);
		int []small= {1,2,3};
		int []big= {4,5,6};
		boolean areEqual=Arrays.equals(small,big);// Arrays.equals()
		System.out.println(areEqual);
		String str[]= {"A","AB","ABC","ABCD"};
		System.out.println("Length of the Array"+str.length);
		System.out.println("Length of the String in an Array"+str[2].length());
		
	}

}
