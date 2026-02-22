public class challenge27 {
    //creating laptop
    String name="";
    int proc=0;
    int ram=0;
    int price=0;
    public static void main(String[] args) {
        challenge27 laptop=new challenge27();
        laptop.name="hp";
        laptop.proc=15;
        laptop.ram=6;
        laptop.price=70000;
        System.out.println(laptop.price);
        challenge27 laptop2=new challenge27();
        laptop2.name="imac";
        laptop2.proc=25;
        laptop2.ram=16;
        laptop2.price=80000;
        System.out.println(laptop2.price);

    }
}//here we are accessing the class template and using for need with object

