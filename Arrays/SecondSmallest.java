public class SecondSmallest {
    public static void main(String[] args) {

    int arr[]={17, 56, 7, 91, 90, 4, 33, 46};
    System.out.println("Second smallest element in given array is: "+secondSmallestNumber(arr));
        

    }

    public static int secondSmallestNumber(int arr[]){

        int smallestNum=Integer.MAX_VALUE, secondSmallestNum=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){

            if(arr[i]<smallestNum){
                smallestNum=arr[i];
                
            }
            
        }
       

        for(int i=0; i<arr.length; i++){

            if(arr[i]<secondSmallestNum && arr[i]!=smallestNum){
                secondSmallestNum=arr[i];
            }
        }
        

        return secondSmallestNum;

    }


}
