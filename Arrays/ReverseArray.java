public class ReverseArray {
    public static void main(String[] args) {
        
        int arr[]={17, 56, 7, 91, 90, 4, 33, 46};
        reverse(arr);



    }

    public static void reverse(int arr[]){
        int temp=0;
        int end=arr.length-1;
        for(int i=0; i<arr.length/2; i++){
            temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            end--;

        }

        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
