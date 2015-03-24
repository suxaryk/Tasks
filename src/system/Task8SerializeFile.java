package system;


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Task8SerializeFile {
    private static List<Junior> list = new ArrayList<Junior>();
    public static void read(Path path) throws IOException{
        ObjectInputStream objectInputStream  = null;
        Junior j;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()));



            while ((j = (Junior) objectInputStream.readObject()) != null ){
               // list.add(j instanceof  Junior?(Junior) j:null);
                list.add(j);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            objectInputStream.close();
        }


    }
    public static void write(Path path) throws IOException{
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream= new ObjectOutputStream(new FileOutputStream(path.toFile()));
            objectOutputStream.writeObject(new Junior("Jon","Bond1", new Integer[]{0,0,20,0,0}));
            objectOutputStream.writeObject(new Junior("Jon","Bond2", new Integer[]{10,10,0,0,30}));
            objectOutputStream.writeObject(new Junior("Jon","Bond3", new Integer[]{10,10,20,30,30}));
            objectOutputStream.writeObject(new Junior("Jon","Bond4", new Integer[]{10,10,0,0,0}));
            objectOutputStream.writeObject(new Junior("Jon", "Bond5", new Integer[]{10, 10, 10, 10, 10}));
            objectOutputStream.writeObject(null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
        }



    }
    public static void sortListDesc(){
        Collections.sort(list, new Comparator<Junior>() {
            @Override
            public int compare(Junior o1, Junior o2) {
                return o2.sum.compareTo(o1.sum);
            }
        });
    }
    public static void show(){
        System.out.println("List size is " + list.size());
        for (Junior junior :list) {
            System.out.println(junior);
        }


    }


    public static void main(String[] args) throws IOException{
        write(Paths.get("file.dat"));
        read(Paths.get("file.dat"));
        sortListDesc();


        show();


    }
}

class Junior implements Serializable{
    private String name;
    private String sname;
    private Integer[] marks = new Integer[4];
    public Integer sum  = 0;

    Junior(String name, String sname, Integer[] marks) {
        this.name = name;
        this.sname = sname;
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = marks[i];
            sum += this.marks[i];
        }
    }




    @Override
    public String toString() {

        if (sum != 0){
            if (sum > 50) return name + " " + sname +" have " + sum + " points, and pass exam";
            else if (sum < 50) return name + " " + sname +" have " + sum + " points, and didn`t pass exam";
            else return name + " " + sname + " have " + sum + " points";
        } else
            return super.toString();


    }
}

