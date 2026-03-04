
public class CountVowelConsonantSpace {

    public static void main(String[] args) {

        
        
        int res[]=count("Kya betp jii");
        System.out.println("The number of vowels are "+res[0]);
        System.out.println("The number of consonants are "+res[1]);
        System.out.println("The number of spaces are "+res[2]);


    }

    public static int[] count(String str){
        char ch[]=str.toCharArray();
        int vowelcounter=0;
        int spacecounter=0;
        int consonantCounter=0;
        for (char c : ch) {
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                vowelcounter++;    
            }
            else if(c==' '){
                spacecounter++;
            }
            else{
                consonantCounter++;
            }
        }
        return new int[]{vowelcounter,consonantCounter,spacecounter};
    }



    
}