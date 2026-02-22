import java.lang.System;
import java.util.Scanner;
public class challenge24 {
    public static void main(String[] args) {
        Scanner nivi=new Scanner(System.in);
        int size=nivi.nextInt();
        int[] input =new int[size];
        for( int i=0;i<=size-1;i=i+1){
            input[i]=nivi.nextInt();
            nivi.close();
        }
    }
    
}
