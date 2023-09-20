public class Kata2 {
    public static int solve(String s){
        /*
        The vowel substrings in the word codewarriors are o,e,a,io.
         The longest of these has a length of 2. Given a lowercase string that has
         alphabetic characters only (both vowels and consonants) and no spaces,
         return the length of the longest vowel substring. Vowels are any of aeiou.

Good luck!
         */
        int substring1=1,substring2=0;

        char[] cha=s.toCharArray();
        int[] matriz = new int[cha.length];
        matriz[0]=1;


        for(int j=1;j<cha.length;j++){

            if(String.valueOf(cha[j-1]).matches("[a,e,i,o,u]") && String.valueOf(cha[j]).matches("[a,e,i,o,u]")){
                substring1++;
            }else{
                substring1=1;
            }
            //System.out.println("\n sub:" + substring1 + "\n");
            matriz[j]=substring1;
        }

        int mayor=matriz[0];
        for(int k=1;k<matriz.length;k++){
            int medio,fin;
            medio=Integer.valueOf(matriz[k-1]);
            fin=Integer.valueOf(matriz[k]);
            if(fin>mayor){
                mayor=fin;
            }
            System.out.println(mayor);
        }

        System.out.println("\n Mayor final " +mayor);

        return mayor;
    }
}
