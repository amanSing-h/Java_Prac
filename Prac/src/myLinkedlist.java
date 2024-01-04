import java.util.LinkedList;

public class myLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<String>();
        li.add("Java");
        li.add("php");
        li.add("mysql");
        /*
        need to count the letter
        after this
        java -> 4
        then java -> avaj
         */
        for(int i = 0; i < li.size(); i++){
        System.out.println(li.get(i));}

        int sum = 0;
        for (int i = 0; i < li.size(); i++){
            String  temp = li.get(i);
            sum += temp.length();
        }
        System.out.println(sum);

        String ss = li.get(0);
        System.out.println(ss.length());


    }
}
