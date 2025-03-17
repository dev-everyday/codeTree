import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"apple", "banana", "grape", "blueberry", "orange"};
        char a = sc.next().charAt(0);
        int cnt = 0;
        for(String s:str){
            if(s.charAt(2)==a||s.charAt(3)==a){
                System.out.println(s);
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}