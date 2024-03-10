package Project_1.ilyasse; import java.sql.SQLOutput;
import java.util.Scanner;
public class JDSA_Part_3 {
    public static void main(String[] args) {
       // the diff between "==" or .equals
        //.equals the value
        // ==  check if both point to the same object

        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("king of fruit");
            case "Appel" -> System.out.println("A sweet fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("please enter a fruit include in the systeme :");
        }
    int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wensday");
            default -> System.out.println("enter a valid number :");
        }


        // nested switch :

    int sempID = in.nextInt();
    String department = in.next();

        switch (sempID) {
            case 1 -> System.out.println("ilyasse younes ");
            case 2 -> System.out.println("salma younes ");
            case 3 -> {
                System.out.println("ayoub younes ");
                switch (department) {
                    case "it" -> System.out.println("IT departement :) ");
                    case "management" -> System.out.println("Managment departemt :(");
                }
            }
            default -> System.out.println("enter another valide  value :  ");
        }

    }




        }

