package Arrays;

public class SubArray {
    public static void getSubArrays(int numbers[]){
        int ts=0;
        for(int i=0; i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length;j++){
                int end =j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays "+ts);
    }
    public static void getMaxSumSubArray(int numbers[]){//brute force
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);

    }
    public static void main(String[] args) {
        int numbers []={1,-2,6,-1,3};
        getSubArrays(numbers);
        getMaxSumSubArray(numbers);

    }
}
