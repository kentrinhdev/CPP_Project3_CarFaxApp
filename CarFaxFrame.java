package kvtproject3;
//Import applicable utilities
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

//Class that defines the CarFaxFrame that inherits from JFrame and
// then interfaces with ActionListener and ItemListener
public class CarFaxFrame extends javax.swing.JFrame implements ActionListener, ItemListener {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Declare variables
	private JPanel jPanel1;
	/////////// private Menu menu;
	private AutoZon jz;
	//---------------------------------------------------------------------------------------
	// Row 1 Title for Application
	//---------------------------------------------------------------------------------------
	private JLabel lblTitle;
	//---------------------------------------------------------------------------------------
	// Rows 2 VIN Number
	//---------------------------------------------------------------------------------------
	private JLabel lblVinNumber;
	private JTextField txtVinNumber;
	//---------------------------------------------------------------------------------------
	// Row 3 Car Make
	//---------------------------------------------------------------------------------------
	private JLabel lblCarMake;
	private JTextField txtCarMake;
	//---------------------------------------------------------------------------------------
	// Row 4 Car Model
	//---------------------------------------------------------------------------------------
	private JLabel lblCarModel;
	private JTextField txtCarModel;
	//---------------------------------------------------------------------------------------
	// Row 5 Car Year
	//---------------------------------------------------------------------------------------
	private JLabel lblCarYear;
	private JTextField txtCarYear;
	//---------------------------------------------------------------------------------------
	// Row 6 Add, Delete, List, Update buttons
	//---------------------------------------------------------------------------------------
	private JButton btnAdd,btnDelete,btnList,btnUpdate;
	//---------------------------------------------------------------------------------------
	// Row 7 Import, Export, Reset, Clear buttons
	//---------------------------------------------------------------------------------------
	private JButton btnImport,btnExport,btnReset,btnClear;
	//---------------------------------------------------------------------------------------
	// Row 8 Find, Exit buttons
	//---------------------------------------------------------------------------------------
	private JLabel lblFind;
	private JButton btnFind,btnExit;
	private JTextField txtFind;
	
	
	//Constructor for CarFaxFrame
	public CarFaxFrame(){		
		//Try and catch method
		try {
			//Instantiate new instance of JavaZon and Menu objects called jz and menu
			jz = new AutoZon();
			/////////// menu = new Menu();
			
			//Instantiate new instance of GridLayout object called thisLayout
			GridLayout thisLayout = new GridLayout(1,1);
			//Set number of columns
			thisLayout.setColumns(1);
			//Set horizontal and vertical gaps
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			
			//Set the layout for the objects to be placed into the panel
			getContentPane().setLayout(thisLayout);
			//Set up panel by creating a new JPanel object
			jPanel1 = new JPanel();
			getContentPane().add(jPanel1);
			GridBagLayout jPanel1Layout = new GridBagLayout();
			jPanel1Layout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1};
			jPanel1Layout.rowHeights = new int[] {7, 7, 7, 7, 7, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 7, 20, 20};
			jPanel1Layout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1};
			jPanel1Layout.columnWidths = new int[] {20, 5, 90, 100, 100, 100, 100, 50, 20};
			
