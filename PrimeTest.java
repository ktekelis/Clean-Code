import java.util.Scanner;
/**
 * This program tests whether an integer is a prime number.
 *
 * @author Konstantinos Tekelis
 * @version 2/23/15
 */
public class PrimeTest {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int num;
        String response;
        System.out.println("This program will test Whether a " +
           " positive integer is prime or not");
        do {
            System.out.print("Please enter a positive integer: ");
            num = Integer.parseInt(console.nextLine() );
            boolean number = true;
            for (int i = 2; i <= (int) Math.sqrt(num); i++ ) {
                 if (num % i == 0) number = false;
                     break;
                }
            }

            if (number)
               System.out.println(num + " is prime");
            else
               System.out.println(num + " is not prime");
               System.out.print("Do you want to try again? please " +  "enter Y for yes and N for no: ");
            response = console.nextLine();
        } while (response.charAt(0) == 'Y' || response.charAt(0) == 'y');
        System.out.println("Goodbye");
    }
}
