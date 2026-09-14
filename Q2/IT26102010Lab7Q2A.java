import java.util.Scanner ;
public class IT26102010Lab7Q2A {

    public static void main(String[] args) {
	
        // Outer loop handles the 5 rows
        for (int i = 0; i < 5; i++) {
		
            // Inner loop handles the 5 dollar signs per row
            for (int j = 0; j < 5; j++)
			{
                System.out.print("$ ");
            }
            // Move to the next line after printing 5 dollar signs
            System.out.println();
        }
    }
}