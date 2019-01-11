import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * 
 * @author Ron Arvanites
 * <h1>Invoice Generator</h1>
 * <p>This program allows users to input a text file with produce name and quantity each on a separate line. 
 * First, the program reads the text file and then converts the produce to objects with the correct class name.
 * Then, the program exports the objects, each on a separate linem to a text file called invoice.txt. Each 
 * produce is listed with its item classification, price type, price, quantity, and extended price.
 * Next, the program calculates the total price of the produce and exports that to the bottom of the file.
 * Finally, the program prints out want was exported to the invoice.txt file in the console.</p>
 *
 */

/**
 * InvoiceGenerator class
 * <p>Used to generate an invoice with produce listed in the file data.txt.</p>
 */
public class InvoiceGenerator {
	/**
	 * Generates the invoice.txt file with produce from data.txt file
	 * @param args
	 * @throws NoSuchMethodException if method does not exist
	 * @throws SecurityException if security is violated
	 * @throws ClassNotFoundException if class if not found for produce
	 * @throws FileNotFoundException if file is not found
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, FileNotFoundException  {
		ArrayList<Produce> produceList = new ArrayList<Produce>();//Creates a new ArrayList called produceList which contains Produce objects
		InputFileReader rf = new InputFileReader();//Creates an InputFileReader object called rf
		String filename = "data.txt";//Sets the name of the file that is going to be imported
		System.out.println("Welcome to the Invoice Generator");//Tells the user the program title
		
		try {
			  
        	//Converts contents of file to produce ArrayList
            produceList = rf.readLines(filename);
            
        }
        catch(IOException e) {
            //Prints out error is filename does not exist
            System.out.println("Unable to create "+filename+": "+e.getMessage());              
        }
		
		//Tells the user the produce invoice
		System.out.println("");//Prints extra line for formatting
		System.out.println("Produce Purchase Invoice");
		System.out.println("Item ItemClassification PriceType Price Quantity ExtPrice");
	
		//Combines duplicate items
        ArrayList<Produce> newItemList = new ArrayList<Produce>();
        newItemList = combineDuplicateItems(produceList);
        
		//Saves File in text file called invoice.txt
		PrintStream console = System.out;//Saves current output which is the console
        PrintStream o = new PrintStream(new File("invoice.txt"));//Sets the output file to invoice.txt
        
        //Prints invoice to file called invoice.txt
        System.setOut(o);// Assign o to output stream
        printInvoice(newItemList);//Prints produce purchased
        System.setOut(console);//Sets output back to console
        
        //Prints invoice in console
        printInvoice(newItemList); 
        
        //Tells the user the invoice has be saved in a file called invoice.txt
        System.out.println("Your invoice has been saved in a file called invoice.txt.");
        
	}
	
	/**
	 * Prints produce with its item classification, price type, price, quantity, and extended price. Also prints total price
	 * @param items the ArrayList of items to print out
	 */
	public static void printInvoice(ArrayList<Produce> items) {
		//invoice total
		double total = 0;
		DecimalFormat priceFormat = new DecimalFormat("0.00");//Formats the output to include 2 decimal places
		
		//Loops through all produce in items
		for (Produce item:items){
			//Calculates the extended price for each item
			double extPrice = item.price() * item.qty;
			
			//Calculates the total price of the invoice
			total = total + extPrice;
			
			//Prints out the item, item classification, price type, price, quantity, and extended price.
			System.out.println(item.produceType() + " " + item.produceClassification() + " " + item.priceType() + " $" + priceFormat.format(item.price()) + " " + (int)item.qty + " $" + priceFormat.format(extPrice));    
		}
		//Prints out the total price for the invoice
		System.out.println("Total: $" + priceFormat.format(total));
	}
	
	/**
	 * Combines the duplicate items in the items ArrayList
	 * @param items the ArrayList of items to remove duplicates
	 * @return filteredItems the items ArrayList with duplicate items combined
	 */
	public static ArrayList<Produce> combineDuplicateItems(ArrayList<Produce> items) {
		ArrayList<Produce> filteredItems = new ArrayList<Produce>();//Creates a new ArrayList called filteredItems that contains the same elements in the items ArrayList without duplicates
		filteredItems.addAll(items);//Adds all items form items ArrayList to filteredItems ArrayList
		
		int numOfItemsRemoved = 0;//keeps track of items removed in filteredItems ArrayList
		//Checks for duplicate items and combines them
		for (int i = 0; i < items.size(); i ++) {
			for (int j = i + 1; j < items.size(); j ++) {
				//If a duplicate is found
				if(items.get(i).produceType().equals(items.get(j).produceType()) == true) {
					double duplicateItemQty = items.get(j).getQty();//Store duplicate item quantity
					double oldItemQty = items.get(i).getQty();//Store the first version of the duplicate item quantity
					
					//Updates qty of the first duplicate item version in filteredItems
					filteredItems.get(i).setQty(duplicateItemQty + oldItemQty);
					
					//Remove the second duplicate item version in filteredItems
					filteredItems.remove(j - numOfItemsRemoved);
					numOfItemsRemoved++;//Increments item removed counter
				}
			}
		}
		
		//Returns new ArrayList with combined duplicates
		return filteredItems;
		
	}
}
