import java.io.*;
import java.util.*;

public class Main{
    static ArrayList<Integer>[] arr;
    static boolean visited[];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nodeNum = Integer.parseInt(st.nextToken());
        int edgeNum = Integer.parseInt(st.nextToken());
        arr = new ArrayList[nodeNum + 1];
        visited = new boolean[nodeNum + 1];

        for(int i=1; i<nodeNum+1; i++){
            arr[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<edgeNum; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[start].add(end);
            arr[end].add(start);
        }
        int count = 0;
        for(int i=1; i<nodeNum+1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }
    static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : arr[v]){
            if(visited[i] == false){
                DFS(i);
            }
        }
    }
}