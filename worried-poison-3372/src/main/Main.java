package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import bean.Customers;
import colors.ConsoleColor;
import useCases.AddNewBus;
import useCases.BookTicket;
import useCases.CancelTicket;
import useCases.CustomerLogin;
import useCases.CustomerNewSignup;
import useCases.SeeAllTickets;
import useCases.SeeTickets;
import useCases.UpdateStats;

public class Main {
	
	static void AdminOrCustomer() {
		System.out.println("                   ");
		System.out.println(ConsoleColor.GREEN + "*****************!! Welcome to the Busy Bus Service !!**************" + ConsoleColor.RESET);
		System.out.println("                   ");
		System.out.println( "+---------------------------+" + "\n"
						  + "| 1. Login As Administrator |" + "\n"
						  + "| 2. Login As Customer      |" + "\n"
						  + "| 3. Exit                   |" + "\n"
						  + "+---------------------------+" );
		choice();
	}
	
	static void choice() {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		try {
			choice = sc.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println(ConsoleColor.RED_BACKGROUND + "Input type should be number" + ConsoleColor.RESET);
			AdminOrCustomer();
		}
		
		if (choice == 1) {
			System.out.println(ConsoleColor.ROSY_PINK + "Welcome Admin ! Please Login to your account" + ConsoleColor.RESET);
			AdminLogin();
		}
		else if (choice == 2) {
			System.out.println(ConsoleColor.ROSY_PINK + "Welcome Customer !" + ConsoleColor.RESET);
			customerLoginOrSignup();
		}
		else if (choice == 3) {
			System.out.println(ConsoleColor.ROSY_PINK + "Thank you ! Visit again" + ConsoleColor.RESET);
			System.exit(0);
		}
		else {
			System.out.println(ConsoleColor.RED_BACKGROUND + "Please choose a number from below options" + ConsoleColor.RESET);
			AdminOrCustomer();
		}
	}
	
	static void AdminLogin() {
		
		Boolean result = useCases.AdminLogin.AdminLogin();

		if (result) adminMethods();
		else {
			AdminLogin();
		}
	}
	
	static void adminMethods() {
		System.out.println("+--------------------------------+" + "\n"
						 + "| Welcome Admin                  |" + "\n"
						 + "| 1. Add Bus                     |" + "\n"
						 + "| 2. Confirm Tickets of Customer |" + "\n"
						 + "| 3. View All Bookings           |" + "\n"
						 + "| 4. Back                        |" + "\n"
						 + "| 5. Exit                        |" + "\n"
						 + "+--------------------------------+");
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		try {
			choice = sc.nextInt();
			if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
				System.out.println(ConsoleColor.RED_BACKGROUND + "Please choose a number from below options" + ConsoleColor.RESET);
				adminMethods();
			}
			else adminChoice(choice);
		}
		catch (InputMismatchException e) {
			
			System.out.println(ConsoleColor.RED_BACKGROUND + "Input type should be number" + ConsoleColor.RESET);
			adminMethods();
		}
	}
	
	static void adminChoice(int choice) {
		
			switch(choice) {
				case 1 : {
					AddNewBus.AddBus();
					adminMethods();
				}
				break;
				case 2 : {
					UpdateStats.updateStatus();
					adminMethods();
				}
				break;
				case 3 : {
					SeeAllTickets.viewAllTicket();
					adminMethods();
				}
				break;
				case 4 : AdminOrCustomer();
				break;	
				case 5 : {
					System.out.println(ConsoleColor.ROSY_PINK + "Thank you ! Visit again" + ConsoleColor.RESET);
					System.exit(0);
				}
			}
	}
	
	static void customerLoginOrSignup() {
		System.out.println( "+--------------------------------+" + "\n"
				             + "| 1. Login to your Account       |" + "\n"
				             + "| 2. Don't have Account? Sign Up |" + "\n"
				             + "| 3. Back                        |" + "\n"
				             + "| 4. Exit                        |" + "\n"
				             + "+--------------------------------+" );
		try {
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			if (choice == 1) {
				customerLogin();
			}
			else if (choice == 2) {
				customerSignup();
			}
			else if (choice == 3) {
				AdminOrCustomer();
			}
			else if (choice == 4) {
				System.out.println(ConsoleColor.ROSY_PINK + "Thank you ! Visit again" + ConsoleColor.RESET);
				System.exit(0);
			}
			else {
				System.out.println(ConsoleColor.RED_BACKGROUND + "Please choose a number from below options" + ConsoleColor.RESET);
				customerLoginOrSignup();
			}
		}
		catch (InputMismatchException e) {
			System.out.println(ConsoleColor.RED_BACKGROUND + "Input type should be number" + ConsoleColor.RESET);
			customerLoginOrSignup();
		}
		
	}
	
	static void customerLogin() {
		Customers customer = CustomerLogin.CusLogin();
		
		if (customer == null) {
			customerLogin();
		}
		else {
			System.out.println(ConsoleColor.GREEN_BACKGROUND + "Login Successfull" + ConsoleColor.RESET);
			customerMethods(customer);
		}
		
	}
	
	static void customerSignup() {
		boolean flag = CustomerNewSignup.cusSignUp();
		
		if (flag) {
			System.out.println(ConsoleColor.ROSY_PINK + "Login to your Account" + ConsoleColor.RESET);
			customerLogin();
		}
		else {
			customerSignup();
		}
	}
	
	static void customerMethods(Customers customer) {
		System.out.println("+--------------------------------+" + "\n"
				 		 + "| 1. Book Bus Ticket             |" + "\n"
				         + "| 2. Cancel Bus Ticket           |" + "\n"
				         + "| 3. View Status of your Tickets |" + "\n"
				         + "| 4. Back                        |" + "\n"
				         + "| 5. Exit                        |" + "\n"
				         + "+--------------------------------+" );
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		try {
			choice = sc.nextInt();
			if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
				System.out.println(ConsoleColor.RED_BACKGROUND + "Please choose a number from below options" + ConsoleColor.RESET);
				customerMethods(customer);
			}
			else customerChoice(choice, customer);
		}
		catch (InputMismatchException e) {
			
			System.out.println(ConsoleColor.RED_BACKGROUND + "Input type should be number" + ConsoleColor.RESET);
			customerMethods(customer);
		}
	}
	
	static void customerChoice(int choice, Customers customer) {
		switch(choice) {
		case 1 : {
			BookTicket.BookTicketbName(customer);
			customerMethods(customer);
		}
		break;
		case 2 : {
			CancelTicket.cancelTicket(customer);
			customerMethods(customer);
		}
		break;
		case 3 : {
			SeeTickets.viewTicket(customer);
			customerMethods(customer);
		}
		break;
		case 4 : {
			customerLoginOrSignup();
		}
		case 5 : {
			System.out.println("******************!! Thank you ! Visit again !!**********************");
			System.exit(0);
		}
	}
	}

	public static void main(String[] args) {
		
		AdminOrCustomer();
	}

}
