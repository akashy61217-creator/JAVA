package learnings.Java_all_lec;

import java.util.Scanner;

public class Conditional_statement {
    public static void main(String[] args) {

        boolean isNewFlow = false;

        if(isNewFlow){
            System.out.println("using new flow");
            //business logic
        }else {
            System.out.println("using old flow");
            //business logic
        }

        int age=45;
        boolean isCond = age<=40;
        System.out.println(isCond);

        if(isCond){
            System.out.println("print an Old person age:");
        }
        else {
            System.out.println("print a young person age:");
        }

//       Scanner num=new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int number1= num.nextInt();
//        if(age<50){
//            System.out.println("print an Old person age:");
//        }
//        else {
//            System.out.println("print a young person age:");
//        }





    }
}
