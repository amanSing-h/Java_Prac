import java.util.Scanner;
public class sumOfNaturalNumbers {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the value of n from the user
            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();

            // Calculate the sum of the first n natural numbers
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            // Display the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

            // Close the scanner
            scanner.close();
        }


}
