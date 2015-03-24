package system;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task5LargAver {
    public static void main(String[] args) {
        task5();

    }

    public static void task5(){
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        int num = 0;
        int k = 0;
        int sum = 0;
        try {
            for(;;){
                num = Integer.parseInt(buf.readLine());
                if (num < 0) break;
                list.add(num);
                k++;
                sum += num;
            }

            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });



        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println(list.get(list.size()-1) + " " + list.get(list.size()-2));
            System.out.println((double) sum/k);
        }
    }
}
