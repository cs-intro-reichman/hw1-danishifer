// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double ratePercent = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		double futureValue = currentValue * Math.pow(1 + ratePercent / 100.0, years);
		System.out.println("After " + years + " years, $" + currentValue + " saved at " + ratePercent + "% will yield $" + (int)futureValue);
	}
}