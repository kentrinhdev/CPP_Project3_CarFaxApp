package kvtproject3;

//Class that defines the validator
public class CarFaxValidator {
	//TODO - CODE THE VALIDATOR
	//add the method that will validate all the input
	//collected from the form
	
	//static variable to hold any error that occurs
	private static String errorMessage = "";
	
	//----------------------------------------------------------------------------------------------------------------------------
	//	Validate the VIN Number
	//----------------------------------------------------------------------------------------------------------------------------
	public static String getVin(String aVin){
		//run the validation
		//add any errors to the error message
		if (aVin.length() != 5){
			errorMessage += "VIN Number: [" + aVin + "] is invalid!\n"
							+ "Re-Enter the 5-Character VIN number. \n\n";
		}
		return aVin;
	}
	//----------------------------------------------------------------------------------------------------------------------------
	//	Validate the Car Make
	//----------------------------------------------------------------------------------------------------------------------------
	private static boolean isValidCarMake(String aCarMake){
		boolean result = false;
		//TODO add your code here
		if(aCarMake.matches("[a-zA-Z ,]+") && aCarMake != null && aCarMake.length() >= 2){
			result = true;
		}
		return result;
	}
	public static String getCarMake(String aCarMake){
		if(isValidCarMake(aCarMake) == false){
			errorMessage += "The Car Make entered: [" + aCarMake + "] is invalid!\nRe-Enter the Car Make. \n\n";
		}
		return aCarMake;
	}
	//----------------------------------------------------------------------------------------------------------------------------
	//	Validate the Car Model
	//----------------------------------------------------------------------------------------------------------------------------
	private static boolean isValidCarModel(String aCarModel){
		boolean result = false;
		//TODO add your code here
		if(aCarModel != null && aCarModel.length() >= 2){
			result = true;
		}
		return result;
	}
	public static String getCarModel(String aCarModel){
		if(isValidCarModel(aCarModel) == false){
			errorMessage += "The Car Model entered: [" + aCarModel + "] is invalid!\nRe-Enter the Car Model. \n\n";
		}
		return aCarModel;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the Car Year
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidYear(String aYear){
		boolean result = false;
		//TODO add your code here
		if(aYear.matches("\\d{4}") && aYear != null && aYear.length() == 4){
			result = true;
		}
		return result;
	}
	public static String getYear(String aYear){
		if(isValidYear(aYear) == false){
			errorMessage += "The Year entered: [" + aYear + "] is invalid!\nRe-Enter the 4-digit Year. \n\n";
		}
		return aYear;
	}
	//-------------------------------------------------------------------------------------------------
	//	Create Getter method for error message
	//-------------------------------------------------------------------------------------------------
	//method to Get and return the error message	
	public static String getError(){
		return errorMessage;
	}
	//-------------------------------------------------------------------------------------------------
	//	Create method to clear out error messages
	//-------------------------------------------------------------------------------------------------
	//method to clear the error message
	public static void clearError(){
		errorMessage = "";
	}

}//End of Validator class