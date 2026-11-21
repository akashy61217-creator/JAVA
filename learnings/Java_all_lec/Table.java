import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        //20 table

        System.out.println("Enter number for table");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 1; i <= 10; i++ ){
           int result = number * i;
           System.out.println(result);
           // System.out.println(number +" x "+ i + " = "+result);
        }

        System.out.println("--------------------------------------------------------");
        int temp = 1;
        while (temp <= 10){
            int result = number * temp;
            System.out.println(result);
            temp++;
        }

        System.out.println("-----------------------------------------------------");
        int tempDoWhile = 1;
        do {
            int result = number * tempDoWhile;
            System.out.println(result);
            tempDoWhile++;
        }while (tempDoWhile <= 10);
    }
}
