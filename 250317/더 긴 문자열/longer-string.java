import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        a=sc.next();
        b=sc.next();
        if(a.length()>b.length()){
            System.out.print(a+" "+a.length());
        } else if(a.length()<b.length()){
            System.out.print(b +" "+b.length());
        } else{
            System.out.print("same");
        }
    }
}