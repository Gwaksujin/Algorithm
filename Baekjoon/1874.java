import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int arrNum = scanner.nextInt();
        int[] arr = new int[arrNum];

        for(int i=0; i<arrNum; i++){
            arr[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();

        StringBuffer buffer = new StringBuffer();
        int num = 1;
        boolean result = true;

        for(int i=0; i<arr.length; i++){
            int now = arr[i];

            if(now >= num){
                while(now >= num){
                    stack.push(num++);
                    buffer.append("+\n");
                }
                stack.pop();
                buffer.append("-\n");
            }
            else{
                int no = stack.pop();

                if(no > now){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else{
                    buffer.append("-\n");
                }
            }
        }
        if(result)
            System.out.println(buffer.toString());
    }
}