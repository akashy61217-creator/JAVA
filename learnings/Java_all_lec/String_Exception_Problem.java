package learnings.Exception;

public class String_Exception_Problem {
    public static void main(String[] args){
        String name=null;
        System.out.println(name.length());
        System.out.println("************PROGRAM END**********");
        /*
        SHOW ERROR:
        xception in thread "main" java.lang.NullPointerException
	at learnings.Exception.String_Exception_Problem.main(String_Exception_Problem.java:6)
         */
    }
}
