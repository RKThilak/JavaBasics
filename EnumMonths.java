package EnumTypeDemo;


public class EnumMonths {
	enum month_Is{
		Jan,
		Feb,
		Mar,
		Apr,
		May,
		Jun,
		Jly,
		Aug,
		Sep,
		Oct,
		Nov,
		Dec;
		
		
	}
	public static void main(String[] args) {
		month_Is Item=month_Is.Nov;
		System.out.println("This month is"+" "+Item);
	}


public class Seasons{
	 enum SO_Is{
		Monsoon,
		Summer,
		Winter;
	}
public static void main(String[] args) {
	SO_Is S=SO_Is.Monsoon;
	System.out.println(S +"Will ends on December");
}
}
}