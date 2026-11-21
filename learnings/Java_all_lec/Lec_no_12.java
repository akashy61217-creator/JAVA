package learnings.Java_all_lec;

import java.util.Scanner;

public class Lec_no_12 {
    public static void main(String[] args) {
        //Precedence& Associativity
        float a=7/4.0f * 9/2.0f;
        System.out.println(a);
        System.out.println("===========================================================================");

        // Write a java program to encrypt a grade by  adding 8 to it  Decrypt it to show the  correct grade.

        //encrypt
        char grade='O';
        grade =(char) (grade +6);
        System.out.println(grade);

        //Decrypt
        grade =(char)(grade -6);
        System.out.println(grade);


        System.out.println("=============================================================================================");

        Scanner obj =new Scanner(System.in);
        System.out.println("Enter your number:");
        int num =obj.nextInt();
        System.out.println(num >90);





    }
}
