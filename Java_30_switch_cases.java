import java.util.Scanner;

public class Java_30_switch_cases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fruit name: ");
        String fruit = in.next();
        // Same is done with the help of if - else statement and switch statement.
        //lets try with 1st if - else statement.
//        if (fruit.equals("mango")){
//            System.out.println("King of fruits");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("Sweet fruit");
//            }

        //Let try with switch statement:

//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet fruit");
//                break;
//            case "Orange":
//                System.out.println("A round fruit");
//                break;
//            case "Grapes":
//                System.out.println("A small fruit");
//                break;
//            default:
//                System.out.println("Enter the valid fruit name!!");
//        }



        //Enhanced format of switch format by press Alt + enter on switch case.


        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet fruit");
            case "Orange" -> System.out.println("A round fruit");
            case "Grapes" -> System.out.println("A small fruit");
            default -> System.out.println("Enter the valid fruit name!!");
        }

        // Q.2 print week days:
        System.out.println("Enter day number: ");
        int day= in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }
        // Q. Print weekend and weekday.
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

        //in enhanced form:
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}