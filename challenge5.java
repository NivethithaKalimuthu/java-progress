import java.lang.System;
import java.util.Scanner;
public class challenge5 {
    public static void main(String[] args) {
        Scanner nivi=new Scanner(System.in);
        int mark =nivi.nextInt();
        if(mark>34)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        nivi.close();
        
    }
}