			jPanel1.setLayout(jPanel1Layout);
			jPanel1.setPreferredSize(new java.awt.Dimension(499, 426));
			
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			// Label for the header title of the application
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			lblTitle = new JLabel();
			jPanel1.add(lblTitle, new GridBagConstraints(3, 2, 3, 2, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			lblTitle.setText("Welcome to Java DB CarFax");
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			// Row 2 Label and Text field for VIN Number
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			this.lblVinNumber = new JLabel();
			jPanel1.add(lblVinNumber, new GridBagConstraints(2, 6, 3, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblVinNumber.setText("VIN Number:");

			this.txtVinNumber = new JTextField();
			jPanel1.add(txtVinNumber, new GridBagConstraints(3, 6, 4, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtVinNumber.setPreferredSize(new java.awt.Dimension(110, 24));
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			// Row 3 Label and Text field for Car Make
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			this.lblCarMake = new JLabel();
			jPanel1.add(lblCarMake, new GridBagConstraints(2, 8, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblCarMake.setText("Car Make:");
			
			this.txtCarMake = new JTextField();
			jPanel1.add(txtCarMake, new GridBagConstraints(3, 8, 4, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtCarMake.setPreferredSize(new java.awt.Dimension(110, 24));
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			// Row 4 Label and Text field for Car Model
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			this.lblCarModel = new JLabel();
			jPanel1.add(lblCarModel, new GridBagConstraints(2, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblCarModel.setText("Car Model:");
			
			this.txtCarModel = new JTextField();
			jPanel1.add(txtCarModel, new GridBagConstraints(3, 10, 4, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtCarModel.setPreferredSize(new java.awt.Dimension(110, 24));
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			// Row 5 Label and Text field for Car Year
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			this.lblCarYear = new JLabel();
			jPanel1.add(lblCarYear, new GridBagConstraints(2, 12, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblCarYear.setText("Car Year:");
			
			this.txtCarYear = new JTextField();
			jPanel1.add(txtCarYear, new GridBagConstraints(3, 12, 4, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtCarYear.setPreferredSize(new java.awt.Dimension(110, 24));							
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			// Row 6 Add, Delete, List, Update buttons
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			btnAdd = new JButton();
			jPanel1.add(btnAdd, new GridBagConstraints(3, 14, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnAdd.setText("Add");
			btnAdd.addActionListener(this);
			
			btnDelete = new JButton();
			jPanel1.add(btnDelete, new GridBagConstraints(4, 14, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnDelete.setText("Delete");
			btnDelete.addActionListener(this);
			
			btnList = new JButton();
			jPanel1.add(btnList, new GridBagConstraints(5, 14, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnList.setText("List");
			btnList.addActionListener(this);
			
			btnUpdate = new JButton();
			jPanel1.add(btnUpdate, new GridBagConstraints(6, 14, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnUpdate.setText("Update");
			btnUpdate.addActionListener(this);
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			// Row 7 Import, Export, Reset, Clear buttons
			//------------------------------------------------------------------------------------------------------------------------------------------------------------			
			btnImport = new JButton();
			jPanel1.add(btnImport, new GridBagConstraints(3, 15, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnImport.setText("Import");
			btnImport.addActionListener(this);
			
			btnExport = new JButton();
			jPanel1.add(btnExport, new GridBagConstraints(4, 15, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnExport.setText("Export");
			btnExport.addActionListener(this);
			
			btnClear = new JButton();
			jPanel1.add(btnClear, new GridBagConstraints(6, 15, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnClear.setText("Clear");
			btnClear.addActionListener(this);
			
			btnReset = new JButton();
			jPanel1.add(btnReset, new GridBagConstraints(5, 15, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnReset.setText("Reset");
			btnReset.addActionListener(this);
			//------------------------------------------------------------------------------------------------------------------------------------------------------------
			// Row 8 Find, Exit buttons
			//------------------------------------------------------------------------------------------------------------------------------------------------------------	
			this.lblCarYear = new JLabel();
			jPanel1.add(lblCarYear, new GridBagConstraints(3, 17, 4, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblCarYear.setText("Enter VIN Number then click Find:");
			
			btnFind = new JButton();
			jPanel1.add(btnFind, new GridBagConstraints(2, 18, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			btnFind.setText("Find");
			btnFind.addActionListener(this);
			
			this.txtFind = new JTextField();
			jPanel1.add(txtFind, new GridBagConstraints(3, 18, 3, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtFind.setPreferredSize(new java.awt.Dimension(110, 24));	
		
			btnExit = new JButton();
			jPanel1.add(btnExit, new GridBagConstraints(7, 18, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnExit.setText("Exit");
			btnExit.addActionListener(this);
					
			//TODO ADD THE REST OF THE CONTROLS
			//REFER TO HANDOUT FOR THE CONTROLS NEEDED
			//AND THE LOCATION OF EACH ITEM
			pack();
			this.setSize(600, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//End of CarFaxFrame constructor
	
	//Responses to any actions
	public void actionPerformed(ActionEvent e) {
		
		//based on the object that triggered the event
		// call the appropriate method
		Object o = e.getSource();
		
		//If Add button is clicked Call addOrder
	    if (o == this.btnAdd) {
	    	addOrder();
		}
	    //If Delete button is clicked Call deleteOrder
	    else if (o == this.btnDelete) {
		    deleteOrder();
	    }
	    //If List button is clicked Call listOrders
		else if (o == this.btnList) {
		    listOrders();
		}
	    //If Update button is clicked Call updateOrder
		else if (o == this.btnUpdate) {
		    updateOrder();
		}
	    //---------------------------------------------
	    //If Import button is clicked Call importOrder
		else if (o == this.btnImport) {
			importOrder();
		}
	    //If Export button is clicked Call exportOrder
	    else if (o == this.btnExport) {
	      	try {
				exportOrder();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    //If Reset button is clicked Call resetForm
		else if (o == this.btnReset) {
		    resetForm();
		}
		//If Clear button is clicked Call clearOrders
		else if (o == this.btnClear) {
		    clearOrders();
		} 
	  //---------------------------------------------
	    //If Find button is clicked Call findOrder
	    else if (o == this.btnFind) {
		    findOrder();
		} 
	    //If Exit button is clicked Call exitApp
	    else if (o == this.btnExit) {
	      	try {
				exitApp();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    } 
	}//End actionPerformed method
	
	//Return prices based on which combo box item is selected
	public void itemStateChanged(ItemEvent e) {
		//example of method to display the price of the product
		//based on what item was selected
		Object o = e.getSource();
	}//End of itemStateChanged method
	
	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	// Method to Add Individual Orders 
	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	private void addOrder(){		
		//Clear errors by calling the clearError method from the Validator class
		//	before we start processing we clear any errors
		CarFaxValidator.clearError();

		//CREATE VARIABLES TO HOLD INPUT
		//TODO
		//PASS THE INPUT TO THE VALIDATOR
		//THE ONLY VALIDATION IN THIS PROJECT
		//IS THAT STRING VALUES ARE NOT BLANK
		//AND NUMERICAL VALUES ARE THE CORRECT TYPE
		//FOR EXAMPLE QUANTITY SHOULD BE INTEGER
		//PRICE SHOULD BE DOUBLE
		//EVERYTHING ELSE IS OK
		
		//Validate Order ID and First Name fields
		//add the other variables to hold your values from the validator in here
		//see below what variables you will need to create a customer object and an order object
		//Validate Last Name, Street, City, State, Zip, Phone, and Membership fields
		String vinNumber = CarFaxValidator.getVin(this.txtVinNumber.getText());
		String carMake = CarFaxValidator.getCarMake(this.txtCarMake.getText());
		String carModel = CarFaxValidator.getCarModel(this.txtCarModel.getText());
		String carYear = CarFaxValidator.getYear(this.txtCarYear.getText());
		
	    //Validate errors found, alert user, then stop
		//if there are errors then display them to the user
		//otherwise start creating the objects for the order
		if (CarFaxValidator.getError().length() != 0){
			JOptionPane.showMessageDialog(null, "An Error Occured:\n\n" + CarFaxValidator.getError());
		}
		else{
			//Block of code when no errors found
			//Instantiate new Customer object instance called customer with parameterized variables
			Car car = new Car(vinNumber, carMake, carModel, carYear);
			
			//Instantiate a new instance of the Order object called order
			Order order = new Order(vinNumber);
			//Get parameter values then pass them to the order object
			order.setOrderCustomer(car);
			//Call and run the addOrder method from the JavaZon class with the order values
			jz.addOrder(order);
			
			//JOptionPane.showMessageDialog(null, jz.getReceipt(orderID));
			JOptionPane.showMessageDialog(null,"VIN Number: [" + vinNumber + "] was added and saved!");
		}
		
		//ADD code here to reset the form to a blank state
		if (CarFaxValidator.getError().length() == 0){
			for (java.awt.Component c : this.jPanel1.getComponents()) {
		        if (c instanceof JTextField) {
		          JTextField tx = (JTextField) c;
		          tx.setText("");
		        } else if (c instanceof JComboBox) {
		          try {
		            JComboBox cb = (JComboBox) c;
		            cb.setSelectedIndex(-1);
		          }catch (Exception ex) {
		        }
		      }
		        this.txtVinNumber.setText("");
		        this.txtCarMake.setText("");
		        this.txtCarModel.setText("");
		        this.txtCarYear.setText("");
		        
		        //Set focus back on the VIN Number field
		        txtVinNumber.requestFocus();
		  }
		}
	}//End of addOrder method

	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	// Method to Delete Individual Orders 
	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	private  void deleteOrder(){
		String vinNumber = JOptionPane.showInputDialog("Enter VIN Number to delete car record:");
		Order foundOrder = jz.findOrder(vinNumber);
		if(foundOrder != null){
			//Match the entered number then call the deleteOrder method from the JavaZon class
			jz.deleteOrder(vinNumber);
			JOptionPane.showMessageDialog(null,"VIN Number: [" + vinNumber + "] has been deleted!");
		}
		else if(vinNumber == null){
			JOptionPane.showMessageDialog(null,"Delete car record process was cancelled!");
		}
		else{
			JOptionPane.showMessageDialog(null,"No Car Records were deleted!\nVIN Number cannot be blank or "
												+ "VIN Number: [" + vinNumber + "] has no match!");
		}
		
		//ADD code here to reset the form to a blank state
		for (java.awt.Component c : this.jPanel1.getComponents()) {
	        if (c instanceof JTextField) {
	        	JTextField tx = (JTextField) c;
	        	tx.setText("");
	        	
	        	String find = null;
				//Assign the value back into txtFind after all text fields are cleared
				this.txtFind.setText(find);
	        } 
	        else if (c instanceof JComboBox) {
	          
	        	try {
	            	JComboBox cb = (JComboBox) c;
	            	cb.setSelectedIndex(-1);
	        	}
	        	catch (Exception ex) {
	        		//ignore error
	        	}
	        }
	    }
		
	}//End of deleteOrder method

	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	// Method to Find Individual Orders 
	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	private  void findOrder(){
		//TODO
		//Fill the screen with the order that was retrieved
		//All the fields should be blanked out and filled with the values from the new order
		//String vinNumber = JOptionPane.showInputDialog("Enter Order ID to Find a particular order");
		String vinNumber = this.txtFind.getText();
		Order foundOrder = jz.findOrder(vinNumber);
		
		if (foundOrder != null){
			Car foundCustomer = foundOrder.getCustomer();
			
			this.txtVinNumber.setText(foundOrder.getOrderID());
			this.txtCarMake.setText(foundCustomer.getCarMake());
			this.txtCarModel.setText(foundCustomer.getCarModel());
			this.txtCarYear.setText(foundCustomer.getCarYear());
			
			JOptionPane.showMessageDialog(null, "The VIN Number: [" + vinNumber + "] was Found and loaded to the form!"
												+ "\nClick OK to continue.");
		} else{
				JOptionPane.showMessageDialog(null, "The VIN Number: [" + vinNumber + "] was not found!");
			  }
	}//End of findOrder method

	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	// Method to Clear All Orders from the Hash Map Database
	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	private  void clearOrders(){
		//clear orders
		jz.clearOrders();
		JOptionPane.showMessageDialog(null, "All Car Records have been Cleared!");
		
		//ADD code here to reset the form to a blank state
		if (CarFaxValidator.getError().length() == 0){
			for (java.awt.Component c : this.jPanel1.getComponents()) {
		        if (c instanceof JTextField) {
		          JTextField tx = (JTextField) c;
		          tx.setText("");
		        } else if (c instanceof JComboBox) {
		          try {
		            JComboBox cb = (JComboBox) c;
		            cb.setSelectedIndex(-1);
		          }catch (Exception ex) {
		        }
		      }
				this.txtVinNumber.setText("");
				this.txtCarMake.setText("");
				this.txtCarModel.setText("");
				this.txtCarYear.setText("");
		  }
		}
	}//End of clearOrders method

	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	// Method to List All Orders available
	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	private void listOrders(){
		//list summary of orders
		String result = jz.getOrdersSummary();
		//Check to make sure that the order summary does or does not have any stored summaries
		// if the order summary is empty then show message that there is nothing to list
		if (result != null){
			JOptionPane.showMessageDialog(null,result);
		}
		else{
			JOptionPane.showMessageDialog(null, "No car records are available to List!");
		}
		
        //Set focus back on the VIN Number field
        txtVinNumber.requestFocus();
	}//End of listOrders method

	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	// Method to Reset the Entire Form 
	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	public void resetForm(){
		//TODO
		//Show message that form has been reset
		JOptionPane.showMessageDialog(null, "The CarFax entry form will be reset!\nClick OK to continue.");
		String find = this.txtFind.getText();
		
		//ADD code here to reset the form to a blank state
		for (java.awt.Component c : this.jPanel1.getComponents()) {
	        if (c instanceof JTextField) {
	        	JTextField tx = (JTextField) c;
	        	tx.setText("");
	        	
	        	//Assign the value back into txtFind after all text fields are cleared
				this.txtFind.setText(find);
	        } 
	        else if (c instanceof JComboBox) {
	          
	        	try {
	            	JComboBox cb = (JComboBox) c;
	            	cb.setSelectedIndex(-1);
	        	}
	        	catch (Exception ex) {
	        		//ignore error
	        	}
	        }
	    }
	}//End of resetForm method

	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	// Method to Update Individual Orders 
	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	private void updateOrder() {
		//Validate all text fields
		String vinNumber = CarFaxValidator.getVin(this.txtVinNumber.getText());
		String carMake = CarFaxValidator.getCarMake(this.txtCarMake.getText());
		String carModel = CarFaxValidator.getCarModel(this.txtCarModel.getText());
		String carYear = CarFaxValidator.getYear(this.txtCarYear.getText());
	    	    
	    //Validate errors found, alert user, then stop
		//if there are errors then display them to the user
		//otherwise start creating the objects for the order
		if (CarFaxValidator.getError().length() != 0){
			JOptionPane.showMessageDialog(null, "An Error Occured:\n\n" + CarFaxValidator.getError());
			CarFaxValidator.clearError();
		}
		else{
			//Code block when there are no errors found
			Car car = new Car(vinNumber, carMake, carModel, carYear);
			Order order = new Order(vinNumber);
			order.setOrderCustomer(car);

			jz.addOrder(order);

			//TODO
			//INSTEAD OF GET RECEIPT YOU NEED TO GREATE METHODS THAT
			//WILL RETURN INDIVIDUAL VALUES
			//FOR EACH LINE ITEM RETRIEVE THE TOTALS
			//FOR THE WHOLE ORDER RETRIEVE THE SUBTOTAL, TAX, TOTAL
			//DISPLAY THESE RESULTS IN THE APPROPRIATE BOXES INSTEAD OF THE JOPTIONPANE BOX
			JOptionPane.showMessageDialog(null,"VIN [" + vinNumber + "] information has been updated!");
			}
	}//End of updateOrder class

	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	// Method to Import All Orders once the Application Form Loads 
	//-------------------------------------------------------------------------------------------------------------------------------------------------------
    public void importOrderAll() throws IOException{
    	String fileName = "C:/CarFax/CarFaxDB.txt";
		FileReader fr = null;
		BufferedReader br =  null;
		
		//Declare local variables
		String vinNumber = "";
		String carMake = "";
		String carModel = "";
		String carYear = "";
		
		//initialize the file reader
		fr = new FileReader(fileName);
		//initialize the buffered reader
		br = new BufferedReader(fr);
		
		String input = br.readLine();
		
		if(input != null){
				//Code block when there are no errors found
				try {
					//initialize the file reader
					fr = new FileReader(fileName);
					//initialize the buffered reader
					br = new BufferedReader(fr);
					
					//Read each text file line then store it in a variable called input
					//read from buffer to a line
					input = "";
		
					//Check if text file contains data
					while(input != null){
						
						input = br.readLine();
						//Take each line from text file then split it per line
						// then assign it to the Hash Map called lineHash
						String[] importHash = input.split(",");
		
						//Call the applicable key from lineHash with its associated value
						// then assign it to the applicable variable
						vinNumber = importHash[0];
						carMake = importHash[1];
						carModel = importHash[2];
						carYear = importHash[3];
		
						//Instantiate a new Customer object called customer
						Car car = new Car(vinNumber, carMake, carModel, carYear);
						Order order = new Order(vinNumber);
						order.setOrderCustomer(car);
						//Call and run the addOrder method from the JavaZon class with the order values
						jz.addOrder(order);
					}
				} catch (IOException ioEx) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, ioEx.getMessage());
				}finally{
					//Close any opened files
					try {
						br.close();
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//Show successful import message
					JOptionPane.showMessageDialog(null, "IMPORT COMPLETED!\nNew data has been Imported from\nthe CarFaxDB.txt database!\n\n"
														+ "Click the List button to confirm the list\nof Imported Car Records.\n\n"
														+ "Click the Find button to locate a\nspecific Imported Car Record.");
				}
		}else{
			JOptionPane.showMessageDialog(null,"No new car records to import!\nClick OK to add a new record.");
			br.close();
			fr.close();
		}
    }//End of importOrder method

	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	// Method to Import Orders using the Import button 
	//-------------------------------------------------------------------------------------------------------------------------------------------------------
	    public void importOrder(){
	    	String fileName = "C:/CarFax/CarFaxDB.txt";
			FileReader fr = null;
			BufferedReader br =  null;
			
			//Declare local variables
			String aVin = "";
			String aMake = "";
			String aModel = "";
			String aYear = "";
		    
			//Code block when there are no errors found
			try {
				//initialize the file reader
				fr = new FileReader(fileName);
				//initialize the buffered reader
				br = new BufferedReader(fr);
				
				//Read each text file line then store it in a variable called input
				//read from buffer to a line
				String input = "";

				//Check if text file contains data
				while(input != null){
					//Read each line of the text file then add values to the input variable
					input = br.readLine();
					//Take each line from text file then split it per line
					// then assign it to the Hash Map called lineHash
					String[] lineHash = input.split(",");
					
					//Call the applicable key from lineHash with its associated value
					// then assign it to the applicable variable
					aVin = lineHash[0];
					aMake = lineHash[1];
					aModel = lineHash[2];
					aYear = lineHash[3];

					//Set the stored variable value from lineHash to the applicable text fields
					txtVinNumber.setText(aVin);
					txtCarMake.setText(aMake);
					txtCarModel.setText(aModel);
					txtCarYear.setText(aYear);
					
					//Show successful import message
					JOptionPane.showMessageDialog(null, "A new car record has been Imported! "
														+ "\nView data then click OK to add and save the Imported Car Record.");

					//Call method to add the order
					this.addOrder();
					break;
				}

			} catch (IOException ioEx) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, ioEx.getMessage());
			}finally{
				//Close any opened files
				try {
					br.close();
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    }//End of importOrder method

		//-------------------------------------------------------------------------------------------------------------------------------------------------------
		// Call Method to Export Individual Orders 
		//-------------------------------------------------------------------------------------------------------------------------------------------------------
		private  void callOrder(){
			//TODO
			//Fill the screen with the order that was retrieved
			//All the fields should be blanked out and filled with the values from the new order
			String vinNumber = JOptionPane.showInputDialog("Enter VIN Number to Export a car record.");
			Order foundOrder = jz.findOrder(vinNumber);
			
			if (foundOrder != null){
				Car foundCustomer = foundOrder.getCustomer();
				
				this.txtVinNumber.setText(foundOrder.getOrderID());
				this.txtCarMake.setText(foundCustomer.getCarMake());
				this.txtCarModel.setText(foundCustomer.getCarModel());
				this.txtCarYear.setText(foundCustomer.getCarYear());
			} 
			else if(vinNumber == null){
				JOptionPane.showMessageDialog(null,"Export car record process was cancelled!");
			}
			else{
				JOptionPane.showMessageDialog(null, "No car record was exported!\nThe VIN Number is blank or "
													+ "VIN Number: [" + vinNumber + "] was not found!");
			}
		}//End of findOrder method

		//-------------------------------------------------------------------------------------------------------------------------------------------------------
		// Method to Export Individual Orders 
		//-------------------------------------------------------------------------------------------------------------------------------------------------------
	    public void exportOrder() throws IOException{
	    	String exportFile = "C:/out/CarFaxDB.txt";
			FileWriter fw = null;
			PrintWriter pw = null;
			BufferedWriter bw = null;
			
			callOrder();
			String vinNumber = this.txtVinNumber.getText();
			Order foundOrder = jz.findOrder(vinNumber);
			
			//display line write to file then set it to append data to file
			try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(exportFile,true), "utf-8"))){

				//Check if the order exists
				if (foundOrder != null){
					//Get the values then assign it
					String vin = this.txtVinNumber.getText();
					String make = this.txtCarMake.getText();
					String model = this.txtCarModel.getText();
					String year = this.txtCarYear.getText();
					
					//--------------------------------------------------------------------------------------------------------------------------------------------------
					// Export and append all of the order detail to a text file
					//--------------------------------------------------------------------------------------------------------------------------------------------------
					writer.append("\r\nVIN Number: " + vin + "\r\nCar Make: " + make 
								+ "\r\nCar Model: " + model + "\r\nCar Year: " + year + "\r\n");

					// Export completes then show a success message
					JOptionPane.showMessageDialog(null,"EXPORT COMPLETE! \nThe Car Record was added to a Text File Database."
														+ "\nVIN Number: [" + vin + "] has been exported to CarFaxDB.txt.");
					//--------------------------------------------------------------------------------------------------------------------------------------------------

					// Create ProcessBuilder
					ProcessBuilder p = new ProcessBuilder();
					//Create choice variable
					int aChoice;
					//Ask the user if they want to open the database file
					aChoice = JOptionPane.showConfirmDialog(null,"Open the CarFaxDB.txt database file?\nClick YES to open the file or "
								+ "click NO to return to the entry form.","Java DB CarFax | Open Database Option",JOptionPane.YES_NO_OPTION);
					if(aChoice == JOptionPane.YES_OPTION){
						// Use command "notepad.exe" and open the file.
						p.command("notepad.exe", "C:/out/CarFaxDB.txt");
						p.start();
				}
				else{
					//Return to the data entry form
					}
				}

			}catch(IOException ioEx){
				JOptionPane.showMessageDialog(null, ioEx);
			}
			finally{
				try{
					pw.close();
					bw.close();
					fw.close();
				}
				catch(Exception ex){
				}
			}
	    }//End of exportOrder method

		//-------------------------------------------------------------------------------------------------------------------------------------------------------
		// Method to Export All Orders when exiting the application 
		//-------------------------------------------------------------------------------------------------------------------------------------------------------
	    public void exApp() throws IOException{
	    	String exportFile = "C:/CarFax/CarFaxDB.txt";
			FileWriter fw = null;
			PrintWriter pw = null;
			BufferedWriter bw = null;

			String anID = null;
			Order foundOrder = jz.findOrder(anID);
			
			//display line write to file then set it to append data to file
			try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(exportFile,true), "utf-8"))){

				//Check if the order exists
				if (foundOrder == null){

					//Export and append all of the order detail to a text file
					writer.append(jz.allHashMap());

					// Create ProcessBuilder
					ProcessBuilder p = new ProcessBuilder();
					//Create choice variable
					int aChoice;
					//Ask the user if they want to open the database file
					aChoice = JOptionPane.showConfirmDialog(null,"All car records saved to the CarFaxDB.txt database file!\nView the text file now?\n"
																+ "Click YES to open the file or click NO to exit the application.",
																	"Java DB CarFax | Open Database Option",JOptionPane.YES_NO_OPTION);
					if(aChoice == JOptionPane.YES_OPTION){
						// Use command "notepad.exe" and open the file.
						p.command("notepad.exe", "C:/CarFax/CarFaxDB.txt");
						p.start();
				}
				else{
					//Return to the data entry form
					}
				}

			}catch(IOException ioEx){
				JOptionPane.showMessageDialog(null, ioEx);
			}
			finally{
				try{
					pw.close();
					bw.close();
					fw.close();
				}
				catch(Exception ex){
				}
			}
	    }//End exApp method

		//-------------------------------------------------------------------------------------------------------------------------------------------------------
		// Method to create CarFaxDB.txt on form load 
		//-------------------------------------------------------------------------------------------------------------------------------------------------------
	    public void txtCreate() throws IOException{
	    	String exportFile = "C:/CarFax/CarFaxDB.txt";
			FileWriter fw = null;
			PrintWriter pw = null;
			BufferedWriter bw = null;

			//display line write to file then set it to append data to file
			try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(exportFile,true), "utf-8"))){

					//Export and append all of the order detail to a text file
					writer.append(jz.allHashMap());

			}catch(IOException ioEx){
				JOptionPane.showMessageDialog(null, ioEx);
			}
			finally{
				try{
					pw.close();
					bw.close();
					fw.close();
				}
				catch(Exception ex){
				}
			}
	    }//End txtCreate method

	    //---------------------------------------------------------------------------------------------------------------------------------------------------------------
	    // Method to exit the application
	    //---------------------------------------------------------------------------------------------------------------------------------------------------------------
	    public void exitApp() throws IOException{
			exApp();

	    	JOptionPane.showMessageDialog(null, "Thank you for using the Java DB CarFax Application!");
	    	System.exit(0);
	    }//End of exitApp method

}//End of CarFaxFrame