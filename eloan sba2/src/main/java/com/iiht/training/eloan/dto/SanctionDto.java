package com.iiht.training.eloan.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class SanctionDto {
	@NotNull(message="loanAmountSanctioned number is mandate")
	@NotBlank(message="loanAmountSanctioned number is mandate")
	private Double loanAmountSanctioned;
	
	@NotNull(message="termOfLoan number is mandate")
	@NotBlank(message="termOfLoan number is mandate")
	private Double termOfLoan;
	
	
	@NotNull(message="paymentStartDate number is mandate")
	private String paymentStartDate;
	
	public Double getLoanAmountSanctioned() {
		return loanAmountSanctioned;
	}
	public void setLoanAmountSanctioned(Double loanAmountSanctioned) {
		this.loanAmountSanctioned = loanAmountSanctioned;
	}
	public Double getTermOfLoan() {
		return termOfLoan;
	}
	public void setTermOfLoan(Double termOfLoan) {
		this.termOfLoan = termOfLoan;
	}
	public String getPaymentStartDate() {
		return paymentStartDate;
	}
	public void setPaymentStartDate(String paymentStartDate) {
		this.paymentStartDate = paymentStartDate;
	}
	
	
}
