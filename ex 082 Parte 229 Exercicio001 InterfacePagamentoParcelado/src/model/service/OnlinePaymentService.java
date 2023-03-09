package model.service;

public interface OnlinePaymentService {
	Double paymentFee(double amount);
	Double interest(Double amount, Integer months);
}
