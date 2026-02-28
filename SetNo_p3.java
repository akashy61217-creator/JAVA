package learnings.Java_all_lec;

import java.util.Locale;

public class SetNo_p3 {
    public static void main(String[] args) {


    //Write a java program to convert a string to lowercase.
    String name="Akash Yadav";
    String lowerCasename2 =name.toLowerCase();
        System.out.println(lowerCasename2);

        //Write  a java program to  replace spaces with underscores.

//       String name3="Lords universal collage";
//       name3=name3.replace(" ", "_");
//        System.out.println(name3);

        //Write  a java program to fill in a letter template  -which looks like below:
          // letter ="dear<<|name|> , Trans a lot"
       // Replace <|name|> with a string( same name)
         String letter="Dear <|name|> , Thanks  a lost!";
         String name5= letter.replace("<|name|>" ,"Akash Yadav");
        System.out.println(name5);


//        problem no_04
         String name6=" To find   double and  triple Space ";
        System.out.println(name6.indexOf(""));
        System.out.println(name6.indexOf("  "));


//    Problem no_05
        String myname="Dear Friend,\n" +
                "\n" +
                "I hope you are doing well. I just wanted to write a short letter to say hello and ask how everything is going.\t,\n I have been busy with my studies, but I am doing fine.\n I hope we can meet soon and spend some time together.\n" +
                "\n" +
                "Take care and write back soon.\n" +
                "\n" +
                "Yours sincerely,\n" +
                "[Ydav Akash]\n";
        System.out.println(myname);
























}}
