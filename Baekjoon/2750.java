import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0; i<num-1; i++){
            for(int j=0; j<num-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<num; i++){
            System.out.println(arr[i]);
        }
    }
}