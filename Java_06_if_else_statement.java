public class Java_06_if_else_statement {
    public static void main(String[] args) {

      /*
   Syntax of if else statement:
   if(boolean expression T or F){
      //body
   }else{
      //do this.
   }
    */
//
//      int salary =34000;
//      if(salary>10000)
//      {
//         salary = salary + 2000;
//      }else {
//         salary=salary+1000;
//      }

        //multiple if-else
        int salary=29000;
        if(salary>30000){
            salary+=2000; //salary=salary+2000
        } else if (salary>20000) {
            salary+=3000;
        }else {
            salary+=1000;
        }

        System.out.println(salary);
    }
}
