import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class baek2869_timeover{
    public static void main(String[] args) throws IOException{
        // Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int V = sc.nextInt();
        // int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int cnt = 0;

        do{
            if((V-(A-B)) > A){
                V = V-(A-B);
                cnt++;
            }else{
                V = 0;
                cnt++;
            }
        }while(V>A);
        System.out.println(cnt+1);
    }
}