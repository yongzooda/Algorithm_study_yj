import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final int LIMIT = 91;
    public static long [] d = new long [LIMIT + 1];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        d[1] =1;
        d[2] =1;
        d[3] =2;

        for (int i = 4; i <= n; i++) {
            d[i] = 2* d[i-2] + d[i-3];
        }

        System.out.println(d[n]);

    }
}
