import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.readLine(); 

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(
                (arr1[i][0] * arr2[i][0]) + " " +
                (arr1[i][1] * arr2[i][1]) + " " +
                (arr1[i][2] * arr2[i][2])
            );
        }
    }
}
