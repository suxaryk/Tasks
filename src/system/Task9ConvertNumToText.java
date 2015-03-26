package system;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Map;
import java.util.TreeMap;

public class Task9ConvertNumToText {
    private static Map<Integer, String> map = new TreeMap<Integer, String>();

    public static void main(String[] args)  throws IOException {
        ConvertNumToText();
        //showMap();

    }
    public static void ConvertNumToText() {
        createTable();
        Integer num = null;
        try {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(buf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (num instanceof Integer){
            if (num >= 0 && num <= 1000){
                int d0 = (num % 1000) /100 * 100;
                int d1 = (num % 100) / 10 * 10;
                int d2 = (num % 10);



                if (num == 1000) System.out.print(map.get(1000));
                if (num == 0) System.out.print(map.get(0));
                if (d0 >= 100) System.out.print(map.get(d0) );

                if (d1 >= 20) {
                    if (d0 >= 100) System.out.print(" and ");
                    System.out.print(map.get(d1));
                }
                if (d2 >= 0){
                    if (d1 >= 20) System.out.print("-");
                    //if (d0 >= 100) System.out.print(" ");
                    System.out.print(map.get(num % 100));
                }

            }else {
                throw new Error("Out of range 0..1000");
            }

        }

        // num 0..999,1000

        //logic

    }
    public static void createTable(){
        //twenty seventeen eighteen nineteen twenty thirty forty fifty sixty seventy eighty ninety hundred
        String teen = "teen";
        String ty = "ty";
        String thir = "thir";
        String hundred = "hundred";
        String thousand = "thousand";


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
        map.put(13, thir + teen);
        map.put(14, map.get(4) + teen);
        map.put(15, "fifteen");
        map.put(16, map.get(6) + teen);
        map.put(17, map.get(7) + teen);
        map.put(18, map.get(8) + teen.substring(1));
        map.put(19, map.get(9) + teen);
        map.put(20, "twenty");
        map.put(30, thir + ty);
        map.put(40,"for" + ty);
        map.put(50,"fif" + ty);
        map.put(60, map.get(6) + ty);
        map.put(70, map.get(7) + ty);
        map.put(80, map.get(8).substring(0, map.get(8).length() - 1) + ty);
        map.put(90, map.get(9) + ty);
        map.put(100, map.get(1) + " " + hundred);
        map.put(200, map.get(2) + " " + hundred);
        map.put(300, map.get(3) + " " + hundred);
        map.put(400, map.get(4) + " " + hundred);
        map.put(500, map.get(5) + " " + hundred);
        map.put(600, map.get(6) + " " + hundred);
        map.put(700, map.get(7) + " " + hundred);
        map.put(800, map.get(8) + " " + hundred);
        map.put(900, map.get(9) + " " + hundred);
        map.put(1000, map.get(1) + " " + thousand);



    }

    public static void showMap(){
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }
    }
}
