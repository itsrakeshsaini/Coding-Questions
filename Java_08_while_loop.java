public class Java_08_while_loop {
    public static void main(String[] args) {
        /*
            Syntax:
            while(condition)
            {
               body.
               increment/decrement.
            }
         */
//        int n=1;
//        while (n<=5){
//            System.out.println(n);
//            n++;
//        }

        /*
           Syntax do while loop:
           do{
             body;
             increment/decrement.
           }
           while(condition);
         */
//  Do while loop will execute at least once weather the is true or not.
        int n=1;
        do {
            System.out.println(n);
            n++;
        }
        while(n<=5);
    }
}
