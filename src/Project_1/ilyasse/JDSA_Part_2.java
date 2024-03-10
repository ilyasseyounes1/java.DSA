package Project_1.ilyasse;
import java.util.Scanner;


public class JDSA_Part_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fibonacci num : ");
        System.out.println("Enter a tow number : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("give the nTH number : ");
        System.out.println("Fibonacci num : ");
        int n = in.nextInt();
        int S = 0 ;
        for (int i=0 ; i<n ; i++){
            S = a + b ;
            a = b  ;
            b = S;


        }
        System.out.println("the nth value of fibonacci is :"+a);

        // COUNTING OCCURRENCES :
        // N % 10 = last digit
        int N = 45534;
        int count = 0;
        while ( N > 0) {
            int rem = n % 10;
             if (rem == 5){
                count ++;
            }
             n = n / 10 ;
        }

                //REVERSE A NUMBER :
        int u = 123456789;
        int count1 = 0;
        int sort = 0;
        while (u>0){
            int rem = u % 10;
            u = u / 10 ;

            sort  = sort * 10 + rem ;


        }
        System.out.println(sort);



    }

}
