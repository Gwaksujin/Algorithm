import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int arrSize = Integer.parseInt(stringTokenizer.nextToken());
        int questNum = Integer.parseInt(stringTokenizer.nextToken());

        int[][] arr = new int[arrSize+1][arrSize+1];

        for(int i=1; i<=arrSize; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j=1; j<=arrSize; j++){
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        int[][] sumArr = new int[arrSize+1][arrSize+1];

        for(int i=1; i<=arrSize; i++){
            for(int j=1; j<=arrSize; j++){
                sumArr[i][j] = sumArr[i][j-1] + sumArr[i-1][j] - sumArr[i-1][j-1] + arr[i][j];
            }
        }

        for(int i=0; i<questNum; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            int result = sumArr[x2][y2] - sumArr[x1 - 1][y2] - sumArr[x2][y1 - 1] + sumArr[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}