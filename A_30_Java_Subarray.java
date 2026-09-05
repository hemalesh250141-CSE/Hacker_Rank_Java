import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        int count = 0;

        // Iterate through all possible starting indices of subarrays
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            // Iterate through all ending indices starting from i
            for (int j = i; j < n; j++) {
                currentSum += a[j];
                if (currentSum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
