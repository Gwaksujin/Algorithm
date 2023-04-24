import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int[] arr = new int[people];
        int[] sumArr = new int[people];

        for(int i=0; i<people; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=1; i<people; i++){
            int insert_point = i;
            int insert_value = arr[i];

            for(int j=i-1; j>=0; j--){
                if(arr[j] < arr[i]){
                    insert_point = j+1;
                    break;
                }
                if(j==0){
                    insert_point = 0;
                }
            }

            for(int j=i; j>insert_point; j--){
                arr[j] = arr[j-1];
            }
            arr[insert_point] = insert_value;
        }
        sumArr[0] = arr[0];

        for(int i=1; i<people; i++){
            sumArr[i] = sumArr[i-1] + arr[i];
        }

        int sum = 0;
        for(int i=0; i<people; i++){
            sum += sumArr[i];
        }
        System.out.println(sum);
    }
}