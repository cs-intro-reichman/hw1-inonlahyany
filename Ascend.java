// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a, b, c;
		a = (int) (Math.random()*lim);
		b = (int) (Math.random()*lim);
		c = (int) (Math.random()*lim);

		// if a>b || a>c -> a>b,c
		// if c>a || c>b -> c>a,b
		int smallestAB = Math.min(a,b);
		int smallestNum = Math.min(smallestAB,c);

		int largestAB = Math.max(a,b);
		int largestNum = Math.max(largestAB, c);

		int middleNum = (a+b+c) - (smallestNum+largestNum);

		System.out.println(a + " " + b + " " +c);	
		System.out.println(smallestNum + " " + middleNum + " " + largestNum);
		}
}
