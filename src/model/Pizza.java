package model;

public class Pizza
{
//	   Data Members
	private double pizzaSize;
	private boolean hasCheese;
	private int pepperoniCount;
	private int greenPepperCount;
	private boolean hasStuffedCrust;

	/**
	 * Default constructor for post customization
	 * (Don't know the information)
	 * Init data members with 'bad' values to be changed
	 */
	public Pizza()
	{
		this.pizzaSize = -99;
		this.hasCheese = false;
		this.pepperoniCount = -99;
		this.hasStuffedCrust = false;
	}
	
	/**
	 * Default constructor for current customization
	 * (Do know the information)
	 * @param pizzaSize The size of the pizza
	 */
	public Pizza(double pizzaSize)
	{
		this.pizzaSize = pizzaSize;
	}
	
//	Setters
	public void setPizzaSize(double size)
	{
		this.pizzaSize = size;
	}
	
	public void setHasCheese(boolean cheese)
	{
		this.hasCheese = cheese;
	}
	
	public void setPepperoniCount(int pepperoni)
	{
		this.pepperoniCount = pepperoni;
	}
	
	public void setHasStuffedCrust(boolean stuffedCrust)
	{
		this.hasStuffedCrust = stuffedCrust;
	}
	
//	Getters
	public double getPizzaSize()
	{
		return pizzaSize;
	}
	
	public boolean getCheese()
	{
		return hasCheese;
	}
	
	public int getPepperoni()
	{
		return pepperoniCount;
	}
	
	public boolean getStuffedCrust()
	{
		return hasStuffedCrust;
	}
	
	public void updateToppings(int pepperoni, int greenPeppers)
	{
		
	}
}