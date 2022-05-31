package com.InterfaceJava;

public class SBIBank implements Bank
{

@Override
public void HomeLoan()
{
double principal = 45000;
double rate= 10;
int year = 1;
year = year*12;
double TotalHomeLoan;

TotalHomeLoan = (principal*rate*year/12);
System.out.println("Total Homeloan of SBI is: " +TotalHomeLoan);

}

@Override
public void CarLoan()
{
	double principal = 15000;
	double rate= 12;
	int year = 2;
	year = year*12;
	double TotalCarLoan;

	TotalCarLoan = (principal*rate*year/100);
	System.out.println("Total Carloan of SBI is: " +TotalCarLoan);
	
}

@Override
public void StudentLoan()
{
	double principal = 300000;
	double rate= 8;
	int year = 3;
	year = year*12;
	double TotalStudentLoan;

	TotalStudentLoan = (principal*rate*year/100);
	System.out.println("Total StudentLoan of SBI is: " +TotalStudentLoan);
	
	
}
}