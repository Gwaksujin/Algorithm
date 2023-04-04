import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int subject = scanner.nextInt();
        int arr[] = new int[subject];

        for(int i=0; i<subject; i++){
            arr[i] = scanner.nextInt();
        }

        long sum = 0;
        long max = 0;

        for(int i=0; i<subject; i++){
            if(arr[i] > max)
                max = arr[i];
            sum += arr[i];
        }
        System.out.println(sum * 100.0 / max / subject);
    }
}