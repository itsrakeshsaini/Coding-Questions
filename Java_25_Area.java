import java.util.*;
public class Java_25_Area{
    static boolean var= true;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(var) {
            System.out.println("Menu Driven: ");
            System.out.println("Enter 1 for Circle ");
            System.out.println("Enter 2 for Rectangle ");
            System.out.println("Enter 3 for Triangle ");
            System.out.println("Enter 4 for Parallelogram ");
            System.out.println("Enter 5 for Rhombus ");
            System.out.println("Enter 6 for Exit...");
            System.out.print("Enter the choice: ");
            int n = in.nextInt();
            area(n);
        }
    }
    static void area(int n){
        Scanner in = new Scanner(System.in);


        switch (n) {
            case 1: {
                System.out.print("Enter the radius r: ");
                int r = in.nextInt();
                System.out.println("area of the circle: " +3.14 * r * r);
                break;
            }
            case 2: {
                System.out.println("Enter the length and breadth: ");
                int l = in.nextInt(), b = in.nextInt();
                System.out.println("The area is: " + l * b);
                break;
            }
            case 3: {
                System.out.println("Enter side1, side2, side3: ");
                float a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
                float S = (a + b + c) / 3;
                double temp =(S * (S - a) * (S - b) * (S - c));
                double ans = Math.pow(temp,0.5);
                System.out.println("The area is: " + ans);
                break;
            }
            case 4: {
                System.out.println("Enter the base and height respectively: ");
                int b = in.nextInt();
                int h = in.nextInt();
                float ans = (1 / 2) * (b * h);
                System.out.println("The area is: " + ans);
                break;
            }
            case 5: {
                System.out.println("Enter the diagonal1 and diagonal2: ");
                int a = in.nextInt(), b = in.nextInt();
                int ans = (a * b) / 2;
                System.out.println("The area is: ");
                break;
            }

            case 6: {
                System.out.println("Exiting...");
                var=false;
                break;
            }
            default: {
                System.out.println("enter a valid choice..!! ");

            }

            System.out.println("");
        }
    }
}