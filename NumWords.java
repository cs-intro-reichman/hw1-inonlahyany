// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int numberGiven = Integer.parseInt(args[0]);
		int numOfHundreds, numOfTens, numOfOnes; 
		numOfHundreds = (numberGiven/100);
		numOfTens = (numberGiven - (numOfHundreds*100))/10;
		numOfOnes = (numberGiven - (numOfHundreds*100 + numOfTens*10));
		System.out.println(numOfHundreds + " hundreds, " + numOfTens + " tens, and " + numOfOnes + " ones.");

	}
}
