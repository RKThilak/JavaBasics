package Oparators;

public class LogicalOperators{
	static int x=10;
	static int y=5;

	public static void main(String[] args) {
		
	
	if (++ x < 10 & ++ y > 5) // and operator
	{
		x++;
	}
	else 
	{
		y++;
	}
		

   System.out.println("&"+x);
   System.out.println("&"+y);
	}
   class B {
	   public static void main(String[] args) {
		
	
	  if (++ x < 10 | ++ y > 5)//or operator
		{
			x++;
		}
		else 
		{
			y++;
		}
			

	   System.out.println("|"+x);
	   System.out.println("|"+y);
	   }
	   class C {
		   public static void main(String[] args) {
			
		
		 	if (++ x < 10 && ++ y > 5)//logical And operator
			{
				x++;
			}
			else 
			{
				y++;
			}
				

		   System.out.println("&&"+x);
		   System.out.println("&&"+y);
		   }
		   class D {
			   public static void main(String[] args) {
				
			
			  if (++ x < 10 || ++ y > 5)//Logical or operator
				{
					x++;
				}
				else 
				{
					y++;
				}
					

			   System.out.println("||"+x);
			   System.out.println("||"+y);
			   }

		   }
	   }
   }
	}

