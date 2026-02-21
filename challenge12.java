import java.lang.System;
import java.util.Scanner;
public class challenge12 {
    public static void main(String[] args) {
        Scanner nivi=new Scanner(System.in);
        String color=nivi.nextLine();
        if (color.equals("red")) {
            System.out.println("stop");
            
        }
        else if(color.equals("yellow")){
            System.out.println("get ready");
        }
        else if(color.equals("green")){
            System.out.println("go");
            nivi.close();

        }
    }
    
}
