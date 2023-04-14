import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int num = Integer.parseInt(stringTokenizer.nextToken());
        int scope = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        Deque<Node> myDeque = new LinkedList<>();

        for(int i =0 ; i<num; i++) {
            int now = Integer.parseInt(stringTokenizer.nextToken());
            while(!myDeque.isEmpty() && myDeque.getLast().value > now) {
                myDeque.removeLast();
            }
            myDeque.addLast(new Node(now, i));
            if(myDeque.getFirst().index <= i-scope) {
                myDeque.removeFirst();
            }
            bufferedWriter.write(myDeque.getFirst().value + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
    static class Node {
        public int value;
        public int index;
        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}