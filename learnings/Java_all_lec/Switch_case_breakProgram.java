package learnings.Java_all_lec;

import java.util.Scanner;

public class Switch_case_breakProgram {
    public static void main(String[] args) {
        Scanner akash=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = akash.nextInt();
        switch (age){
            case 17:
                System.out.println("You are not aligible for driving");
                break;
            case 18:
                System.out.println("You are aligible for driving!");
            case 60:
                System.out.println("Please don’t drive, you’re 60 years old now.");
                break;




        }
        int a=10;
        if( a==11){
            System.out.println("im am 11");
        }else{
            System.out.println("im not 11");

        }
        //Question calculate income tax
        Scanner incomePay=new Scanner(System.in);
        System.out.println("Please Enter your income in lakh!");
        float tax1=incomePay.nextFloat();
        float tax=0;
        float income=3.32f;
        if(tax>2.5){
            tax=tax+0;

        } else if (tax>2.5f && tax<5f) {
            tax=tax+0.05f*(income-2.5f);
            tax=tax+0.2f*(income-5f);

        } else if (tax>10f) {
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.05f*(10.0f-2.5f);
            tax=tax+0.05f*(income-2.5f);

        }



    }
}
