import java.lang.System;
import java.util.Scanner;
public class challenge2 {
    public static void main(String[] args) {
        Scanner nivi=new Scanner(System.in);
        int a=nivi.nextInt();
        int b=nivi.nextInt();
        int c=nivi.nextInt();
        int d=a*b*c;
        int e=a+b+c;
        //System.out.println(d);
        //System.out.println(e);
        System.out.println(d/e);
        nivi.close();


    }

    
}
