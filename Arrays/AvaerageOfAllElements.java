import java.util.Scanner;

public class AvaerageOfAllElements {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the Elements of the array: ");
            arr[i]=sc.nextInt();
            sum+=arr[i];2
            
        }
        System.out.println("Average is "+sum/n);
    }
}
