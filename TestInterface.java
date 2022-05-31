package com.InterfaceJava;

public class TestInterface {

	public static void main(String[] args) {
		Bank objBank = new SBIBank();
		System.out.println("URL is: " +SBIBank.strURL);
		System.out.println("===============================================");
		objBank.HomeLoan();
		objBank.CarLoan();
		objBank.StudentLoan();
		System.out.println("===============================================");
		Bank objBank_1 = new CanaraBank();
		objBank_1.HomeLoan();
		objBank_1.CarLoan();
		objBank_1.StudentLoan();
		}

}
