import java.util.Scanner;	//importing Scanner
import java.io.File;	//importing File
import java.io.FileNotFoundException;
import java.io.PrintWriter;	//importing PrintWriter


public class RunnerClass
{
	public static Scanner keyboard = new Scanner(System.in);	//creating global Scanner object
	
	public static void main(String[] args)
	{
		System.out.println("Hello user.");	//introduction
		try
		{
			int option = displayMenu();	//displaying the Menu to user
			switch (option)
			{	//start of switch statements
			case 1:
				signIn();	//user can sign in
				break;
			case 2:	
				enterPurchase();	//user can enter purchase
				break;
			case 3:
				enterSale();	//user can enter a sale
				break;
			case 4:
				facebookMarketplace();	//connect to facebook marketplace
				break;
			case 5:
				eBay();	//connect to ebay
				break;
			}	//end switch statements
			
		}	//end try block
		catch (Exception ex)
		{
			System.out.println("Error, something went wrong: " + ex.getMessage());
		}	//end catch block
	}	//end main method
	
	public static void signIn()
	{
		System.out.println("Testing gitHUb");	
	}	//end signIn method
	
	public static void enterPurchase() throws FileNotFoundException
	{
		Scanner sc = new Scanner("purchases.txt");	//creating Scanner for writing into file/retrieving info
		System.out.println("What item did you purchase?");
		String item_name = keyboard.nextLine();
		Item item = new Item(item_name);
		PrintWriter writer = new PrintWriter("purchases.txt");
		writer.println(item_name);
		
	}	//end enterPurchase method
	
	public static void enterSale() throws FileNotFoundException
	{
		Scanner sc = new Scanner("sales.txt");
		System.out.println("What item did you sell?");
		String item_name = keyboard.nextLine();
		Item item = new Item(item_name);
		PrintWriter writer = new PrintWriter("sales.txt");
		writer.println(item_name + " " + item.getSellingPrice());
		
	}	//end enterSale method
	
	public static void facebookMarketplace()
	{
		
	}	//end facebookMarketplace method
	
	public static void eBay()
	{
		
	}	//end eBay method
	
	public static int displayMenu()
	{
		System.out.println("Please select an option: ");
		System.out.println("\t1.) Choose a user to sign in");
		System.out.println("\t2.) Enter a purchase");
		System.out.println("\t3.) Enter a sale");
		System.out.println("\t4.) Connect to Facebook Marketplace");
		System.out.println("\t5.) Connect to eBay");
		System.out.println("\t6.) Exit Program");
		
		int choice = keyboard.nextInt();
		if (choice < 1 || choice > 6)
		{
			throw new IllegalArgumentException("Invalid Choice");
		}
		else if (choice == 6)
		{
			System.out.println("Exiting Program.");
			System.exit(0);	//will end the program
		}
		else
		{
			return choice;	//returning choice if it is 1-5
		}
		
		return 0;	//should never get here
	}	//end displayMenu method
}	//end RunnerClass
