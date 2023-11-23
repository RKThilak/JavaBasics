package Tasks;
import java.util.Scanner;
public class Task2ExitCode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer textBuffer = new StringBuffer();

        // Simulate user input (typing and editing)
        System.out.println("Welcome to the Text Editor!");
        System.out.println("Type your text. Enter 'exit' to finish.");
		System.out.println("Enter words:");
		String word=sc.nextLine();
		if (word.equalsIgnoreCase("exit"))
		{
			System.out.print("Enter text: ");
	        word = sc.nextLine();	
	        
			
		}
		else 
		{
			System.out.println("\nFinal Edited Text:");
	        System.out.println(word.toString());
	            

			
		}
	}

}
