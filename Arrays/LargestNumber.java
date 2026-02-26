public class LargestNumber {
    public static void main(String[] args) {
        
        int arr[]={17, 56, 7, 91, 90, 4, 33, 46};
        System.out.println("Largest number in the given array is: "+largest(arr));

    }

     public static int largest(int arr[]){
        int largestNum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largestNum){
                largestNum=arr[i];
            }

        }

        return largestNum;





    }

}
