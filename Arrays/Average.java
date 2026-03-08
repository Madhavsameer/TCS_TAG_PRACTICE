public class Average{
    public static void main(String [] args){

        int arr[]={2,5,6,7,9};
        System.out.println("Average of all these elements is "+averagearray(arr));



    }

    public static float averagearray(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){

            sum+=arr[i];


        }

        return sum/arr.length;
    }
}