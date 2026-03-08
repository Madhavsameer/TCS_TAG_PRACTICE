public class AddingElements {

    public static void main(String[] args) {
        

        int arr[]= {2,5,6,1,7,0,4};

        int value=15;
        int index=3;

        for(int i=3; i<arr.length; i++){

            arr[i]=arr[i+1];
            

        }
    }
}