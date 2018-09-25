package controller;

//	   Imports
import model.Pizza;
import javax.swing.JOptionPane;

public class IfController
{
//	   Data Members
	private Pizza myPizza;

//	   Constructors 
	/**
	 * (Used to build the instance of the IfController)
	 */
	public IfController()
	{
		myPizza = new Pizza();
	}

//	   Methods
	/**
	 * (Where the program calls the methods to run the program)
	 */
	public void start()
	{
		loopy();
	}
	
	/**
	 * Define, test, and update
	 */
	private void loopy()
	{
		//  DEFINE the variable
		boolean isDone = true;
		int count = 0;
		
		while (isDone) // TEST the variable
		{
			JOptionPane.showMessageDialog(null, "Retry?");
			// Eventually change the loop variable
			count++;
			if (count >= 5) // OBOE: Off By One Error
			{
				JOptionPane.showMessageDialog(null, "Could not reconnect.");
				isDone = false; // UPDATE the variable
			}
		}
	}
	
	
}