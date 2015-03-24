package system;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4LastindexOf {
    public static void main(String[] args) {
        task4();

    }
    public static void task4(){
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = buf.readLine();
            String str = buf.readLine();
            System.out.println(line.lastIndexOf(str));



        } catch (IOException e) {
            System.out.println(-1);

        }

    }
}
