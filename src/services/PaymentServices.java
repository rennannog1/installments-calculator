package services;

import java.util.Date;
import java.util.List;

import entities.Installment;

public interface PaymentServices {

	List<Installment> installmentCalc(Date date, int number, double totalValue, List <Installment> installments);
}
