import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Num = scanner.nextInt();
        int count = 1;
        int start = 1;
        int end = 1;
        int sum = 1;

        while(end != Num){
            if(sum == Num){
                count++;
                end++;
                sum += end;
            }
            else if(sum > Num){
                sum -= start;
                start++;
            }
            else{
                end++;
                sum += end;
            }
        }
        System.out.println(count);
    }
}