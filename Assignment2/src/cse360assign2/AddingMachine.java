package cse360assign2;
/**
 * 
 * @author Amroger Singh
 * Changes made to all methods as desired in assignment requirements
 *
 */
public class AddingMachine {
	/**
	 * Private variables
	 */
	private int total;
	private String machineString = "0 ";
	/**
	 * Initializes total to zero
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity}
	}
	/**
	 * getTotal returns total value
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * Takes a parameter called value which in return is added to total
	 * machineString is modified to record this change
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		machineString = "+ " + Integer.toString(total) + " ";
	}
	/**
	 * Takes a paramter called value which in return is subtracted from total
	 * machineString is modified to record this change
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		machineString = "- " + Integer.toString(total) + " ";
	}
	/**
	 * toString which will display all changes made to total
	 */
	public String toString () {
		
		return machineString;
	}
	
	public void clear() {
		
	}
}
