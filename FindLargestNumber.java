package learnings;

public class FindLargestNumber {
    public static void main(String[] args) {
        int[]arr={10,20,30,52,25,20,56,86};
        int max=arr[0];
        for(int x:arr){
            if(x>max){
                max=x;

            }
        }
        System.out.println("FindLargestNumber>>>>>>" + max);

        int min=arr[0];
        for (int x:arr){
            if(x<min){
                min=x;
            }
        }
        System.out.println("FindSmallestNumber>>>>>" + min);

    }
}
