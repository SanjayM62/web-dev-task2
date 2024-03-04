package com.ATM_Interface;

import java.util.List;

public class User {
	
	private String UserID;
 	private int Pin;
	private double Balance;

	public User(String userID, int pin, double balance) {
		super();
		UserID = userID;
		Pin = pin;
		Balance = balance;
	}

	public String getUserID() {
		return UserID;
	}
	
	public int getPin() {
		return Pin;
		
	}
	
	public double getBalance() {
		return Balance;
	}
	
	public void Deposit(double amount) {
		if (amount>0) {
			Balance += amount;
			System.out.println("Deposit Successful.Balance amount:" + Balance);
		}
		
	}
	
	public void Withdraw(double amount) {
		if (amount > 0 && amount <= Balance) {
			Balance -= amount;
			System.out.println("Withdrawl Successful.Balance amount:" + Balance);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public static User authenticate (String UserID,int pin,List<User> users) {
		for(User user:users) {
		if (user.getUserID().equals(UserID) && user.getPin()==pin) {
			return user;
			
		}
		}	
				return null;
	}
			
	
		

	public static void main(String[] args) {
		

	}

	}
