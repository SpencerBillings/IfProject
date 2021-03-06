package controller;

//	   Imports
import model.Pizza;
import javax.swing.JOptionPane;
import java.util.ArrayList;

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
		listedPizza();
		loopy();
		morePizza();
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
		
		System.out.println("Commencing pizzLoop.");
		// Starting Position; Min/Max; Increment
		for (int pizzaLoop = 1; pizzaLoop <= 3; pizzaLoop++)
		{
			askUser();
			JOptionPane.showMessageDialog(null, "Pizzas Created: " + pizzaLoop);
		}
	}
	
	private void morePizza()
	{
		
		ArrayList<Pizza> myPizzas = new ArrayList<Pizza>();
		
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		//Have to use a wrapper class to hold a primitive in a list (Capital letter spelling)
		
		Pizza samplePizza = new Pizza();
		Pizza otherPizza = new Pizza();
		
		myPizzas.add(samplePizza);
		myPizzas.add(samplePizza);
		myPizzas.add(otherPizza);
	
		//Standard forward loop
		//if used to remove you have too change index
		for (int index= 0; index < myPizzas.size(); index += 1)
		{
			//Good for display or minor changes
			JOptionPane.showMessageDialog(null, myPizzas.get(index).getPizzaSize());
			
			//Good for remove, replace, change multiple values
			Pizza currentPizza = myPizzas.get(index);
			currentPizza.setPizzaSize(index * (int) (Math.random() * 10));
			currentPizza.setHasCheese(false);
		}
		
		//Standard backward loop
		//great for removing
		for (int index = myPizzas.size() - 1; index >= 0; index -= 1)
		{
			
		}
	
		for (Pizza current : myPizzas)
		{
			
		}
	}
	
	private void listedPizza()
	{
		ArrayList<String> pizzaList = new ArrayList<String>();
		
		System.out.println("Commencing listedPizza.");
		/**
		 * .add(0, "Cheese Pizza") inserts the string "Cheese Pizza" at the very beginning of the ArrayList named pizzaList.
		 */
		pizzaList.add(0, "Cheese Pizza");
		
		for (int index = 0; index < pizzaList.size(); index += 1)
		{
			if(pizzaList.size() >= 3)
			{
				pizzaList.set(0, "Hawaiian Pizza");
				/**
				 * .remove(3) will remove whatever item is in the *fourth* position, no matter what that item is.
				 */
				pizzaList.remove(3);
				JOptionPane.showMessageDialog(null, pizzaList.size() + " " + pizzaList);
			}
			else
			{
				/**
				 * .add("Pepperoni Pizza") will append the string "Pepperoni Pizza" to the end of the ArrayList named pizzaList
				 */
				pizzaList.add("Pepperoni Pizza");
				JOptionPane.showMessageDialog(null, pizzaList.size() + " " + pizzaList);
			}
		}
	}
	
	private void askUser()
	{
		Pizza userPizza = new Pizza();
		
		String pizzaSize = JOptionPane.showInputDialog(null, "What is the size of your pizza in inches?");
		while (pizzaSize == null || !validDouble(pizzaSize))
		{
			pizzaSize = JOptionPane.showInputDialog(null, "Type a double.");
		}
		userPizza.setPizzaSize(Double.parseDouble(pizzaSize));
		JOptionPane.showMessageDialog(null, "Your pizza is " + pizzaSize + " inches.");
		
		String hasCheese = JOptionPane.showInputDialog(null, "Does your pizza have cheese? (True/False)");
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
		while(pepperoniCount == null || !validInt(pepperoniCount))
		{
			pepperoniCount = JOptionPane.showInputDialog(null, "Type an integer.");
		}
		userPizza.setPepperoniCount(Integer.parseInt(pepperoniCount));
		JOptionPane.showMessageDialog(null, "Your pizza has " + pepperoniCount + " slices of pepperoni.");
		
		String hasStuffedCrust = JOptionPane.showInputDialog(null, "Does your pizza have stuffed crust? (True/False)");
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
			JOptionPane.showMessageDialog(null, "Type an integer data type.");
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
			JOptionPane.showMessageDialog(null, "Type a double data type.");
		}
		
		return validDouble;
	}

}