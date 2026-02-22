import java.lang.System;
import java.util.Scanner;
public class challenge26 {
    public static void main(String[] args) {
        Scanner nivi=new Scanner(System.in);
        int count=0;
        do{
            System.out.println("enter the num>10:");
            count=nivi.nextInt();

        }while(count<10);
        nivi.close();
    }
}
