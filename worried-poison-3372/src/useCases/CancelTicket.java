package useCases;

import java.util.Scanner;

import bean.Customers;
import colors.ConsoleColor;
import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import exceptions.BusException;

public class CancelTicket {

	public  static void cancelTicket(Customers customer) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(ConsoleColor.ORANGE + "Enter Bus Name" + ConsoleColor.RESET);
		String busName = sc.nextLine();
		
		CustomerDAO dao = new CustomerDAOImpl();
		try {
			
			int cusId = customer.getCusId();
			String message = dao.cancelTicket(busName, cusId);
			
			if (message.equals("Ticket cancelled Successfully")) {
				System.out.println(ConsoleColor.GREEN_BACKGROUND + message + ConsoleColor.RESET);
			}
			else {
				System.out.println(ConsoleColor.RED_BACKGROUND + message + ConsoleColor.RESET);
			}
			
		} catch (BusException e) {
			System.out.println(ConsoleColor.RED_BACKGROUND + e.getMessage() + ConsoleColor.RESET);
		}
	}
}
