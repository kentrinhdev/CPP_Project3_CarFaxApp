package kvtproject3;

//Class that defines Car that inherits from Auto class
public class Car extends Auto {

	//Constructor for the Auto class
	public Car(String vinNumber, String carMake, String carModel, String carYear) {
		
		super(vinNumber, carMake, carModel, carYear);
	}
	
	//Method to return summary about object
	public String toString(){
		String result="";
		
		result += super.toString();
		return result;
	}

}//End of Car class