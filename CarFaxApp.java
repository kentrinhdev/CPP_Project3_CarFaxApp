package kvtproject3;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

/*///------------------------------------------------------------
 * Author: Khiem Ken Trinh
 * Professor: Dr. Hatim Mouissa
 * Class: CIS 304.04 Java II
 * Application Name: Java DB CarFax
 * Authored Date: 03/03/2016
 * Description: A program that keeps track of cars by
 * 	using their VIN numbers
 * Objective: Review JOptionPane, Loops, Arrays, Classes,
 * 	Try/Catch Validation, Static/Class Variables, and Inheritance
 *///------------------------------------------------------------

//This is the application class that starts up the application and
// this application class contains the MAIN METHOD
//Class that defines the CarFaxApp class
public class CarFaxApp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//Instantiate a new CarFaxFrame object called inst
		CarFaxFrame inst = new CarFaxFrame();
		inst.setLocationRelativeTo(null);
		inst.setVisible(true);
		
		//Instantiate a new JFrame object called winListener
		JFrame winListener = new JFrame("Window Listener");
		WindowListener listener = new WindowAdapter() {
		
		@Override
		public void windowClosing(WindowEvent w) {
		    System.exit(0);
		}
		  };
		  	winListener.addWindowListener(listener);
		  	winListener.setSize(100, 100);
		  	winListener.setVisible(false);

		inst.txtCreate();
		//Call the importOrderAll method from the CarFaxFrame class as soon as the form loads  
		inst.importOrderAll();

	}//End of Main method

}//End of CarFaxApp class