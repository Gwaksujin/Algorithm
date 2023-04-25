import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr, 0, num-1, k-1);
        System.out.println(arr[k-1]);
    }

    public static void quickSort(int[] arr, int start, int end, int k){
        if(start < end){
            int pivot = partition(arr, start, end);
            if(pivot == k)
                return;
            else if(k < pivot)
                quickSort(arr, start, pivot-1, k);
            else
                quickSort(arr, pivot+1, end, k);
        }
    }

    public static int partition(int[] arr, int start, int end){
        if(start+1 == end){
            if(arr[start] > arr[end])
                swap(arr, start, end);
            return end;
        }
        int middle = (start + end) / 2;
        swap(arr, start, middle);
        int pivot = arr[start];
        int i = start+1, j = end;

        while(i <= j){
            while(pivot < arr[j] && j > 0){
                j--;
            }
            while(pivot > arr[i] && i < arr.length-1){
                i++;
            }
            if(i <= j){
                swap(arr, i++, j--);
            }
        }
        arr[start] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}