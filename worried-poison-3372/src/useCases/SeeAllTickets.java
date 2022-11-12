package useCases;

import dao.AdminDAO;
import dao.AdminDAOimpl;

public class SeeAllTickets {

public static void viewAllTicket() {
		
		AdminDAO dao = new AdminDAOimpl();
		dao.viewAllTickets();
	}
}
