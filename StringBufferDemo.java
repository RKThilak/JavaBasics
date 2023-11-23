package String;
//mutable
public class StringBufferDemo {
	public static void main(String[] args) {
		//append()
		StringBuffer sb=new StringBuffer("RK");
		sb.append("Thilak");
		System.out.println(sb);
		//==
		StringBuffer a=new StringBuffer("Raju");
		StringBuffer b=new StringBuffer("Raju");
		boolean c=a==b;
		System.out.println(c);
		boolean d=a.equals(b);
		System.out.println(d);
		StringBuffer x=new StringBuffer(" Seetha");
		System.out.println(x.insert(0, "N"));//insert()
		StringBuffer y=new StringBuffer("Seetha");
		System.out.println(y.deleteCharAt(0));//deleteChar()
		StringBuffer z=new StringBuffer("N Seetha");
		System.out.println(z.delete(2, 3));//delete()
		StringBuffer h=new StringBuffer("P Seetha");
		System.out.println(h.replace(1, 2, "s"));//replace()
		StringBuffer p=new StringBuffer("K Seetha");
		System.out.println(p.reverse());//reverse()
		System.out.println(x.capacity());//capacity()
		
	}
	

}
