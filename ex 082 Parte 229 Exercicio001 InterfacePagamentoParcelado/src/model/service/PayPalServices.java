package model.service;

public class PayPalServices implements OnlinePaymentService {

	@Override
	public double paymentFee(double amount) {

		return amount * 0.02;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * 0.01 * months;
	}

}
