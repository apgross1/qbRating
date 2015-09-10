//Andrew Gross
//CISC181010

package qbRating;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Takes passing statistics of quarterback and calculates their Passer Rating
		//Parameters: N/A
		//Returns: N/A
		
		//Initializes scanner for input with user_input
		Scanner user_input = new Scanner(System.in);
		
		//Asks user for # of touchdowns until given an appropriate answer and stored under 
		//variable TD (a double)
		System.out.println("Enter number of touchdowns scored: ");
		double TD = user_input.nextInt();
		while (TD <0) {
			System.out.println("Value cannot be negative. Try again: ");
			TD = user_input.nextInt();
		}
		
		//Asks user for # of yards gained until given an appropriate answer and stored under 
		//variable Yards (a double)
		System.out.println("Enter total yards gained: ");
		double Yards = user_input.nextInt();
		while (Yards <0) {
			System.out.println("Value cannot be negative. Try again: ");
			Yards = user_input.nextInt();
		}
		
		//Asks user for # of interceptions until given an appropriate answer and stored under 
		//variable INT (a double)
		System.out.println("Enter total interceptions: ");
		double INT = user_input.nextInt();
		while (INT <0) {
			System.out.println("Value cannot be negative. Try again: ");
			INT = user_input.nextInt();
		}
		
		//Asks user for # of completions until given an appropriate answer and stored under 
		//variable comp (a double)
		System.out.println("Enter total number of completions: ");
		double comp = user_input.nextInt();
		while (comp <0) {
			System.out.println("Value cannot be negative. Try again: ");
			comp = user_input.nextInt();
		}
		
		//Asks user for # of passes attempted until given an appropriate answer and stored under 
		//variable ATT (a double)
		System.out.println("Enter number of passes attempted: ");
		double ATT = user_input.nextInt();
		while (ATT <0) {
			System.out.println("Value cannot be negative. Try again: ");
			ATT = user_input.nextInt();
		}
		
		//The variables below are used to calculate the overall Passer Rating
		double a = (((comp/ATT)-.3) * 5);
		double b = (((Yards/ATT)-3) * .25);
		double c = ((TD/ATT) * 20);
		double d = (2.375 - ((INT/ATT)*25));
		//passer_rating - Double that hold the value of the Passer Rating calculated using
		//helper variable above
		double passer_rating = 100 * ((a+b+c+d)/6);
		
		//Close the scanner to prevent data leaks
		user_input.close();
		
		//Prints the quarterback's Passer Rating to the console
		System.out.printf("The quarterback's Passer Rating is %.1f.", passer_rating);

	}

}
