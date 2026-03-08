import java.util.*;
public class CrypticNumber {

    public static void main(String[] args) {
        
        System.out.println(cryptic(10, 70));
    }

    public static ArrayList <Integer> cryptic(int start, int end){

        ArrayList <Integer> mylist= new ArrayList<>();
        for(int i=start; i<=end; i++){
            if(i%7==0 && i%5!=0 && pall(i) ){


                mylist.add(i);
            }

        }


        

        return mylist;
    }

    public static boolean pall(int i){
        ArrayList <Integer> mylist2= new ArrayList<>();
        int rev=0;
        int num=i;
        while(i>0){
            int unit=i%10;
            if(mylist2.contains(unit)){
                return false;
            }
            else{
                mylist2.add(unit);
            }
            i/=10;
            rev=rev*10+unit;



            
        }

        if (rev==num) {
            return false;
            
        }

        return true;

    }
}