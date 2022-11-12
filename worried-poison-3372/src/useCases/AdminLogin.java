package useCases;

import java.util.Scanner;

import colors.ConsoleColor;
import dao.AdminDAO;
import dao.AdminDAOimpl;

public class AdminLogin {
	
public static boolean AdminLogin() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(ConsoleColor.ORANGE +  "Enter username" + ConsoleColor.RESET);
		String username = sc.next();
		
		System.out.println(ConsoleColor.ORANGE + "Enter password" + ConsoleColor.RESET);
		String password = sc.next();
		
		AdminDAO dao = new AdminDAOimpl();
		String result =  dao.adminLogin(username, password);
		
		if (result.equals("Login Successfull")){
			System.out.println(ConsoleColor.GREEN_BACKGROUND + result + ConsoleColor.RESET);
			return true;
		}
		else {
			System.out.println(ConsoleColor.RED_BACKGROUND + result + ConsoleColor.RESET);
			return false;
		}
	}

}
