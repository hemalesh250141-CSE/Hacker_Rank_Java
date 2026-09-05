import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        List<List<Integer>> lines = new ArrayList<>();
        
        // Read input lines into a 2D ArrayList structure
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(scan.nextInt());
            }
            lines.add(line);
        }
        
        int q = scan.nextInt();
        // Process queries
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            // Convert 1-based index (x, y) to 0-based index (x - 1, y - 1)
            int rowIndex = x - 1;
            int colIndex = y - 1;
            
            if (rowIndex >= 0 && rowIndex < lines.size() && colIndex >= 0 && colIndex < lines.get(rowIndex).size()) {
                System.out.println(lines.get(rowIndex).get(colIndex));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        scan.close();
    }
