import java.lang.System;
import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner nivi = new Scanner(System.in);
        int a=nivi.nextInt();
        int b=nivi.nextInt();
        System.out.println(a+b);
        nivi.close();
    }
    
}
