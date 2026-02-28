package learnings.Java_all_lec;


public class For_loopUsing_lec_no23 {
    //Write a program to find odd number
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            //for(int i=1; i<=100; i+=2)
           // if(i%2==0)//find even number.
            // if(i%2 !=0) //-->find odd number.
            System.out.println("odd number:");
            System.out.println(2*i+1); //odd number 2n+1
            System.out.println("Even number:");
            System.out.println(2*i);// Even number
        }
        for(int i=10;i>0;i--){
            System.out.println(i);
            
        }
    }
}
