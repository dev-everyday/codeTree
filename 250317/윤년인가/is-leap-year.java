import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%100==0&&n%400!=0){
            System.out.print("false");
        } else if(n%4==0){
            System.out.print("true");
        } else{
            System.out.print("false");
        }
    }
}