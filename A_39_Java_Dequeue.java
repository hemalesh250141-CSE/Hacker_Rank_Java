import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            
            // Add element to deque and set
            deque.add(num);
            set.add(num);
            
            // Once we reach window size m
            if (deque.size() == m) {
                // Track maximum unique count seen so far
                if (set.size() > maxUnique) {
                    maxUnique = set.size();
                }
                
                // If we hit the maximum possible unique count, we can stop early
                if (maxUnique == m) {
                    break;
                }
                
                // Slide window: remove the oldest element from the front
                int removed = deque.removeFirst();
                // Remove from set only if it's no longer present in the current deque
                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }
        }
        
        System.out.println(maxUnique);
    }
}
