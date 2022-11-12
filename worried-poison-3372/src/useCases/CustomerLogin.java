package useCases;

import java.util.InputMismatchException;
import java.util.Scanner;

import bean.Customers;
import colors.ConsoleColor;
import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import exceptions.CustomerException;

public class CustomerLogin {

public static Customers CusLogin() {
		
		Customers customer = null;
		
		try {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println(ConsoleColor.ORANGE + "Enter Username" + ConsoleColor.RESET);
			String username = sc.next();
			
			System.out.println(ConsoleColor.ORANGE + "Enter Password" + ConsoleColor.RESET);
			String password = sc.next();
			
			CustomerDAO dao = new CustomerDAOImpl();
			
			try {
				customer = dao.cusLogin(username, password);
				
				System.out.println(ConsoleColor.ROSY_PINK + "Welcome " + customer.getFirstName() + " " + customer.getLastName() + ConsoleColor.RESET);
			} catch (CustomerException e) {
				
				System.out.println(ConsoleColor.RED_BACKGROUND + e.getMessage() + ConsoleColor.RESET);
			}
		}
		catch (InputMismatchException e) {
			System.out.println(ConsoleColor.RED_BACKGROUND + e.getMessage() + ConsoleColor.RESET);
		}
		
		return customer;

	}

}
