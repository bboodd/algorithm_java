import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //시험 점수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = 0;

        for (int i = 0; i < 4; i++) {
            s += Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int t = 0;

        for(int i=0; i < 4; i++) {
            t += Integer.parseInt(st.nextToken());
        }

        if(s == t){
            System.out.println(s);
        } else{
            System.out.println(Math.max(s,t));
        }


    }
}