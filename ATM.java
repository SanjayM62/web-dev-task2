package com.ATM_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
	private static User user;

	public ATM(User user) {
		super();
		ATM.user = user;
	}

	public void DisplayMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			choice= scanner.nextInt();
			
		switch(choice) {
		    
		case 1:
			System.out.println("Your Balance" + user.getBalance());
			break;
			
		case 2:
			System.out.println("Enter the Amount to Deposit:");
			double Depositamount = scanner.nextDouble();
			user.Deposit(Depositamount);
			break;
		
		case 3:
			System.out.println("Enter the amount to withdraw:");
			double WithdrawAmount = scanner.nextDouble();
			user.Withdraw(WithdrawAmount);
			break;
		
		case 4:
			System.out.println("Thank You For being Our Customer!.Have a nice day!!");
			break;
			
		default:
			System.out.println("Invalid choice.Please try again.");
			break;
			
		
		}
		
			
		}while(choice !=4);
		scanner.close();
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

       
        List<User> users = new ArrayList<>();
        users.add(new User("Sanjay", 1234, 10000.0)); 
        
        System.out.print("Enter your user ID: ");
        String userId = scanner.next();
        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();


        User authenticatedUser = User.authenticate(userId, pin, users);
        if (authenticatedUser != null) {
            ATM atm = new ATM(authenticatedUser); 
            
		System.out.println("WELCOME, "+ user.getUserID());
		System.out.println(" ATM is ready to Use");
		atm.DisplayMenu();

	}else {
		System.out.println("Invalid UserID or Pin.Please try again");
	}

}
}
