import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};    //sorted array
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int low = 0, high = arr.length - 1, mid;
        boolean found = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                System.out.printf("index: " + mid);
                found = true;
                break;
            }
            else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }
}