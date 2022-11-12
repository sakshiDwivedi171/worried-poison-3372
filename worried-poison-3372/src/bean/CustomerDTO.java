package bean;

public class CustomerDTO {

	 private int BookId;
	 private String firstName;
	 private String lastName;
	 private String phNo;
	 private int busNo;
	 private String busName;
	 private String routeFrom;
	 private String routeTo;
	 private String arrival;
	 private String departure;
	 private int cost;
	 private int seatFrom;
	 private int seatTo;
	 private boolean status;
	 
	 
	 
	 
	@Override
	public String toString() {
		return "CustomerDTO [BookId=" + BookId + ", firstName=" + firstName + ", lastName=" + lastName + ", phNo="
				+ phNo + ", busNo=" + busNo + ", busName=" + busName + ", routeFrom=" + routeFrom + ", routeTo="
				+ routeTo + ", arrival=" + arrival + ", departure=" + departure + ", cost=" + cost + ", seatFrom="
				+ seatFrom + ", seatTo=" + seatTo + ", status=" + status + "]";
	}
	
	
	
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getRouteFrom() {
		return routeFrom;
	}
	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}
	public String getRouteTo() {
		return routeTo;
	}
	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getSeatFrom() {
		return seatFrom;
	}
	public void setSeatFrom(int seatFrom) {
		this.seatFrom = seatFrom;
	}
	public int getSeatTo() {
		return seatTo;
	}
	public void setSeatTo(int seatTo) {
		this.seatTo = seatTo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}



	public CustomerDTO(int bookId, String firstName, String lastName, String phNo, int busNo, String busName,
			String routeFrom, String routeTo, String arrival, String departure, int cost, int seatFrom, int seatTo,
			boolean status) {
		super();
		BookId = bookId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phNo = phNo;
		this.busNo = busNo;
		this.busName = busName;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.arrival = arrival;
		this.departure = departure;
		this.cost = cost;
		this.seatFrom = seatFrom;
		this.seatTo = seatTo;
		this.status = status;
	}
	 
	 

}
