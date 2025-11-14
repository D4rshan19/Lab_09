import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Randomizer and declaring int array values
        Random rand = new Random();
        int [] dataPoints = new int [100];
        int sum = 0;
        int average = 0;

        //Declaring scanner and variables for part 2
        Scanner scan = new Scanner(System.in);
        int counter = 0;


        //Making the array
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }
        //Displaying array values
        System.out.println("Array: ");
        for (int x : dataPoints) {
            System.out.print(x + " | ");

        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
            average = sum/100;
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
            //Printing out specific results from the array
            System.out.println("\nThe sum of all the elements is " + sum);
            System.out.println("The average of all the elements is " + average);
            System.out.println("The minimum of all the elements is " + min);
            System.out.println("The maximum of all the elements is " + max);

            //Asking user for input
        int userInput = InputHelper.getRangedInt(scan, "Enter a value between 1 - 100" ,1, 100);

        //Making for loop to count user input within array
        for ( int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                counter++;
            }
        }
        System.out.println("You entered " + userInput + " and it was displayed " + counter + " times throughout the array");
    }
}





