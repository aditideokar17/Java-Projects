import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {

	
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(100) + 1;
// 		System.out.println("Random Number is: "+ randomNumber);
	
		while(true) {
			System.out.println("Enter your Guess (1 - 100) : ");
			
			Scanner sc = new Scanner(System.in);
			int playerGuess = sc.nextInt();
			
			if(playerGuess == randomNumber) {
				System.out.println("Correct! You Win!");
				break;
			}
			else if(randomNumber > playerGuess) {
				System.out.println("Nope! The number is Higher. Guess Again.");
			}
			else {
				System.out.println("Nope! The number is Lower. Guess Again.");
			}
		}
	
	}
}
