import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int dataNum = Integer.parseInt(stringTokenizer.nextToken());
        int quizNum = Integer.parseInt(stringTokenizer.nextToken());

        long[] sumArr = new long[dataNum + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=1; i<= dataNum; i++){
            sumArr[i] = sumArr[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int j=0; j<quizNum; j++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(sumArr[end] - sumArr[start-1]);
        }
    }
}