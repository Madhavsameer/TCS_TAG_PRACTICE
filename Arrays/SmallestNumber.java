class SmallestNumber{

    public static void main(String [] args){
        int arr[]={17, 56, 7, 91, 90, 4, 33, 46};
        System.out.println("Smallest number in the given array is: "+smallest(arr));


    }

    public static int smallest(int arr[]){
        int smallestNum=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallestNum){
                smallestNum=arr[i];
            }

        }

        return smallestNum;





    }
}