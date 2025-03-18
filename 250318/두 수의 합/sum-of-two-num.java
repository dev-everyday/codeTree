import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            hs.add(arr[i]);
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(hs.contains(k-arr[i])){
                cnt++;
            }
        }
        System.out.print(cnt/2);
    }
}