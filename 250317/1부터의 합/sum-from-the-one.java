import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int i = 1;
        int sum =1;
        while(sum<N){
            i++;
            sum+=i;
        }
        System.out.println(i);
    }
}