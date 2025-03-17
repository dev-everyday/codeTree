import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");
        int numbers[] = new int[input.length];
        for(int i=0;i<n;i++){
            numbers[i]=Integer.parseInt(input[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]*numbers[i]+" ");
        }
    }
}