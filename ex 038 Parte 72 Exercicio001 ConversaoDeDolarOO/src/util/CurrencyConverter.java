package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public double dollarPrice;
	public double dollarBought;
	
	public double amount() {
		return dollarPrice * dollarBought + IOF * dollarPrice * dollarBought;
	}

}
