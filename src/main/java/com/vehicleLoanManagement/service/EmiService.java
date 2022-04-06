package com.vehicleLoanManagement.service;

import com.vehicleLoanManagement.Interface.EmiInterface;

public class EmiService implements EmiInterface{
	@Override
	public double EMICalculate(double loanAmount, int terminYears, double interestRate) {
		int n=terminYears*12;
		interestRate=interestRate/n;
		double powfunc=Math.pow((1+(interestRate))/12, n);
		double EMI=Math.round(loanAmount*(interestRate*12)*((powfunc)/(powfunc-1)));
		return EMI;

}
}
