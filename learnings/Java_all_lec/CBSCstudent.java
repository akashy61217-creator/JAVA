package learnings.Java_all_lec;

public class CBSCstudent {
    private static int m;
    //Cbsc student result outof 5oo marks, with5 Subject.
    public static void main(String[] args) {
/*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of subject 1 :");
        int m1= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter marks of subject 2: ");
        int m2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter marks of subject 3:");
        int m3=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter marks of subject 4:");
        int m4=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter marks of subject 5:");
        int m5=sc.nextInt();
        sc.nextLine();


        //Add all subject number:
        int add= m1+m2+m3+m4+m5;
        float per = (add / 500f) * 100;
        System.out.println(m);


        //System.out.println("per"+ per);

         System.out.println("TotalMarks =" +add);
        System.out.println("TotalMarks = "+ per + "%");

        calculatePercentage(500,add);

 */
        calculatePercentage(1000,760);
        calculatePercentage(30,29);

        float result = calculatePercentage(250);
        System.out.println("percentage calculated from function with one parameter: "+ result);
        calculateArea();

    }

    public static void calculatePercentage(float totalMarks, int marksObtain){
        float percentage = (marksObtain/totalMarks)*100;
        System.out.println("Percentage calculated from function: "+ percentage+ m);

    }
    String s1, s2,s3,s4,s5,s6,s7;

    private static int calculateTotalMarksObtained(int m1 , int m2,int m3 ,int m4, int m5){
        int add = m1+m2+m3+m4+m5;
        return add;
    }

    public static float calculatePercentage(float totalMarks){
       // int add= m1+m2+m3+m4+m5;
        int marksObtained = calculateTotalMarksObtained(40, 30, 32, 45, 49);
        float per = (marksObtained / totalMarks) * 100;
        return per;
    }

    public static void calculateArea(){
        int r = 10;
        float area = 3.14f * r *r;
        System.out.println("Area of circle :"+ area);
    }

}
