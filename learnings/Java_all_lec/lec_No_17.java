package learnings.Java_all_lec;

public class lec_No_17 {
    public static void main(String[] args) {
        //Logical Operator = And Operater (&&)
        //jab boolean value true ho  to hi  && Operater true value  dega.
        System.out.println("******************for LOgical And**********************");
        boolean a=true;
        boolean b=true;
        boolean c=true; //c=false use >>>>>>false output
        if(a&&b&&c){
            System.out.println("Print value is true:");
        }else {
            System.out.println("print value is false:");
        }
        if(a||b){
            System.out.println("Print value is true:");
        }else {
            System.out.println("print value is false:");
        }
        if(a!=b){
            System.out.println("print value is false");
        }else {
            System.out.println("print value is true:");
        }


    }
}
