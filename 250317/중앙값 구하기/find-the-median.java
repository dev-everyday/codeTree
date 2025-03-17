import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int median;
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            median = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            median = b;
        } else {
            median = c;
        }
        System.out.println(median);
    }
}