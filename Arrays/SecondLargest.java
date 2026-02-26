public class SecondLargest{
    public static void main(String[] args) {

    int arr[]={17, 56, 7, 91, 90, 4, 33, 46};
    System.out.println("Second largest element in given array is: "+secondLargest(arr));
        
    }

    public static int secondLargest(int arr[]){
        int secondLargestNum=Integer.MIN_VALUE,largestNum=Integer.MIN_VALUE;


        for(int i=0; i<arr.length; i++){
            if(arr[i]>largestNum){
                largestNum=arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondLargestNum && arr[i]!=largestNum){
                secondLargestNum=arr[i];
            }
        }


        return secondLargestNum;

    }
}