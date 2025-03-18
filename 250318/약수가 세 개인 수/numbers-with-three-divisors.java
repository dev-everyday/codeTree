import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int count_common(int num){
        int cnt =0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a, b;   
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for(int i=a;i<=b;i++){
            if(count_common(i)==3){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}