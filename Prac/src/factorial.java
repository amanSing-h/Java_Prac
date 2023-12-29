import java.util.Scanner;
public class factorial {
    public int fact(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * fact(n - 1);
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            factorial f = new factorial();
            int n,i,fact=1;
            System.out.print("Enter any number: ");
            n = sc.nextInt();
            System.out.println("Factorial of number is: " + f.fact(5));
        }

}
