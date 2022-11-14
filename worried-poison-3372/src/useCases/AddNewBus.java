package useCases;

import java.util.InputMismatchException;
import java.util.Scanner;

import bean.Bus;
import colors.ConsoleColor;
import dao.AdminDAO;
import dao.AdminDAOimpl;

public class AddNewBus {

	public static void AddBus() {

		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println(ConsoleColor.ORANGE + "Enter Bus number" + ConsoleColor.RESET);
			int busNo = sc.nextInt();
			
			System.out.println(ConsoleColor.ORANGE + "Enter bus name" + ConsoleColor.RESET);
			String busName = sc.next();
			
			System.out.println(ConsoleColor.ORANGE + "Enter Route from" + ConsoleColor.RESET);
			String routeFrom = sc.next();
			
			System.out.println(ConsoleColor.ORANGE + "Enter Routo To" + ConsoleColor.RESET);
			String routeTo = sc.next();
			
			System.out.println(ConsoleColor.ORANGE + "Enter Bus Type - AC / NonAC" + ConsoleColor.RESET);
			String busType = sc.next();
			
			sc.nextLine();
			System.out.println(ConsoleColor.ORANGE + "Enter Departure date and time in format (YYYY-MM-DD HH:MI:SS)" + ConsoleColor.RESET);
			String departure = sc.nextLine();
			
			System.out.println(ConsoleColor.ORANGE + "Enter Arrival date and time in format (YYYY-MM-DD HH:MI:SS)" + ConsoleColor.RESET);
			String arrival = sc.nextLine();
			
			System.out.println(ConsoleColor.ORANGE + "Enter Total Seats" + ConsoleColor.RESET);
			int totalSeats = sc.nextInt();
			
			System.out.println(ConsoleColor.ORANGE + "Enter Available Seats" + ConsoleColor.RESET);
			int availSeats = sc.nextInt();
			
			System.out.println(ConsoleColor.ORANGE + "Enter fare" + ConsoleColor.RESET);
			int fare = sc.nextInt();
			
			Bus bus = new Bus(busNo, busName, routeFrom, routeTo, busType, departure, arrival, totalSeats, availSeats, fare);
			
			AdminDAO dao = new AdminDAOimpl();
			
			String result = dao.addBus(bus);
			
			if (result.equals("Bus added Successfully")) {
				System.out.println(ConsoleColor.GREEN_BACKGROUND + result + ConsoleColor.RESET);
			}
			else {
				System.out.println(ConsoleColor.RED_BACKGROUND + result + ConsoleColor.RESET);
			}
		}
		catch (InputMismatchException e) {
			System.out.println(ConsoleColor.RED_BACKGROUND + "Invalid input" + ConsoleColor.RESET);
		}
    }
}
