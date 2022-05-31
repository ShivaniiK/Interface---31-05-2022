package com.InterfaceJava;

public class CanaraBank implements Bank
{
	
@Override
public void HomeLoan()
{
	double principal = 50000;
	double rate= 8;
	int year = 1;
	year = year*12;
	double TotalHomeLoan;

	TotalHomeLoan = (principal*rate*year/12);
	System.out.println("Total Homeloan of Canara Bank is: " +TotalHomeLoan);

	}


@Override
public void CarLoan()
{

	double principal = 22000;
	double rate= 10;
	int year = 2;
	year = year*12;
	double TotalCarLoan;

	TotalCarLoan = (principal*rate*year/100);
	System.out.println("Total Carloan of Canara Bank is: " +TotalCarLoan);
	
}



@Override
public void StudentLoan()
{

	double principal = 280000;
	double rate= 7;
	int year = 3;
	year = year*12;
	double TotalStudentLoan;

	TotalStudentLoan = (principal*rate*year/100);
	System.out.println("Total StudentLoan of Canara Bank is: " +TotalStudentLoan);
	
}
}


