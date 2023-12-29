import java.util.Scanner;
public class TailRecursion {
    public static void displayData(int n) {
        if (n < 0) {
                return;
            }
            System.out.print(n + " ");
            displayData(n - 1);
    }
        public static void main(String[] args) {

            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number: ");
            n = sc.nextInt();
            displayData(n);

        }

}
/*
function fact(cn, pm):
if currentNumber is less or eqal to 0 then
return pm
else
return fact (cn -1, cn*pm) // tail recursion
end
end
 */
