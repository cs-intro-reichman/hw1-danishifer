// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		double random1 = Math.random() * limit;
		double random2 = Math.random() * limit;
		double random3 = Math.random() * limit;
		double max = Math.max(random1, Math.max(random2, random3));
		double min = Math.min(random1, Math.min(random2, random3));
		double mid = random1 + random2 + random3 - max - min;
		System.out.printf("The numbers in ascending order are: %.0f, %.0f, %.0f\n", min, mid, max);
	}
}
