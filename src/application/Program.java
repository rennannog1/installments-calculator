package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractServices;
import services.Paypal;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		Integer numberOfInstallments = sc.nextInt();
		System.out.print("Installments: ");
		Contract contract = new Contract (number,date,totalValue);
		ContractServices contractServices = new ContractServices (new Paypal());
		contractServices.processContract(contract, numberOfInstallments);
		for (Installment it:contract.getInstallments()) {
		System.out.println(it);}
	}
	

}
