import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int countPairsWithDuplicates(int[] arr, int K) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = K - num; 
            
            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }

            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt(); 
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countPairsWithDuplicates(arr, K));
        sc.close();
    }
}
