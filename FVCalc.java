// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]); 
		double rateOfInterest = Double.parseDouble(args[1]);
		int numberOfYears = Integer.parseInt(args[2]);
		
		double futureValue = currentValue * Math.pow((1.0+rateOfInterest/100),numberOfYears); 

		System.out.println("After " + numberOfYears + " years, a $" + currentValue + " saved at " + rateOfInterest + "% will yield $" + (int) futureValue);
	}
}