package learnings;

public class CalculateSumOfAllElements {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50,30};
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        System.out.println("CalculateSumOfAllElements:" + sum);
    }
}
