import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        mData[] arr = new mData[num];

        for(int i=0; i<num; i++){
            arr[i] = new mData(Integer.parseInt(bufferedReader.readLine()), i);
        }
        Arrays.sort(arr);

        int max = 0;
        for(int i=0; i<num; i++){
            if(max < arr[i].index - i)
                max = arr[i].index - i;
        }
        System.out.println(max+1);
    }
}

class mData implements Comparable<mData>{
    int value;
    int index;

    public mData(int value, int index){
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o){
        return this.value - o.value;
    }
}