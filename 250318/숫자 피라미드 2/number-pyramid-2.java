import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
}