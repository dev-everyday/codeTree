import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        char answer = 'F';
        if(A>=90){
            answer = 'A';
        } else if(A>=80){
            answer = 'B';
        } else if(A>=70){
            answer = 'C';
        } else if(A>=60){
            answer = 'D';
        }
        System.out.print(answer);
    }
}