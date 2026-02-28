package learnings.Java_all_lec;

public class Arrays_lecNo_26 {
    public static void main(String[] args) {
        //  Arrays >>> Collection of Similar types of data.
        //Index start >>>>>> 0 >>>>>>>>>>>>>n-1 size

       // String [] name=new String[6]; //>>>>>>>>>>>>>>>>>>>>>>>>>>>Declaration+ Allocation [No_01]

        String [] name; //>>>>>>>>>>>>>>>Declaration [No_02]
        name=new String[6]; // Allocation
        String surName[] = new String[6];
        name[0]="Karan";
        name[1]="akash";
        name[2]="rahul";
        name[3]="kanya ";
        name[4]="Himanshu";
        name[5]="Shivam";
        System.out.println(name[4]);

        // N0_3

        int[] num={100,20,30,40,50,60};
        System.out.println(num[2]);




    }
}
