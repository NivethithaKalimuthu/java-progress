import java.lang.System;
import java.util.Scanner;
public class challenge6 {
    public static void main(String[] args) {
        Scanner nivi=new Scanner(System.in);
        int income = nivi. nextInt();
        if(income>6999)
        {
            System.out.println("scholarship is available");
        }
        else{
            System.out.println("nor eligible for scholarship");
        }
        nivi.close();
    }
    
}
