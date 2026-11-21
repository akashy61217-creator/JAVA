package learnings.Java_all_lec;

import java.util.Scanner;

public class Switch_statement18 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age ");
        Scanner sc=new Scanner(System.in);
        age= sc.nextInt();
        if(age>=56){
            System.out.println("You are experienced:");
        } else if (age>=46) {
            System.out.println("You are semi experienced:");

        } else if (age<=17) {
            System.out.println("You are not eligible:");

        }
        if(age>18){
            System.out.println("you are eligible for job:");
            if(age==60){
                System.out.println("You are getting older:");
            }
            else{

            }
        }




    }

}
