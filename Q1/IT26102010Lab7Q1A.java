import java.util.Scanner;

public class IT26102010Lab7Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
		//Variables must be declared with a date type before use
        int mark1, mark2, mark3, mark4;
        String grade;

        //Added missing double quotes around the taxt strings
        System.out.println("Enter mark for four subjects:");

        System.out.print("Enter Subject Mark 1: ");
        mark1 = input.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        mark2 = input.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        mark3 = input.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        mark4 = input.nextInt();

       
        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
		
		//Added quotes around string values and fixed the "else if" syntax

        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average <= 74) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println();
        System.out.println("Average is: " + average);
        System.out.println("Overall Grade is: " + grade);

    }
}