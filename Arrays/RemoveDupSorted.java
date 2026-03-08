import java.util.HashSet;

public class RemoveDupSorted {

    public static void main(String[] args) {
        
        int arr[]={1,3,5,7,7,7,9};

        HashSet <Integer> myset= new HashSet<>();
        for (int i : arr) {
            myset.add(i);
        }

        for (Integer integer : myset) {
            System.out.print(integer+" ");;
        }
            
        }
    }
