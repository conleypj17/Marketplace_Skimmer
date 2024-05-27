import java.util.Scanner;	//importing Scanner

public class Item<T>
{
	private T item;	//item
	private String name;	//holds item name
	private double sellingPrice;	//holds item selling price
	private double originalPrice;	//holds item original price
	private double distance;	//holds distance to said item
	
	public static Scanner keyboard = new Scanner(System.in);	//creating global Scanner object
	
	public Item(String name, double sellingPrice, double originalPrice, double distance)
	{
		setName(name);
		setSellingPrice(sellingPrice);
		setOriginalPrice(originalPrice);
		setDistance(distance);
	}	//end Item constructor
	
	public Item(String name)
	{
		setName(name);
		keyboard.nextLine();
		System.out.println("What was the selling price of the item?");
	}	//end item constructor
	
	public void setName(String name)
	{
		
	}	//end setName method
	
	public void setSellingPrice(double sellingPrice)
	{
		
	}	//end setSellingPrice method
	
	public void setOriginalPrice(double originalPrice)
	{
		
	}	//end setOriginalPrice method
	
	public void setDistance(double distance)
	{
		
	}	//end setDistance method
	
	public String getName()
	{
		return name;
	}	//end getName method
	
	public double getSellingPrice()
	{
		return sellingPrice;
	}	//end getSellingPrice method
	
	public double getOriginalPrice()
	{
		return originalPrice;
	}	//end getOriginalPrice method
	
	public double getDistance()
	{
		return distance;
	}	//end getDistance method
	
	public String toString()
	{
		return "\nName: " + name + "\nSelling Price: " + sellingPrice + "\nOriginal Price: " + originalPrice + "\nDistance: " + distance;
	}	//end toString method
}
