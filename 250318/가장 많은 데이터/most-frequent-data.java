import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> hm = new HashMap<>();
        String[] arr = new String[n];
        int maxCnt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
            maxCnt = Math.max(maxCnt, hm.get(arr[i]));
        }
        System.out.print(maxCnt);
    }
}