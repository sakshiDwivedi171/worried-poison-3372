package useCases;

import java.util.InputMismatchException;
import java.util.Scanner;

import bean.Customers;
import colors.ConsoleColor;
import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import exceptions.BusException;

public class BookTicket {

public static void BookTicketbName(Customers customer) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(ConsoleColor.ORANGE + "Enter Bus Name" + ConsoleColor.RESET);
		String bName = sc.next();
		
		CustomerDAO dao = new CustomerDAOImpl();
		try {
			System.out.println(ConsoleColor.ORANGE + "Enter no. of Tickets to Book" + ConsoleColor.RESET);
			int no = sc.nextInt();
			
			int cusId = customer.getCusId();
			String message = dao.bookTicket(bName, cusId, no);
			
			if (message.equals("Ticket Booked Successfully")) {
				System.out.println(ConsoleColor.GREEN_BACKGROUND + message + ConsoleColor.RESET);
			}
			else {
				System.out.println(ConsoleColor.RED_BACKGROUND + message + ConsoleColor.RESET);
			}
			
		} catch (BusException e) {
			System.out.println(ConsoleColor.RED_BACKGROUND + e.getMessage() + ConsoleColor.RESET);
		}
		catch (InputMismatchException e) {
			System.out.println(ConsoleColor.RED_BACKGROUND + "Invalid input" + ConsoleColor.RESET);
		}
   }
}
