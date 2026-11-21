package learnings.Java_all_lec;

import java.util.Scanner;

public class WhileLoop_lec21 {
    public static void main(String[] args) {
//        Scanner table2=new Scanner(System.in);
//        System.out.println("Enter your table Number:");
//        int table3= table2.nextInt();
//        int table=1;
//        //int num=30;
//        while(table<=10){
//            int table1=table3*table;
//            System.out.println(table1);
//            table++;
//
//
//        }
//        System.out.println("===============================================");
//        boolean check=true;
//        while(check){
//            System.out.println("here i am presenting an infinite loops:");
//        }
        //do while loop.
        int age=10;
        do{
            System.out.println("print your age:" +age);
            age++;

        }while (age<15);

        //Write a progrma to print first n natural number using do-while loop.
        int num=0;
        do{
            System.out.println(num);
            num++;
        }while(num<=100);






    }
}
