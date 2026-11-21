package learnings.Java_all_lec;

import java.util.Scanner;

public class Lec_No_27 {
    public static void main(String[] args) {
        int[] num={100,20,30,40,50,60};
//        String []name= {"akash" ,"kanya", "Nikki" ,"Rahul" };
       System.out.println(num.length);


        System.out.println("=========================================================================");
       // Simple Way  print
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);


        System.out.println("=============================================================================");

        // Displaying the Array(For Loop)
        for(int i=0 ; i< num.length ;i++){
            System.out.println(num[i]);
        }

        System.out.println("========================Reverse order=====================================");
        for(int i= num.length -1; i>=0 ;  i--){
            System.out.println(num[i]);

        }

        System.out.println("==================Using for - each loops======================== ");
         //for-each Loop
        for( int element:num){
            System.out.println(element/3);
            System.out.println(element+5);





        }
        System.out.println("=================================================================================");
        Scanner akash=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int num1=akash.nextInt();
         int[] num5 =new int[num1];
        System.out.println("creating array with size :"+ num5.length);






    }
}
