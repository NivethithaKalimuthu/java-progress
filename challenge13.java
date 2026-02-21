import java.lang.System;
import java.util.Scanner;
public class challenge13 {
    public static void main(String[] args) {
        Scanner nivi=new Scanner(System.in);
        System.out.println("enter your salary and age");
        int salary=nivi.nextInt();
        int age=nivi.nextInt();
        if(salary>=20000||age<25){
            System.out.println("ok for loan");
            int loan=nivi.nextInt();
            if(loan<50000){
                System.out.println("avaialble");
            }
            else{
                System.out.println("not");
            }
                

        }
        else{
            System.out.println("not");
            nivi.close();
        }
    }
    
}
