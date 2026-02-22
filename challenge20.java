import java.lang.System;
import java.util.Scanner;
public class challenge20 {
    public static void main(String[] args) {
        int[] score =new int[5];
        Scanner nivi=new Scanner(System.in);
        score[0]=nivi.nextInt();
        score[1]=nivi.nextInt();
        score[2]=nivi.nextInt();
        score[3]=nivi.nextInt();
        score[4]=nivi.nextInt();
        System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]);
        nivi.close();
    }
}
