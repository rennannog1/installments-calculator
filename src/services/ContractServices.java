package services;

import java.util.Date;

import entities.Contract;

public class ContractServices {
	Date date;
	double totalValue;
	int numberOfInstallments;
	PaymentServices paymentService;

	public ContractServices(PaymentServices paymentService) {
		this.paymentService = paymentService;
	}
	public ContractServices() {
	}
	
	public void processContract(Contract contract, Integer months) {
		paymentService.installmentCalc(contract.getDate(),months,contract.getTotalValue(),contract.getInstallments());
		
	}
	

}
