package controller;

//	   Imports
import model.Pizza;
import javax.swing.JOptionPane;

public class IfController
{
//	   Data Members

//	   Constructors 
	/**
	 * (Used to build the instance of the IfController)
	 */
	public IfController()
	{
		
	}

//	   Methods
	/**
	 * (Where the program calls the methods to run the program)
	 */
	public void start()
	{
		loopy();
		askUser();
	}
	
	/**
	 * Define, test, and update
	 */
	private void loopy()
	{
		//  DEFINE the variable
		boolean isDone = false; //change to true
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
		
		// Starting Position; Min/Max; Increment
		for (int pizzaLoop = 0; pizzaLoop >= 3 ; pizzaLoop++)
		{
			askUser();
			JOptionPane.showMessageDialog(null, "Pizzas Created: " + pizzaLoop);
		}
	}
	
	private void askUser()
	{
		Pizza userPizza = new Pizza();
		
		String pizzaSize = JOptionPane.showInputDialog(null, "What is the size of your pizza in inches?");
		while (!validDouble(pizzaSize))
		{
			pizzaSize = JOptionPane.showInputDialog(null, "Huh??");
		}
		userPizza.setPizzaSize(Double.parseDouble(pizzaSize));
		JOptionPane.showMessageDialog(null, "Your pizza is " + pizzaSize + " inches.");
		
		String hasCheese = JOptionPane.showInputDialog(null, "Does your pizza have cheese?");
		userPizza.setHasCheese(Boolean.parseBoolean(hasCheese));
		if (userPizza.getCheese())
		{
			JOptionPane.showMessageDialog(null, "Your pizza does have cheese.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Your pizza does not have cheese.");
		}
		
		String pepperoniCount = JOptionPane.showInputDialog(null, "How many slices of pepperoni does your pizza have?");
		while(!validInt(pepperoniCount))
		{
			pepperoniCount = JOptionPane.showInputDialog(null, "What??");
		}
		userPizza.setPepperoniCount(Integer.parseInt(pepperoniCount));
		JOptionPane.showMessageDialog(null, "Your pizza has " + pepperoniCount + " slices of pepperoni.");
		
		String hasStuffedCrust = JOptionPane.showInputDialog(null, "Does your pizza have stuffed crust?");
		userPizza.setHasStuffedCrust(Boolean.parseBoolean(hasStuffedCrust));
		if (userPizza.getStuffedCrust())
		{
			JOptionPane.showMessageDialog(null, "Your pizza does have stuffed crust");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Your pizza does not have stuffed crust");
		}
		
		JOptionPane.showMessageDialog(null, userPizza);
	}
	
	
	public boolean validInt(String maybeInt) 
	{
		boolean validInt = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			validInt = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type an integer value.");
		}
		
		return validInt;
	}
	
	public boolean validDouble(String maybeDouble) 	
	{
		boolean validDouble = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			validDouble = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Huh? Be more specific");
		}
		
		return validDouble;
	}
}