import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int Num = Integer.parseInt(bufferedReader.readLine());
        int result = 0;
        long arr[] = new long[Num];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<Num; i++){
            arr[i] = Long.parseLong(stringTokenizer.nextToken());
        }
        Arrays.sort(arr);

        for(int k=0; k<Num; k++){
            long find = arr[k];

            int i=0;
            int j=Num-1;

            while(i<j){
                if(arr[i] + arr[j] == find){
                    if(i != k && j != k){
                        result++;
                        break;
                    }
                    else if(i == k){
                        i++;
                    }
                    else if(j == k){
                        j--;
                    }
                }
                else if(arr[i] + arr[j] < find){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        System.out.println(result);
        bufferedReader.close();
    }
}