package kvtproject3;

//Class that defines an order
public class Order {
	//Declare class variables
	private Car orderCustomer;	
	//Declare class variable for orderID
	private String orderID;
	
	//Constructor with a String variable called anID
	public Order(String anID){
		orderID = anID;
	}
	//Getter to get order ID
	public String getOrderID(){
		return orderID;
	}
	//Setter to assign OrderID
	public void setOrderID(String anID){
		//Pass value to variable called orderID
		orderID = anID;
	}
	//Setter to assign customer
	public void setOrderCustomer(Car aCustomer){
		orderCustomer = aCustomer;
	}
	//Returns the customer
	public Car getCustomer(){
		return orderCustomer;
	}

}//End of Order class