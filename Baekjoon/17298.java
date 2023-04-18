import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[]arr = new int[num];
        int[]ans = new int[num];
        String[] str = br.readLine().split(" ");

        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> myStack = new Stack<>();
        myStack.push(0);

        for(int i=1; i<num; i++){
            while(!myStack.isEmpty() && arr[myStack.peek()] < arr[i]){
                ans[myStack.pop()] = arr[i];
            }
            myStack.push(i);
        }
        while(!myStack.empty()){
            ans[myStack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<num; i++){
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}