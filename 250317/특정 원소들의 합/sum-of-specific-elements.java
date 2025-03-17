import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        for(int i=0;i<4;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<4;j++){
                int n = Integer.parseInt(st.nextToken());
                if(i>=j){
                    sum+=n;
                }
            }
        }
        System.out.print(sum);
    }
}