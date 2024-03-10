package Project_1.ilyasse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // System.out.println(input.nextInt());
        int a = 2_000_000_000;  // a: identifier 2_000_000:literals
        System.out.println(a);
        System.out.println("enter an char ");
        String name = input.nextLine();
       // System.out.println(name);
        System.out.println("enter an float ");
        float marks = input.nextFloat();
      //  System.out.println(marks);
        System.out.println("somme opertion :");
        int mum1 = input.nextInt();
        int mum2 = input.nextInt();
        float sum = mum1 + mum2;
       // System.out.println(sum);
                          // typeCasting :
        int nbr = (int) (93.33);
        System.out.println(nbr); // ---> 93
        int x = 257;
        int b = (byte)(x);
        System.out.println(b); // ---> 257 % 256 = 1  !!!!1
        byte u = 40 ;
        byte n = 50 ;
        byte c = 100;
        int d = u * n / c;  //promoting u * n to int while operation :
        System.out.println(d);  //---> 20
        // uniCore Value :
        System.out.println("السلام"); // ----> unicore /unicorn
        



    }
}
