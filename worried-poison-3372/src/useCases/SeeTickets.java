package useCases;

import bean.Customers;
import dao.CustomerDAO;
import dao.CustomerDAOImpl;

public class SeeTickets {

public static void viewTicket(Customers customer) {
		
		CustomerDAO dao = new CustomerDAOImpl();
		
		dao.viewTicket(customer.getCusId());
	}
}
