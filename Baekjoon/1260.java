import java.io.*;
import java.util.*;

public class Main{
    static boolean visited[];
    static ArrayList<Integer>[] arr;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int node = scan.nextInt();
        int edge = scan.nextInt();
        int start = scan.nextInt();
        arr = new ArrayList[node+1];

        for(int i=1; i<=node; i++){
            arr[i] = new ArrayList<Integer>();
        }

        for(int i=1; i<=edge; i++){
            int s = scan.nextInt();
            int e = scan.nextInt();
            arr[s].add(e);
            arr[e].add(s);
        }

        for(int i=1; i<=node; i++){
            Collections.sort(arr[i]);
        }
        visited = new boolean[node+1];
        DFS(start);
        System.out.println();
        visited = new boolean[node+1];
        BFS(start);
        System.out.println();
    }

    public static void DFS(int node){
        System.out.print(node + " ");
        visited[node] = true;

        for(int i:arr[node]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }

    private static void BFS(int node){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        visited[node] = true;

        while(!queue.isEmpty()){
            int now_node = queue.poll();
            System.out.print(now_node + " ");

            for(int i:arr[now_node]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}