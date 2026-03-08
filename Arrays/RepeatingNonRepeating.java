import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RepeatingNonRepeating {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();

        int arr[]= new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        HashMap <Integer, Integer> myMap= new HashMap<>();
        int freq=1;
        HashSet <Integer> Repeated= new HashSet<>();
        HashSet <Integer> NonRepeated= new HashSet<>();

        for(int i=0; i<arr.length; i++){

            if(myMap.containsKey(arr[i])){
                freq++;
                myMap.put(arr[i], freq);
                Repeated.add(arr[i]);
                
            }

            else{
                myMap.put(arr[i], freq);
                NonRepeated.add(arr[i]);

            }
        }
        System.out.println("Repeated elements are: "+Repeated);
        System.out.println("Non Repeated Elements are: "+NonRepeated);

        

        

        

       
    }
}
