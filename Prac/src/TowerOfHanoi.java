import javax.crypto.spec.PSource;

public class TowerOfHanoi {
    /*
    Only one disk can be moved among the towers at any given time.
    Only the "top" disk can be removed.
    No large disk can sit over a small disk.
     */
    static void getTOH(int n, char source, char helper, char destination){
        if (n==0){
            return;
        }
        if (n==1){
            System.out.println("Move disk "+n + " from rod "+ source+" to rod "+ destination);
        }
        else {
            getTOH(n-1, source,destination,helper);
            System.out.println("Move disk "+n+" from rod "+ source+" to rod "+destination);
            getTOH(n-1, helper,source,destination);
        }
    }
    public static void main(String[] args) {
        int n=5;
        getTOH(n, 'S','H','D');
    }
}
