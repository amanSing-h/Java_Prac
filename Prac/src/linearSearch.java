import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {3,3,1,2,3};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        for (int i = 0;  i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("Index: "+ i);
                break;
            }else{
                System.out.println("Not present");
                break;
            }
        }
    }
}
