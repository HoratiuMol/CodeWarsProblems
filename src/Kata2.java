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

    public static int [] solve2(int a, int b){
        /*
        In this Kata, you will be given two positive integers a and b and your task will be to apply the following operations:

i) If a = 0 or b = 0, return [a,b]. Otherwise, go to step (ii);
ii) If a ≥ 2*b, set a = a - 2*b, and repeat step (i). Otherwise, go to step (iii);
iii) If b ≥ 2*a, set b = b - 2*a, and repeat step (i). Otherwise, return [a,b].
a and b will both be lower than 10E8.

More examples in tests cases. Good luck!

Please also try Simple time difference
         */

        int[] c= {a,b};
        int i=0;
        //&&(c[0]<2*b)&&(c[1]<2*a)
        while(c[0]!=0 && c[1]!=0){
            if(c[0]>=2*c[1]){
                int a1=c[0]-2*c[1];
                c[0]=a1;
            } else if ((c[1]>=2*c[0])) {
                int b1=c[1]-2*c[0];
                c[1]=b1;
            }
            i++;
        }
        System.out.println("Nos ha tomado " + i + " ciclos\n");
        System.out.println(c[0]);
        System.out.println(c[1]);
        return  c;

    }
}
