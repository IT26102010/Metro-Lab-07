import java.util.Scanner ;
public class IT26102010Lab7Q2C {

    public static void main(String[] args) {
	
        // Outer loop controls the rows, starting from 5 down to 1
        for (int i = 5; i >= 1; i--) {
		
            // Inner loop prints the current row number 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
				
            }
            // Move to the next line after finishing the row
            System.out.println();
        }
    }
}