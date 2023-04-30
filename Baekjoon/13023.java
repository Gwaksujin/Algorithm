import java.util.*;
import java.io.*;

public class Main{

    static boolean visited[];
    static ArrayList<Integer>[] arr;
    static boolean arrive;

    public static void main(String[] args){
        int nodeNum;
        int edgeNum;
        arrive = false;
        Scanner scanner = new Scanner(System.in);
        nodeNum = scanner.nextInt();
        edgeNum = scanner.nextInt();
        arr = new ArrayList[nodeNum];
        visited = new boolean[nodeNum];

        for(int i=0; i<nodeNum; i++){
            arr[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<edgeNum; i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            arr[start].add(end);
            arr[end].add(start);
        }

        for(int i=0; i<nodeNum; i++){
            DFS(i, 1);
            if(arrive)
                break;
        }
        if(arrive)
            System.out.println("1");
        else
            System.out.println("0");
    }

    public static void DFS(int now, int depth){
        if(depth == 5 || arrive){
            arrive = true;
            return;
        }
        visited[now] = true;

        for(int i : arr[now]){
            if(!visited[i]){
                DFS(i, depth + 1);
            }
        }
        visited[now] = false;
    }
}