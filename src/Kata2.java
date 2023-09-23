import jdk.jshell.execution.Util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Kata2 {
    public static int solve(String s) {
        /*
        The vowel substrings in the word codewarriors are o,e,a,io.
         The longest of these has a length of 2. Given a lowercase string that has
         alphabetic characters only (both vowels and consonants) and no spaces,
         return the length of the longest vowel substring. Vowels are any of aeiou.

Good luck!
         */
        int substring1 = 1, substring2 = 0;

        char[] cha = s.toCharArray();
        int[] matriz = new int[cha.length];
        matriz[0] = 1;


        for (int j = 1; j < cha.length; j++) {

            if (String.valueOf(cha[j - 1]).matches("[a,e,i,o,u]") && String.valueOf(cha[j]).matches("[a,e,i,o,u]")) {
                substring1++;
            } else {
                substring1 = 1;
            }
            //System.out.println("\n sub:" + substring1 + "\n");
            matriz[j] = substring1;
        }

        int mayor = matriz[0];
        for (int k = 1; k < matriz.length; k++) {
            int medio, fin;
            medio = Integer.valueOf(matriz[k - 1]);
            fin = Integer.valueOf(matriz[k]);
            if (fin > mayor) {
                mayor = fin;
            }
            System.out.println(mayor);
        }

        System.out.println("\n Mayor final " + mayor);

        return mayor;
    }

    public static int[] solve2(int a, int b) {
        /*
        In this Kata, you will be given two positive integers a and b and your task will be to apply the following operations:

i) If a = 0 or b = 0, return [a,b]. Otherwise, go to step (ii);
ii) If a ≥ 2*b, set a = a - 2*b, and repeat step (i). Otherwise, go to step (iii);
iii) If b ≥ 2*a, set b = b - 2*a, and repeat step (i). Otherwise, return [a,b].
a and b will both be lower than 10E8.

More examples in tests cases. Good luck!

Please also try Simple time difference
         */

        /*int[] c= {a,b};
        int i=0;
        //&&(c[0]<2*b)&&(c[1]<2*a)
        while((c[0]!=0 && c[1]!=0)||((c[0]<2*b)&&(c[1]<2*a))){
            if(c[0]>=2*c[1]){
                int a1=c[0]-2*c[1];
                c[0]=a1;
            } else if ((c[1]>=2*c[0])) {
                int b1=c[1]-2*c[0];
                c[1]=b1;
            }else{
                System.out.println("salida bucle While \n");
                System.out.println(c[0]);
                System.out.println(c[1]);
                return c;
            }
            i++;
        }
        System.out.println("Nos ha tomado " + i + " ciclos\n");
        System.out.println(c[0]);
        System.out.println(c[1]);
        return  c;*/
//MEGAOPTIMIZACION POR CHATGPT: EXPLICACIÓN CHAT EN EL COMMIT
        int[] c = {a, b};

        while (c[0] > 0 && c[1] > 0) {
            if (c[0] >= 2 * c[1]) {
                c[0] %= 2 * c[1];
            } else if (c[1] >= 2 * c[0]) {
                c[1] %= 2 * c[0];
            } else {
                break;
            }
        }
        return c;
    }

    public static double[] tribonacci(double[] s, int n) {
        /*

        Well met with Fibonacci bigger brother, AKA Tribonacci.

As the name may already reveal, it works basically like a Fibonacci, but summing the last 3 (instead of 2) numbers of the sequence to
 generate the next. And, worse part of it, regrettably I won't get to hear non-native Italian speakers trying to pronounce it :(

So, if we are to start our Tribonacci sequence with [1, 1, 1] as a starting input (AKA signature), we have this sequence:

[1, 1 ,1, 3, 5, 9, 17, 31, ...]
But what if we started with [0, 0, 1] as a signature? As starting with [0, 1] instead of [1, 1] basically shifts the common Fibonacci
 sequence by once place, you may be tempted to think that we would get the same sequence shifted by 2 places, but that is not the case and we would get:

[0, 0, 1, 1, 2, 4, 7, 13, 24, ...]
Well, you may have guessed it by now, but to be clear: you need to create a fibonacci function that given a signature array/list
, returns the first n elements - signature included of the so seeded sequence.

Signature will always contain 3 numbers; n will always be a non-negative number; if n == 0, then return an empty array (except in C
return NULL) and be ready for anything else which is not clearly specified ;)

If you enjoyed this kata more advanced and generalized version of it can be found in the Xbonacci kata

[Personal thanks to Professor Jim Fowler on Coursera for his awesome classes that I really recommend to any math
 enthusiast and for showing me this mathematical curiosity too with his usual contagious passion :)]

         */
/*
        double[] a=new double[n];
        int sig;

        if(n<3 && n!=0) {
            for(int i=1;i<n;i++){
                a[i]=s[i-1]+s[i];
                System.out.println("n<3 : " + a[i] + "\n");
            }

        }else if(s.length>=2 && n!=0){
            for(int k=0;k<3;k++){
                a[k]=s[k];
            }
        }

        if(n>=3 && n!=0) {
            //tribonaci simple primero
            for (int i = 3; i < n; i++) {

                sig = (int) (a[i - 3] + a[i - 1] + a[i - 2]);
                a[i] = sig;
            }
            for (int j = 0; j <a.length; j++) {
                    System.out.println(a[j]);
            }

        }else if(n==0){
            System.out.println("0");
            return null;
        }

        return a;
    }*/

        double[] a = new double[n];
        double[] sig = new double[3];
        double[] arr=new double[0];

        if (n == 0) {
            System.out.println("0");
            return arr;
        }

        for (int i = 0; i < n; i++) {
            if (i < s.length) {
                a[i] = s[i];
                sig[i % 3] = s[i];
            } else {
                double next = sig[0] + sig[1] + sig[2];
                a[i] = next;
                sig[i % 3] = next;
            }
        }
        for (int j = 0; j <a.length; j++) {
            System.out.println(a[j]);
        }

        return a;
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int enBus=0;

        for(int i=0;i<stops.size();i++){
            int sube= stops.get(i)[0];
            int bajan=stops.get(i)[1];
            System.out.println(sube);
            enBus=enBus+sube-bajan;
            System.out.println(enBus);
        }
        return enBus;
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        /*
        Write a function named setAlarm/set_alarm/set-alarm/setalarm (depending on language) which receives two parameters.
        The first parameter, employed, is true whenever you are employed and the second parameter, vacation is true whenever you are on vacation.

The function should return true if you are employed and not on vacation (because these are the circumstances under which you need to set an alarm).
It should return false otherwise. Examples:

employed | vacation
true     | true     => false
true     | false    => true
false    | true     => false
false    | false    => false
         */

        if(employed==false){
            return false;
        } else if (employed==true && vacation==false){
            return true;
        }else {
            return false;
        }
    }


}
