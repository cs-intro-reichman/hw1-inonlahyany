// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String nameOfDiner1 = args[0];
	    String nameOfDiner2 = args[1];
		String nameOfDiner3 = args[2];
		double restaurantBill = Integer.parseInt(args[3]);

		System.out.println("Dear " + nameOfDiner3 + ", " + nameOfDiner2 + ", and " + nameOfDiner1 + ": pay " + Math.ceil(restaurantBill/3) + " Shekels each.");
	}
}
