import java.lang.System;
import java.util.Scanner;
public class challenge1 {
    public static void main(String[] args) {
        Scanner nivi=new Scanner(System.in);
        String name=nivi.nextLine();
        int age=nivi.nextInt();
        nivi.nextLine();
        String address=nivi.nextLine();
        System.out.println("my name is:"+name);
        System.out.println("my age is:"+age);
        System.out.println("my address is:"+address);
        nivi.close();

    }

}
