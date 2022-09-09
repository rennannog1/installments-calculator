package services;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.Installment;

public class Paypal implements PaymentServices {

	double rate = 0.02;
	double fee = 0.01;

	@Override
	public
	 List<Installment> installmentCalc(Date date, int number, double totalValue, List <Installment> installments){
		for (int i = 0; i < number; i++) {
			Date futureDate = addMonths(date,(i));
			double instValue = (totalValue / number) *  (1 + fee*(i + 1)) * (1 + rate);
			installments.add(new Installment(futureDate, instValue));
		}
		return installments;
	}
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);	
		return calendar.getTime();
	}
}
