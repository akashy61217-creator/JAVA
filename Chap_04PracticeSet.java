package learnings.Java_all_lec;

public class Chap_04PracticeSet {
    public static void main(String[] args) {
        /* Write a program to print the Following pattern
        ****  4
        ***  3
        **  2
        * 1
         */
        int n=4;
        for(int i=n; i>0;i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        //Write a program to sum first n even numbers using while loop
        int sum=0;
        int n1 =3;//3even number
        while(sum<=n1){
            sum=sum+( 2*sum); //Even Number 
            sum++;
            System.out.println(sum); //0,2,4
        }


    }
}
