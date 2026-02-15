import java.lang.System;
import java.util.Scanner;
public class challenge3 {
    public static void main(String[] args) {
        Scanner nivi=new Scanner(System.in);
        String name=nivi.nextLine();
        double score=nivi.nextDouble();
        nivi.nextLine();
        String department=nivi.nextLine();
        System.out.println("my name is:"+name);
        System.out.println("my score is:"+score +"/10");
        System.out.println("my department is:"+department);
        nivi.close();




    }

    
}
