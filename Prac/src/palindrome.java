import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num;
        int revrsedNum = 0;

        while (temp != 0){
            int remainder = temp %10;
            revrsedNum = revrsedNum *10 + remainder;
            temp /=10;
        }
        if (num == revrsedNum){
            System.out.println(num+ " is palindrome");
        } else {
            System.out.println(num+ " is not palidrome");
        }
    }
}
