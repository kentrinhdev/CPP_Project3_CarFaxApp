package kvtproject3;

//Class that defines automobile
public class Auto {
	private String vinNumber;
	private String carMake;
	private String carModel;
	private String carYear;

	//Constructor for Auto class
	public Auto(String aVinNumber, String aCarMake, String aCarModel, String aCarYear){
		vinNumber = aVinNumber;
		carMake = aCarMake;
		carModel = aCarModel;
		carYear = aCarYear;
	}
	//Stores values and messages to the result variable
	public String toString(){
		String result="";
		
		result += "VIN Number: " + vinNumber + "\n";
		result += "Car Make: " + carMake + "\n";
		result += "Car Model: " + carModel + "\n";
		result += "Car Year: " + carYear + "\n";

		return result;
	}

	//-----------------------------------------------------------
	// Getter and Setter for VIN Number
	//-----------------------------------------------------------
	public String getVin() {
		return vinNumber;
	}
	public void setVin(String vinNumber) {
		this.vinNumber = vinNumber;
	}
	//-----------------------------------------------------------
	// Getter and Setter for Car Make
	//-----------------------------------------------------------
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	//-----------------------------------------------------------
	// Getter and Setter for Car Model
	//-----------------------------------------------------------
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	//-----------------------------------------------------------
	// Getter and Setter for Car Year
	//-----------------------------------------------------------
	public String getCarYear() {
		return carYear;
	}
	public void setCarYear(String carYear) {
		this.carYear = carYear;
	}

}//End of Auto class