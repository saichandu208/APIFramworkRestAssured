package Programms;


import java.util.HashMap;
import java.util.Map;

public class MapReader {

    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<>();

        m.put(1, "Sai Chandu");
        m.put(2," Thanoj Kumar");

        for(Map.Entry<Integer, String> entry : m.entrySet()){

            System.out.println(entry.getKey()+"   "+entry.getValue());

        }
    }
}
