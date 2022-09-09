package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private double totalValue;
	List<Installment> installments = new ArrayList<Installment>();
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public List<Installment> getInstallments() {
		return installments;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public Contract(Integer number, Date date, double totalValue) {
		
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}
	
	public Contract() {
	}
	 
	 
}
