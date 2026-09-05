package learnings.Exception;

public class Array_Exception {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        System.out.println(arr[6]);
        System.out.println("**********PROGRAM END***********");
        /*
        SHOW ERROR:
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
	at learnings.Exception.Array_Exception.main(Array_Exception.java:6)


         */


    }

}
