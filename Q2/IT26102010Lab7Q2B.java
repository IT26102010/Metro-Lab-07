import java.util.Scanner ;
public class IT26102010Lab7Q2B {

	public static void main (String[] args) {
	
	// Loop through number 1 to 5
	for(int rowCount = 1; rowCount <= 5 ; rowCount++ ) {
	
		// Print the current number
		System.out.print(rowCount + " - ");
		
		//Loop to print stars for the current number
		for (int columnCount = 0; columnCount < rowCount; columnCount++) {
		
			System.out.print(" * ");
			}
			
			// Move to the next line after the printing stars
			System.out.println();
			}
		}
	}