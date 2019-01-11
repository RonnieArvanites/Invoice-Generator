import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * InutFileReader class
 * <p>Used to read data form an input file. In our case it is the data.txt file.</p>
 */
public class InputFileReader {	
	
	/**
	 * Reads lines in the txt file and converts it to a string array called filelines
	 * @param filename the file to read from
	 * @return fileLines the ArrayList containing all the produce in the file
	 * @throws IOException if file is not found
	 * @throws ClassNotFoundException if class if not found
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
    public ArrayList<Produce> readLines(String filename) throws IOException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        //Initializes objects used
    	FileReader fileReader = new FileReader(filename);//Creates an FileReader object
        BufferedReader bufferedReader = new BufferedReader(fileReader);//Creates a BufferReader object
        ArrayList<Produce> fileLines = new ArrayList<Produce>();//Creates an ArrayList called fileLines with Produce object
        
        //Initializes variables used
        String line = null;
        String[] tokens = null;
        Double quantity = null;
        
        //Loops while there are still lines in the input file
        while ((line = bufferedReader.readLine()) != null) {
        	//Checks to see if the line is empty
        	if (line.trim().length() > 0) {
        		tokens = line.split("\\s");//Spits the line into tokens based on spaces
        		//Checks to see if line only contains two items, which should be produce name and quantity
        		if (tokens.length == 2) {
        			//Checks to see if second item is a number, which this value should be the quantity
        			try {
        			quantity = Double.parseDouble(tokens[1]);//If tokens[1] is an integer, then set it to the variable quantity
        			} catch (NumberFormatException e) {
        				System.out.println(tokens[1] + " is suppose to be an number. The item has been skipped.");//Tells the user the error
        				continue;//If tokens[1] is not a integer then skip line
        			}
        			//Creates an Produce object based on tokens[0] and adds it to fileLines ArrayList
        			try {
        				Constructor c = Class.forName(tokens[0]).getConstructor(Double.TYPE);
        				fileLines.add((Produce) c.newInstance(quantity));
        			} catch (InstantiationException e) {
        				System.out.println("The item " + tokens[0] + " is not a valid item or not in the inventory list. The item has been skipped.");//Tells the user the error
        			} catch (IllegalAccessException e) {
        				System.out.println("The item " + tokens[0] + " is not a valid item or not in the inventory list. The item has been skipped.");//Tells the user the error
        			} catch (IllegalArgumentException e) {
        				System.out.println("The item " + tokens[0] + " is not a valid item or not in the inventory list. The item has been skipped.");//Tells the user the error
        			} catch (InvocationTargetException e) {
        				System.out.println("The item " + tokens[0] + " is not a valid item or not in the inventory list. The item has been skipped.");//Tells the user the error
        			} catch (ClassNotFoundException e) {
        				System.out.println("The item " + tokens[0] + " is not a valid item or not in the inventory list. The item has been skipped.");//Tells the user the error
        			}
        		}
        	}
        }
        
        //Closes bufferedReader
        bufferedReader.close();
        return fileLines; //Returns an ArrayList containing product objects from the data.txt file
    }
}