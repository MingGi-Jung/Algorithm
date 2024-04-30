import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     while(true){
         StringTokenizer st = new StringTokenizer(br.readLine());
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         int c = Integer.parseInt(st.nextToken());
         int d = Integer.parseInt(st.nextToken());
         if(a==0&&b==0&&c==0&&d==0)break;
         System.out.println(Math.abs(b-c)+" "+Math.abs(a-d));
     }
    }
}

