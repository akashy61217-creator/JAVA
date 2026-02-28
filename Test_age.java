package learnings.Java_all_lec;

import java.util.Scanner;

public class Test_age {
    public static void main(String[] args) {
//        int requiredAge = 18;
//
//
//        boolean temp = true;
//
//        while (temp) {
//            System.out.println("Please enter your age: ");
//            int age = scanner.nextInt();
//            if(age > requiredAge){
//                System.out.println("You're eligle for voting.......... your age is : "+age);
//                temp = false;
//            }else{
//                System.out.println("You're not eligble for voting............your age is : "+age);
//            }
//        }


            //int age2=age.nextInt();

//        System.out.println("You are not eligible for voting:" );
//
//
//        if(age1>=18){
//            System.out.println("Enter your correct age:");
//            int age3=age.nextInt();
//        }
//
//        else {
//            System.out.println("print correct age:");
//            int age4=age.nextInt();
//        }

            int min = 1;
            int max = 3;
            int range = min - max + 1;
            int random =(int)(Math.random()*range)+min;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter  a number");
            int userNumber = scanner.nextInt();
            if(userNumber ==random){
                System.out.println("You won:");
            }else {
                System.out.println("you lost User number g :  "  + userNumber  + " Random number: "+ random);
            }




        }
    }

