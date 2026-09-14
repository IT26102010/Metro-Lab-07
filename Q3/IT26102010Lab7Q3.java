import java.util.Scanner;

public class IT26102010Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Loop to process 5 customers
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            
            // Input total bill amount
            System.out.print("Enter total bill amount: ");
            double totalBill = scanner.nextDouble();
            
            // Input mode of payment
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);
            
            // Convert to uppercase to handle both cases ('C'/'c' and 'O'/'o')
            paymentMode = Character.toUpperCase(paymentMode);
            
            // Validate payment mode and calculate final amounts
            if (paymentMode == 'C') {
                double discount = totalBill * 0.05; // 5% discount
                double amountToPay = totalBill - discount;
                
                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
                
            } else if (paymentMode == 'O') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + totalBill);
                
            } else {
                // Error message for invalid payment 
                System.out.println("Payment Mode is Not Valid");
            }
            
            System.out.println(); // Prints a blank line between customers
        }
       
    }
}