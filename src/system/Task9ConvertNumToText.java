package system;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Task9ConvertNumToText {
    private static HashMap<Integer, String> map = new HashMap<Integer, String>();

    public static void main(String[] args)  throws IOException {
        ConvertNumToText();
    }
    public static void ConvertNumToText() throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.parseInt(buf.readLine());
        System.out.println(num.byteValue());
        // num 0..999,1000
        //logic

    }
    public static void createTable(){
        //fourteen fifteen sixteen
        map.put(0,"zero");
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        map.put(10,"ten");
        map.put(11,"eleven");
        map.put(12,"twelve");
        map.put(13,"thirteen");
    }
}
