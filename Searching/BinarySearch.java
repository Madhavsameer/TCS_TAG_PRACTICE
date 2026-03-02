class BinarySearch{
    public static void main(String []args){

        int arr[]={13,21,27,45,80,97};
        bs(arr,80);





    }

    public static void bs(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("Target Element "+target+" found at index "+ mid);
                return;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
        }
        System.out.println("Target Element not found...");

    }
}