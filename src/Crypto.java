public class Crypto {
    /*In cryptanalysis, words patterns can be a useful tool in cracking simple ciphers.

A word pattern is a description of the patterns of letters occurring in a word
where each letter is given an integer code in order of appearance.

So the first letter is given the code 0, and second is then assigned 1 if it is
different to the first letter or 0 otherwise, and so on.

As an example, the word "hello" would become "0.1.2.2.3".

 For this task case-sensitivity is ignored, so "hello", "helLo" and "heLlo" will all return the same word pattern.

Your task is to return the word pattern for a given word.
All words provided will be non-empty strings of alphabetic
characters only, i.e. matching the regex "[a-zA-Z]+".
*/


    public static String wordPattern(final String word) {
        String medio = null, fin = "0";
        char[] cha = word.toCharArray();
        System.out.println(cha);
        String[] str = new String[word.length()];
        str[0] = "0";

        System.out.println(Integer.parseInt((str[0])));
        System.out.println("comienza bucle");

        for (int i = 1; i < cha.length; i++) {


            System.out.println("\nBucle si igual");

            if(cha[i-1]==cha[i]) {

                int entre = Integer.parseInt(String.valueOf(str[i-1]));
                str[i] = String.valueOf(str[i - 1]) + entre;
                System.out.println(str[i]);

                System.out.println("\nFin Bucle si igual");

            }else if(cha[i-1]!=cha[i]){

                System.out.println("\nBucle si Distinto");

                System.out.println("srt-1 " + str[i-1]);
                System.out.println("str 1 " + str[i]);
                String temp=str[i-1];
                System.out.println("temp" + temp);

                int entre = Integer.parseInt(temp);
                int dos=entre+1;

                System.out.println("dos" + dos);
                str[i] = str[i - 1] + String.valueOf(dos);
                System.out.println(str[i]);

                System.out.println("\nFin bucle distinto");
            }else{
                continue;
            }

        }
        for(int j=0;j< str.length;j++){
            System.out.println("str final j" + str[j]);
        }

        return fin;
    }
}
