package system;

import java.awt.*;
import java.util.*;

public class Task2Square {
    public static int allSum;
    public static void main(String[] args) {
        int N = 10;
        int M = 10;
        int[][] arr = new int[N][M];
        initArr(arr);
        showArr(arr);
        allSquare(arr);

    }
    public static void initArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1 + new Random().nextInt(50);
            }
        }
    }
    public static void showArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sumQueue(Queue<Integer> q){
        int sum = 0;
        for (int i :q) {
            sum += i;
        }
        return sum;
    }
    public static Point getMaxValuebyKey(Map<Integer, Point> treeMap){
        int i = 0;
        Point p = new Point();
        for (Map.Entry entry : treeMap.entrySet()) {
            if (i++ == treeMap.size()-1) p = (Point)entry.getValue();
        }
        return  p;

    }
    public static Point allSquare(int[][] arr){

        Map<Integer, Point> treeMap = new TreeMap<Integer, Point>();
        Queue<Integer> queue = new LinkedList<Integer>();

        int sum = 0;
        int k = 0;
        int D = 0;
        int N = arr.length;
        int M = arr[0].length;

        if (N > M) {
            D = M-1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < D; j++) {
                    sum += arr[i][j];
                }
                queue.add(sum);
                sum = 0;
                if (i >= D - 1) {
                    treeMap.put(sumQueue(queue), new Point(i - D + 1, 0));
                    queue.remove();
                    k++;
                }
            }
            queue.clear();
            for (int i = N - 1; i >= 0; i--) {
                for (int j = 1; j < D + 1; j++) {
                    sum += arr[i][j];
                }
                queue.add(sum);
                sum = 0;
                if (i <= N - D) {
                    treeMap.put(sumQueue(queue), new Point(i, 1));
                    queue.remove();
                    k++;
                }
            }
        }  else {
            D = N-1;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < D; j++) {
                    sum += arr[j][i];//
                }
                queue.add(sum);
                sum = 0;
                if (i >= D - 1) {
                    treeMap.put(sumQueue(queue), new Point( 0, i - D + 1));
                    queue.remove();
                    k++;
                }
            }
            queue.clear();

            for (int i = M - 1; i >= 0; i--) {
                for (int j = 1; j < D + 1; j++) {
                    sum += arr[j][i];
                }
                queue.add(sum);
                sum = 0;
                if (i <= M - D) {
                    treeMap.put(sumQueue(queue), new Point(1, i));
                    queue.remove();
                    k++;
                }
            }
        }

        System.out.println(k + " k");

        return  getMaxValuebyKey(treeMap);
    }



    public static Point largestSquareV1(int[][] arr){
        //lines
        int lColumn = 0;
        int rColumn = 0;
        int topLine = 0;
        int botLine = 0;
        //square
        int leftTop;
        int rightTop;
        int leftBottom;
        int rightBottom;

        for (int i = 0; i < arr.length; i++) {
            lColumn += arr[i][0];
        }
        for (int i = 0; i < arr.length; i++) {
            rColumn += arr[i][arr[i].length-1];
        }
        for (int j = 0; j < arr.length; j++) {
            topLine += arr[0][j];
        }
        for (int j = 0; j < arr.length; j++) {
            botLine += arr[arr.length-1][j];
        }
        //corners
        int p00 = arr[0][0];
        int p01 = arr[0][arr.length-1];
        int p10 = arr[arr.length-1][0];
        int p11 = arr[arr.length-1][arr.length-1];


        leftTop = (allSum - rColumn - botLine) + p11;
        rightTop = (allSum - lColumn - botLine) + p10;
        leftBottom = (allSum - topLine - rColumn) + p01;
        rightBottom = (allSum - topLine - lColumn) + p00;


        int rez = max(max(leftTop, rightTop), max(leftBottom, rightBottom));
        if (rez == leftTop) return new Point(0, 0);
        if (rez == rightTop) return new Point(0, 1);
        if (rez == leftBottom) return new Point(1, 0);
        else  return new Point(1, 1);





    }
    public static Point largestSquareV2(int[][] arr){
        int leftTop = 0;
        int rightTop = 0;
        int leftBottom = 0;
        int rightBottom = 0;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                leftTop += arr[i][j];
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                rightTop += arr[i][j];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                leftBottom += arr[i][j];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                rightBottom += arr[i][j];
            }
        }



        int rez = max(max(leftTop, rightTop), max(leftBottom, rightBottom));
        if (rez == leftTop) return new Point(0, 0);
        if (rez == rightTop) return new Point(0, 1);
        if (rez == leftBottom) return new Point(1, 0);
        if (rez == rightBottom) return new Point(1, 1);

        return  new Point(0, 0);

    }

    public static int max(int a, int b){
        if (a > b) return a;
        else return b;
    }
    public static int sumArr(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum +=arr[i][j];
            }
        }
        allSum = sum;
        return sum;
    }

}
