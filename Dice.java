import java.util.Scanner;
public class Dice {
	public static void main(String[] args) {

		System.out.println("\n\n********* Main Menu *********\n");            
		System.out.println("\nDouble Dice Game");     

		System.out.println ("Print number of rounds\n");



		Scanner scan = new Scanner(System. in );
		byte rounds = Byte. parseByte (scan.nextLine()); //variable to store the number of rounds and we store the input
		if(rounds > 0 && rounds < 16) {
			byte scoreMary = 100; //variable to store Mary's score
			byte scoreJonathan = 100; //variable to store Jonathan's score
			System.out.println ("ROLL THE DICE!\n");
			System.out.println ("Two integers between 1 and 6 round, followed by a space");
			for(byte i = 0; i < rounds; i++){ //loop that runs for every round
				byte rollMary = scan.nextByte(); //variable to store Mary's roll
				byte rollJonathan = scan.nextByte(); //variable to store Jonathan's roll
				if(rollMary > 0 && rollMary < 7 && rollJonathan > 0 && rollJonathan < 7) { //check to see if each roll was within range
					if(rollMary > rollJonathan) { // check if Mary rolled higher
						scoreJonathan -= rollMary; // if so, we removed that roll from Jonathan's score
					}
					else if(rollMary < rollJonathan) { // Otherwise, check if Jonathan rolled higher
						scoreMary -= rollJonathan; // if so, we removed that roll from Mary's score
					} // exclude a final else statement, because if neither is higher than the other, 
					// then the rolls are equal, meaning neither player should lose points.
				}
			}
			System. out .println("The number of rounds was " + rounds);
			System. out .println("Mary's score is " + scoreMary);
			System. out .println("Jonathan's score is " + scoreJonathan);
			if (scoreMary > scoreJonathan) {
				System. out .println("Mary won ");
			}
			else if(scoreMary < scoreJonathan) {
				System. out .println("Jonathan won ");
			}
			else if (scoreMary == scoreJonathan)
				System. out .println("Tie! ");
		}


	}

}