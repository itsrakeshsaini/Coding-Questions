
import java.util.Scanner;

public class Java_31_nested_switch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter emp id: ");
        int emp=in.nextInt();
        System.out.println("Enter department name: ");
        String depart= in.next();

        switch (emp){
            case 1:
                System.out.println("Rakesh");
                break;
            case 2:
                System.out.println("Yash");
                break;
            case 3:
                System.out.println("Rahul");
                switch (depart){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department available");
                }
                break;
            default:
                System.out.println("Enter valid emp id!!");
        }

        // Better way to write:
//        switch (emp) {
//            case 1 -> System.out.println("Rakesh");
//            case 2 -> System.out.println("Yash");
//            case 3 -> {
//                System.out.println("Rahul");
//                switch (depart) {
//                    case "IT" -> System.out.println("IT department");
//                    case "Management" -> System.out.println("Management department");
//                    default -> System.out.println("No department available");
//                }
//            }
//            default -> System.out.println("Enter valid emp id!!");
//        }
    }
}
