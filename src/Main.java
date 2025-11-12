import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Randomizer and declaring int array values
        Random rand = new Random();
        int [] dataPoints = new int [100];

        //Declaring scanner and variables for part 2
        Scanner scan = new Scanner(System.in);


        //Making the array
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }
        //Displaying array values
        System.out.println("Array: ");
        for (int x : dataPoints) {
            System.out.print(x + " | ");
        }
    }
}





