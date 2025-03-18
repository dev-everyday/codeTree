import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<Integer, String> hm2 = new HashMap<>();
        String[] words = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            words[i] = sc.next();
            hm.put(words[i], i);
            hm2.put(i, words[i]);
        }
        for(int i=1;i<=m;i++){
            String c = sc.next();
            if(Character.isDigit(c.charAt(0))){
                System.out.println(hm2.get(Integer.parseInt(c)));
            } else{
                System.out.println(hm.get(c));
            }
        }
    }
}