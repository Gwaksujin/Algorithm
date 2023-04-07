import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        int arr = scanner.nextInt();
        int Num = scanner.nextInt();
        long[] sumArr = new long[arr];
        long[] sameArr = new long[Num];
        long answer = 0;

        sumArr[0] = scanner.nextInt();
        for(int i=1; i<arr; i++){
            sumArr[i] = sumArr[i-1] + scanner.nextInt();
        }

        for(int i=0; i<arr; i++){
            int remainder = (int)(sumArr[i] % Num);
            if(remainder == 0)
                answer++;
            sameArr[remainder]++;
        }

        for(int i=0; i<Num; i++){
            if(sameArr[i] > 1){
                answer += sameArr[i] * (sameArr[i] - 1) / 2;
            }
        }
        System.out.println(answer);
    }
}