import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, N;
        A = sc.nextInt();
        N = sc.nextInt();
        for(int i=0;i<N;i++){
            A+=N;
            System.out.println(A);
        }
    }
}