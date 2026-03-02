public class PallindromString {

    public static void main(String[] args) {


        String str="madm";
        System.out.println(pallCheck(str));
        
    }

    public static boolean pallCheck(String str){
        int start=0;
        int end=str.length()-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}