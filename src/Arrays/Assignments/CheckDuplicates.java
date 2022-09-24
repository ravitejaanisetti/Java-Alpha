package Arrays.Assignments;


public class CheckDuplicates {
    public static boolean checkArray ( int numbers[]){
        boolean hasDuplicate = false;
        for(int i=0; i< numbers.length; i++){
            for(int j=i+1; j< numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    hasDuplicate = true;
                }
            }
        }
        return hasDuplicate;
    }
    public static void main(String[] args) {

        int numbers[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(checkArray(numbers));

    }
}
