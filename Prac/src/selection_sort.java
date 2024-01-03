public class selection_sort {
    public static void main(String[] args) {
        int []arr = {4,5,2,3,1};
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            int min = arr[i], idx = 0;
            for (int j = i; j < len; j++) {
               if (min > arr[j]) {
                    flag = true;
                    min = arr[j];
                    idx = j;
                }
            }
            if (flag) {
                int tmp = arr[i];
                arr[i] = min;
                arr[idx] = tmp;
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.printf(arr[i]+",");
        }
    }
}