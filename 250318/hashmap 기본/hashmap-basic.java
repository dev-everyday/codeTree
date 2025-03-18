import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<n;i++){
            String word = sc.nextLine();
            String[] parts = word.split(" ");
            int key = Integer.parseInt(parts[1]);
            if(parts[0].equals("add")){
                int value = Integer.parseInt(parts[2]);
                hm.put(key, value);
            } else if (parts[0].equals("find")){
                if(hm.containsKey(key)){
                    System.out.println(hm.get(key));
                } else{
                    System.out.println("None");
                }
            } else {
                hm.remove(key);
            }
        }
    }
}