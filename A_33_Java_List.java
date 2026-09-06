import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read initial list size
        int n = scan.nextInt();
        List<Integer> list = new LinkedList<>();
        
        // Populate the list
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        
        // Read number of queries
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            String query = scan.next();
            if (query.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else if (query.equals("Delete")) {
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        
        // Print the final space-separated list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i == list.size() - 1 ? "" : " "));
        }
        
        scan.close();
    }
}
