package learnings.Exception;

import java.util.Scanner;

public class ProblemSloveException {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first Number:");
        int num= obj.nextInt();
        obj.nextLine();
        System.out.println("Enter Second Number:");
        int num1= obj.nextInt();
        try{

            int result=num/num1;
            System.out.println("Show  a Calculation value: " + result);


        }catch (ArithmeticException a){
            System.out.println("Cannot be divided by zero:");
        }
        finally {
            System.out.println("Calculation Finished:");
        }
    }

}
