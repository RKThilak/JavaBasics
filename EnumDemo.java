package EnumTypeDemo;

public class EnumDemo {
	enum Special_Dish{
		Monday_Idly,
		Tuesday_Dosa,
		Wednesday_Pulihora,
		Thursday_Pongal,
		Friday_Bisibilabath,
		Saturday_Puri,
		Sunday_Chithranna;
	}
	public static void main(String[] args) {
		Special_Dish Item=Special_Dish.Wednesday_Pulihora;
		System.out.println("Todays Special Dish"+" "+Item);
	}

}
