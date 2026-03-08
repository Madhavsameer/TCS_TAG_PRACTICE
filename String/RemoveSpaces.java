import java.util.*;
public class RemoveSpaces {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        String str1="";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]==' ') {
                continue;
            }
            else{
                str1+=ch[i];
            }
        }

        System.out.println(str1);

    }
}
