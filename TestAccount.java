package assignment5;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int accNo;
		String accName;
		String accBal;
		double rate;
		
		System.out.print("Enter Savings account number: ");
		accNo = sc.nextInt();
		if (sc.hasNextLine()) {
			sc.nextLine();
		}
		System.out.print("Enter Savings account name: ");
		accName = sc.nextLine();
		System.out.print("Enter Savings account balance: ");
		accBal = sc.nextLine();
		System.out.print("Enter Savings account rate: ");
		rate = sc.nextDouble();
		
		Saving save = new Saving(accNo, accName, accBal, rate);
		
		System.out.println();
		
		System.out.print("Enter current account number: ");
		accNo = sc.nextInt();
		if (sc.hasNextLine()) {
			sc.nextLine();
		}
		System.out.print("Enter current account name: ");
		accName = sc.nextLine();
		System.out.print("Enter current account balance: ");
		accBal = sc.nextLine();
		System.out.print("Enter current account rate: ");
		rate = sc.nextDouble();
		
		Current curr = new Current(accNo, accName, accBal, rate);
		
		System.out.println("\n" + save + "\n");
		System.out.println(curr);
		
		sc.close();
	}
}
class Account{
	private int accNo;
	private String accName;
	private String accBal;
	
	public Account(int accNo, String accName, String accBal) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccBal() {
		return accBal;
	}

	public void setAccBal(String accBal) {
		this.accBal = accBal;
	}
	
	
}

class Saving extends Account{
	private double rateOfInt;
	
	public Saving(int accNo, String accName, String accBal, double rateOfInt) {
		super(accNo, accName, accBal);
		this.rateOfInt = rateOfInt;
	}

	public double getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}
	
	@Override
	public String toString() {
		return "Savings Account:\n"
				+ "Interest rate: " + rateOfInt
				+ "\nAccount Number: " + getAccNo() 
				+ "\nAccount Name: " + getAccName()
				+ "\nAccount Balance: " + getAccBal();
	}
}

class Current extends Account{
	private double rateOfInt;
	
	public Current(int accNo, String accName, String accBal, double rateOfInt) {
		super(accNo, accName, accBal);
		this.rateOfInt = rateOfInt;
	}

	public double getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}

	@Override
	public String toString() {
		return "Current Account:\n"
				+ "Interest rate: " + rateOfInt
				+ "\nAccount Number: " + getAccNo() 
				+ "\nAccount Name: " + getAccName()
				+ "\nAccount Balance: " + getAccBal();
	}
	
	
}
