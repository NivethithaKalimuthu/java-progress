import java.lang.System;
import java.util.Scanner;
public class comparison {
    public static void main(String[] args) {
        Scanner nivi =new Scanner(System.in);
        int num1 = nivi.nextInt();
        int num2 =nivi.nextInt();
        if(num1==num2)
        {
            System.out.println("it is equal");
        }
        else
        {
            System.out.println("not equal");
        }
        nivi.close();
        

    }
    
}
