package system;

public class Task3ValidIp {
    public static void main(String[] args) {
        task3();
    }
    public static void task3(){
        String s = "sdfsdf";
        s.matches(
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        System.out.println(s);

    }



}
