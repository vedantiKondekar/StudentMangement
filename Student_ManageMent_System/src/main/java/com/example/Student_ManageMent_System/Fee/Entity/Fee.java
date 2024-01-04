package com.example.Student_ManageMent_System.Fee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Transaction_id")
	long Transaction_id;
	long totalfee;
	long total_paid_fee;
	long insatlment;
	long insatlment_number;
	long remanining_fees;
	String Payment_mode;
	long student_id;
	
	
	public void setTransaction_id(long transaction_id) {
		Transaction_id = transaction_id;
	}
	public long getTotalfee() {
		return totalfee;
	}
	public void setTotalfee(long totalfee) {
		this.totalfee = totalfee;
	}
	public long getTotal_paid_fee() {
		return total_paid_fee;
	}
	public void setTotal_paid_fee(long total_paid_fee) {
		this.total_paid_fee = total_paid_fee;
	}
	public long getInsatlment() {
		return insatlment;
	}
	public void setInsatlment(long insatlment) {
		this.insatlment = insatlment;
	}
	public long getInsatlment_number() {
		return insatlment_number;
	}
	public void setInsatlment_number(long insatlment_number) {
		this.insatlment_number = insatlment_number;
	}
	public long getRemanining_fees() {
		return remanining_fees;
	}
	public void setRemanining_fees(long remanining_fees) {
		this.remanining_fees = remanining_fees;
	}
	public String getPayment_mode() {
		return Payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		Payment_mode = payment_mode;
	}
	public long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}
	
	
	
	
	
	
}
