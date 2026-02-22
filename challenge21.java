import java.lang.System;
import java.util.Scanner;
public class challenge21 {
    public static void main(String[] args) {
        Scanner nivi=new Scanner(System.in);
        int[] marks=new int[5];
        for(int i=0;i<=4;i=i+1){
            marks[i]=nivi.nextInt();
        }
        for(int i=0;i<=4;i=i+1) {
            System.out.println(marks[i]);
            nivi.close();
        }
    }
}
