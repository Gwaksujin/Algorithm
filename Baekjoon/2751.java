import java.io.*;
import java.util.*;

public class Main{
    public static int[] arr, tmp;
    public static long result;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        arr = new int[num+1];
        tmp = new int[num+1];

        for(int i=1; i<=num; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        merget_sort(1, num);

        for(int i=1; i<=num; i++){
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void merget_sort(int start, int end){
        if(end - start < 1)
            return;
        int middle = start + (end - start) / 2;
        merget_sort(start, middle);
        merget_sort(middle+1, end);

        for(int i=start; i<=end; i++){
            tmp[i] = arr[i];
        }
        int k = start;
        int index1 = start;
        int index2 = middle + 1;

        while(index1 <= middle && index2 <= end){
            if(tmp[index1] > tmp[index2]){
                arr[k] = tmp[index2];
                k++;
                index2++;
            } else{
                arr[k] = tmp[index1];
                k++;
                index1++;
            }
        }
        while(index1 <= middle){
            arr[k] = tmp[index1];
            k++;
            index1++;
        }
        while(index2 <= end){
            arr[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}