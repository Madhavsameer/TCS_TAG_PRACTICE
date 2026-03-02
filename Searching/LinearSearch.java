public class LinearSearch {
    public static void main(String[] args) {

        int arr[]={12,4,6,90,7,9,1};
        Search(arr,90);
        
    }

    public static void Search(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("Target element "+target +" found at index "+i);
                
            }
        }
    }
}
