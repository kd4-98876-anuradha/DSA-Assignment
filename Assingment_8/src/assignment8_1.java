package assignment8;

import java.util.HashMap;
import java.util.Map;

public class assignment8_1 {
    public static void main(String[] args) {
        String str = "hello good good hello";
        String arr[] = str.split(" ");

        HashMap<String,Integer> map = new HashMap<>();


        for(String s : arr){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
