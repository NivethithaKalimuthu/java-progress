import java.lang.System;
import java.util.Scanner;
public class challenge11 {
    public static void main(String[] args) {
        
    
    Scanner nivi=new Scanner (System.in);
    int num1=nivi.nextInt();
    int num2=nivi.nextInt();
    int num3=nivi.nextInt();
    int num4=nivi.nextInt();
    int num5=nivi.nextInt();
    int total =num1+num2+num3+num4+num5;
    int avg=total/5;
    if(avg<35){
        System.out.println("add class need");
    }   
    else{
        System.out.println("good");
        nivi.close();
    }}
    
}

