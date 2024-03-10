package Project_1.ilyasse;

public class Demo {
    public static void main(String[] args) {
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
