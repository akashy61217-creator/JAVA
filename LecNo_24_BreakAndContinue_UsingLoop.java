package learnings.Java_all_lec;

public class LecNo_24_BreakAndContinue_UsingLoop {
    public static void main(String[] args) {
        //Break and continue using Loops!
//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//            System.out.println("Java is great!");
//            if(i==2){
//                System.out.println("Exit the loop");
//
//            }
//        }
//        int i=0;
//        while(i<=10){
//            System.out.println(i);
//            System.out.println("java is geeat:");
//            i++;
//            if(i==6){
//                System.out.println("Exit the loop");
//                break;
//            }
//        }
        int age=1;
        do{
            System.out.println(age);
            System.out.println("java is great");
            age++;
            if(age==10){
                System.out.println("Stop using loop!");
                break;
            }
        }while(age>10);
        System.out.println("Ends loops here:");



    }
}
