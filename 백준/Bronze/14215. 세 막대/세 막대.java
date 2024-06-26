import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        if(arr[2] >= arr[1]+arr[0]){
            arr[2] = arr[1]+arr[0]-1;
        }

        int sum = 0;

        for(int i=0;i<3;i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}