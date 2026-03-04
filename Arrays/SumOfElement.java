public class SumOfElement {

    public static void main(String[] args) {
        int arr[]={12,5,6,8,1,3,9};
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of eleement of the given array is:  "+sum);
    }
}