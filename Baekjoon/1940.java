import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int material = Integer.parseInt(bufferedReader.readLine());
        int Num = Integer.parseInt(bufferedReader.readLine());
        int[] materialNum = new int[material];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<material; i++){
            materialNum[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(materialNum);

        int count = 0;
        int i = 0;
        int j = material - 1;

        while(i < j){
            if(materialNum[i] + materialNum[j] < Num){
                i++;
            }
            else if(materialNum[i] + materialNum[j] > Num){
                j--;
            }
            else{
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
        bufferedReader.close();
    }
}