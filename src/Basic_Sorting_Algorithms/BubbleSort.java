package Basic_Sorting_Algorithms;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn< arr.length-1; turn++){
            for(int j=0; j< arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1 ]
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};

    }
}
