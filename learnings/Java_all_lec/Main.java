import javax.naming.Name;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //int num1=20, num=30;
        Scanner obj = new Scanner(System.in);

       System.out.println("Enter Your Name: ");
        String name = obj.nextLine();

        System.out.println("Enter your Age: ");
        int age =obj.nextInt();

        System.out.println("Enter Your Father Name:");
        String fatherName =obj.next();

        System.out.println("Enter your Father Age:");
        int fatherAge = obj.nextInt();

        for (int i = 1; i <= 10; i++) {




        }



        System.out.println("---------------Below aare your details------------------");
        System.out.println("My Name is "+name + " and my age is: "+ age);

        System.out.println("My age:"+age);

        System.out.println("----------------------------------Massage After filling Fathers details-------------------------------");

        System.out.println("My fathers Name:" + name);
        System.out.println("My father Age:" +fatherAge);




/*
        int pwd = obj.nextInt();

        if (pwd == 1234) {
            System.out.println("My Name : Akash");
            System.out.println("My Age  : 22");
            System.out.println("My Contact : 8856046810");
        }
        else {
            System.out.println("Wrong Password ❌");
        }
 */
    }
}
