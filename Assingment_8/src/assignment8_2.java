package assignment8;

import java.util.HashMap;
import java.util.Map;

public class assignment8_2 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,3,4,5,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int max = Integer.MIN_VALUE;
        int value  = 0 ;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                value = entry.getKey();
            }
        }

        System.out.println(value);
    }
}

