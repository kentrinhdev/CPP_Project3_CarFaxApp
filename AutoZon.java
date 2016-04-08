package kvtproject3;

import javax.swing.JOptionPane;
import java.util.HashMap;

//Class that defines the AutoZon
public class AutoZon {
	
	//Hashmap to hold orders the key pair value consists of (OrderID, Order Object)
	// OrderID is a String
	private HashMap<String,Order>jvzOrder;		
	
	//Constructor for JavaZon
	public AutoZon(){;
		//initialize the Orders Hash Map called jvzOrder
		jvzOrder = new HashMap<String,Order>();
	}
	//Method to add order
	public void addOrder(Order anOrder){
		//TODO: Code to add an order to the HashMap
		//USE THE jvzOrder object and add a new order to the hashmap
		//you need to use the orderid and the order object (anOrder)
		//The order id value is located in the order object
		this.jvzOrder.put(anOrder.getOrderID(), anOrder);
	}
	//Method to get order summary
	public String getOrdersSummary(){
		
		Order selectedOrder;
		Car selectedCustomer;
		String vinNumber;
		String result = null;
		
		//TODO 
		//For Loop through the orders in the HashMap
		//Retrieve each order and store it in the selectedOrder object
		//retrieve the customer using the getCustomer method of the selectedOrder
		//Store the customer in the selectedCustomer object
		//retrieve the customer first/last name from the selectCustomer Object
		//retrieve the order total from the selectedOrder object
		//return a String result that has all the orders in the HashMap
		//See screen printout for an example of what the result should look like

		int count = 0;
		count = jvzOrder.size() + 1;
		
		for(String anOrder : jvzOrder.keySet()) {
			//Get order information
			selectedOrder = jvzOrder.get(anOrder);
			vinNumber = selectedOrder.getOrderID();
			//Get customer information
			selectedCustomer = selectedOrder.getCustomer();
			
			vinNumber = selectedCustomer.getVin();
			String carMake = selectedCustomer.getCarMake();
			String carModel = selectedCustomer.getCarModel();
			String carYear = selectedCustomer.getCarYear();
			
			//Minus one from the count to show the records are counted down
			count--;
			
			//Output message with order details
			JOptionPane.showMessageDialog(null,"Car Record #: [" + count + "]\nVIN Number: [" + vinNumber + "]\nCar Make: [" + carMake 
												+ "]\nCar Model: [" + carModel + "]\nCar Year: [" + carYear + "]\n\n"
												+  "Click OK to view the next record.");
			
			//Set result back to null
			result = null;
		}
		return result;
		
	}//End of getOrderSummary method
	
	//Method to delete order
	public String deleteOrder(String anID){
		
		String result = "";
		
		//TODO 
		//check if the HashMap contains the order
		//If it does then remove that order from the hashMap
		//Return a message that displays the OrderID has been
		//Deleted Or not found
		//put the result from the delete into the string result
		for (int i = 0; i < jvzOrder.size(); i++){
			if(jvzOrder.containsKey(anID)){
				jvzOrder.remove(anID);
				result = "The Order ID [" + anID + "] has been deleted!";	
			}
			else{
			    result = "Not able to delete. The Order ID [" + anID + "] was not found!";
			}
		}
		return result;
	}//End of deleteOrder method
	
	//----------------------------------------------------------------------------------------------------
	//Method to find order
	//----------------------------------------------------------------------------------------------------
	public Order findOrder(String anID){
		
		String result = "";
		Order selectedOrder = null;
		
		//TODO 
		//check if the HashMap contains the order
		//If it does then store the order in selectedOrder and return selectedOrder
		//If the order is not found then return a null
		/////// boolean orderExists = jvzOrder.containsValue(anID);
		for (int i = 0; i < jvzOrder.size(); i++){
			if(jvzOrder.containsKey(anID)){
				//selectedOrder = jvzOrder.get(findOrder(anID));
				selectedOrder = jvzOrder.getOrDefault(anID, selectedOrder);
				result = "The Order ID [" + anID + "] has been found!";	
			}
			else{
			selectedOrder = null;
			result = "Not able to find. The Order ID [" + anID + "] was not found!";
			}
		}
		return selectedOrder;
	}//End of findOrder method
	
	//----------------------------------------------------------------------------------------------------
	//Method to clear orders
	//----------------------------------------------------------------------------------------------------
	public void clearOrders(){
		//TODO 
		//Clear the Hash Map of all orders
		jvzOrder.clear();
	}//End of findOrder method
	
	//----------------------------------------------------------------------------------------------------
	//Method to export all records on exit
	//----------------------------------------------------------------------------------------------------
	public String allHashMap(){
		Order selectedOrder;
		Car selectedCustomer;
		String vinNumber;
		String result = "";
		
		int count = 0;
		count = jvzOrder.size() + 1;
		
		for(String anOrder : jvzOrder.keySet()) {
			//Get order information
			selectedOrder = jvzOrder.get(anOrder);
			vinNumber = selectedOrder.getOrderID();
			//Get customer information
			selectedCustomer = selectedOrder.getCustomer();
			
			vinNumber = selectedCustomer.getVin();
			String carMake = selectedCustomer.getCarMake();
			String carModel = selectedCustomer.getCarModel();
			String carYear = selectedCustomer.getCarYear();
			
			//Minus one from the count to show the records are counted down
			count--;

			//Add stored values for each field to result
			result += vinNumber + ",";
			result += carMake + ",";
			result += carModel + ",";
			result += carYear;
			result += "\r\n";
			
		}
		return result;
	}//End of allHashMap method

}//End of AutoZon class