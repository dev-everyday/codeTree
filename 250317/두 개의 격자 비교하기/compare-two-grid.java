import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N, M;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int arr[][]=new int[N][M];
        int brr[][]=new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                brr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(arr[i][j]==brr[i][j]){
                    System.out.print("0 ");
                } else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}