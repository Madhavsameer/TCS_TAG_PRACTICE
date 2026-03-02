import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        System.out.println(PallCheck(number));


    }

    public static boolean PallCheck(int num){

        int originalNum=num;

        int revnum=0;
        while(num>0){
            int unit=num%10;
            num/=10;
            revnum=revnum*10+unit;


        }
        if(revnum==originalNum) return true;
        else return false;
    }
}
