public class Kata2 {
    public static int solve(String s){
        /*
        The vowel substrings in the word codewarriors are o,e,a,io.
         The longest of these has a length of 2. Given a lowercase string that has
         alphabetic characters only (both vowels and consonants) and no spaces,
         return the length of the longest vowel substring. Vowels are any of aeiou.

Good luck!
         */
        int a=0;
        int e=0;
        int o=0;
        int i=0;
        int u=0;
        int total=0;

        char[] cha=s.toCharArray();

        for(int j=0;j<cha.length;j++){

            String str=String.valueOf(cha[i]);

            if(str.matches("[a]")){
                a=a+1;
            }else if(String.valueOf(cha[i]).matches("e")){
                e=e+1;
            }else if(String.valueOf(cha[i]).matches("i")){
                i=i+1;
            }else if(String.valueOf(cha[i]).matches("o")){
                o=o+1;
            }
            else if(String.valueOf(cha[i]).matches("u")){
                u=u+1;
            }else{

            }

        }

        System.out.println("\na : " + a);
        System.out.println("\ne : " + e);
        System.out.println("\ni : " + i);
        System.out.println("\no : " + o);
        System.out.println("\nu : " + u);

        return 0;
    }
}
