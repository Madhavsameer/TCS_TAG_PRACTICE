public class RotateArray {
    public static void main(String[] args) {
        int arr[]={23,6,17,9,20,4,91};
        leftRotate(arr,3);
        
    }


    public static void reverse(int arr[],int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
        
    }


    public static void leftRotate(int arr[],int k){
        reverse(arr,0,k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
