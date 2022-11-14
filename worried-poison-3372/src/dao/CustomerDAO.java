package dao;

import bean.Customers;
import exceptions.BusException;
import exceptions.CustomerException;

public interface CustomerDAO {

public String cusSignUp (String username, String password, String firstName, String lastName, String address, String PhNo) ;
	
	public String cusSignUp (Customers customer);
	
	public Customers cusLogin (String username, String password) throws CustomerException;
	
	public String bookTicket (String busName, int cusId, int no) throws BusException;
	
	public String cancelTicket(String busName, int cusId) throws BusException;
	
	public void viewTicket(int cusId);
}
