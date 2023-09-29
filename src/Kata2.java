import java.lang.reflect.Array;
import java.math.BigInteger;
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
        double[] arr = new double[0];

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
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }

        return a;
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int enBus = 0;

        for (int i = 0; i < stops.size(); i++) {
            int sube = stops.get(i)[0];
            int bajan = stops.get(i)[1];
            System.out.println(sube);
            enBus = enBus + sube - bajan;
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

        if (employed == false) {
            return false;
        } else if (employed == true && vacation == false) {
            return true;
        } else {
            return false;
        }
    }

    public static BigInteger finance(int n) {
            /*
            I need to save some money to buy a gift. I think I can do something like that:

First week (W0) I save nothing on Sunday, 1 on Monday, 2 on Tuesday... 6 on Saturday, second week (W1) 2 on Monday... 7
 on Saturday and so on according to the table below where the days are numbered from 0 to 6.

Can you tell me how much I will have for my gift on Saturday evening after I have saved 12? (Your function finance(6)
should return 168 which is the sum of the savings in the table).

Imagine now that we live on planet XY140Z-n where the days of the week are numbered from 0 to n (integer n > 0)
 and where I save from week number 0 to week number n included (in the table below n = 6).

How much money would I have at the end of my financing plan on planet XY140Z-n?
finance(5) --> 105
finance(6) --> 168
finance(7) --> 252
finance(5000) --> 62537505000

             */

        /*week has n days
        day one of next week I save +1 than the same day

--	Su	Mo	Tu	We	Th	Fr	Sa
W6							12
W5						10	11
W4					8	9	10
W3				6	7	8	9
W2			4	5	6	7	8
W1		2	3	4	5	6	7
W0	0	1	2	3	4	5	6

         */

        long ahorros = 0L;
        long calculoNivel;

        for (long i = 0L; i <= n; i++) {
            calculoNivel = 0;
            //recorremos las semanas
            for (long j = i * 2; j <= n + i; j++) {
                calculoNivel = calculoNivel + j;
            }
            // System.out.println("calculo semana " +i+ " : "+calculoNivel+"\n");
            ahorros = ahorros + calculoNivel;
            //System.out.println("nivel :"+i +"\n" +"Inicio nivel : "+i*2+"\n");
        }

        System.out.println("El calculo de los ahorros es: " + ahorros);
        return BigInteger.valueOf(ahorros);
    }

    public static int findIt(int[] a) {
        /*
        Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
         */
        int r = 0, n = 0;

        int resultado = 0;
        String[] mat = new String[a.length];
        ArrayList<int[]> arr = new ArrayList<>();
        int[] firstArr = {a[0], 0};
        arr.add(firstArr);

        //la pinta que tiene es
        // arr={{1,2},{1,2}}
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] != a[i]) {
                int[] a1 = {a[i], 0};
                arr.add(a1);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    int[] a2 = {a[i], +1};
                    arr.add(a2);
                }
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(Arrays.toString(arr.get(i)));
        }
       /*for(int i=0;i<mat.length;i++){
           System.out.println("["+mat[i]+"]\n");
       }
        System.out.println("se dan " + n +" numeros distintos\n");*/

        System.out.println("el número único es: " + resultado + " y el numero de repeticiones es " + r);
        return resultado;
    }

    public static boolean alphanumeric(String s) {

        /*
        In this example you have to validate if a user input string is alphanumeric. The given string is not nil/null/NULL/None, so you don't have to check that.

The string has the following conditions to be alphanumeric:

At least one character ("" is not valid)
Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
No whitespaces / underscore
         */
        if (s.isEmpty()) {
            System.out.println("Está vacio\n");
            return false;
        } else {
            char[] ch = s.toCharArray();
            int count = 0;
            for (int i = 0; i < ch.length; i++) {
                String a = String.valueOf(ch[i]);

                if (String.valueOf(ch[i]).matches("[A-Za-z0-9]+")) {
                    count++;
                    System.out.println(count + "\n");
                } else if (String.valueOf(ch[i]).trim().isEmpty() || String.valueOf(ch[i]) == null || String.valueOf(ch[i]).trim().matches("\"\"")) {
                    System.out.println("salimos comillas\n");
                    return false;
                } else {
                    System.out.println("hemos salido\n");
                    return false;
                }
            }
            System.out.println(s + "\n");

        }
        return true;
    }

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        /*
        Let us begin with an example:

A man has a rather old car being worth $2000. He saw a secondhand car being worth $8000. He wants to keep his old car until he can buy the secondhand one.

He thinks he can save $1000 each month but the prices of his old car and of the new one decrease of 1.5 percent per month.
Furthermore this percent of loss increases of 0.5 percent at the end of every two months. Our man finds it difficult to make all these calculations.

Can you help him?

How many months will it take him to save up enough money to buy the car he wants, and how much money will he have left over?

Parameters and return of function:

parameter (positive int or float, guaranteed) start_price_old (Old car price)
parameter (positive int or float, guaranteed) start_price_new (New car price)
parameter (positive int or float, guaranteed) saving_per_month
parameter (positive float or int, guaranteed) percent_loss_by_month

nbMonths(2000, 8000, 1000, 1.5) should return [6, 766] or (6, 766)
Detail of the above example:
end month 1: percent_loss 1.5 available -4910.0
end month 2: percent_loss 2.0 available -3791.7999...
end month 3: percent_loss 2.0 available -2675.964
end month 4: percent_loss 2.5 available -1534.06489...
end month 5: percent_loss 2.5 available -395.71327...
end month 6: percent_loss 3.0 available 766.158120825...
return [6, 766] or (6, 766)
where 6 is the number of months at the end of which he can buy the new car and 766 is the nearest integer to 766.158... (rounding 766.158 gives 766).

Note:

Selling, buying and saving are normally done at end of month. Calculations are processed at the end of each considered month but if,
by chance from the start, the value of the old car is bigger than the value of the new one or equal there is no saving to be made, no
need to wait so he can at the beginning of the month buy the new car:

nbMonths(12000, 8000, 1000, 1.5) should return [0, 4000]
nbMonths(8000, 8000, 1000, 1.5) should return [0, 0]
We don't take care of a deposit of savings in a bank:-)
         */


        //decreas 1,5% per month
        //+0,5% every 2 months

        double percentEvery2 = 0.5;
        int[] nbMonths2 = new int[10];
        double vOld = startPriceOld;
        double vNew = startPriceNew;
        double vMes = percentLossByMonth;
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                vMes = percentLossByMonth / 100;
            } else if (i % 2 == 0) {
                vMes = (percentLossByMonth + 0.5) / 100;
            }
            vOld = vOld - vOld * vMes;
            vNew = vNew - vNew * vMes;
            savingperMonth = 1000 * i;

            if (savingperMonth > vNew) {
                System.out.println("El ahorro final en el mes " + i + " es de " + savingperMonth + "\n");
                System.out.println("El precio de venta del coche final en el mes " + i + " es de " + vOld + "\n");
                System.out.println("El precio de compra del coche final en el mes " + i + " es de " + vNew + "\n");
                nbMonths2[i - 1] = i;
                for (int j = 0; j < nbMonths2.length; j++) {
                    System.out.println(nbMonths2[j]);
                }
                return nbMonths2;
            }
            System.out.println("Nuevo ahorro en mes " + i + " es de " + savingperMonth + "\n");
            System.out.println("El precio de venta del coche en el mes " + i + " es de " + vOld + "\n");
            System.out.println("El precio de compra del coche en el mes " + i + " es de " + vNew + "\n");
            nbMonths2[i] = i;
        }

        return nbMonths2;
    }

    public static int solve3(String s) {
        int longitud=s.length();
        System.out.println("la longitud es de " + longitud);
        char[] cha = s.toCharArray();
        int mayor = 0;
        int[] arr = new int[longitud];

        for (int i =0; i <cha.length; i++) {
            if (String.valueOf(cha[i]).matches("[0-9]")){
               String a = String.valueOf(cha[i]);
                int j=i+1;
                while(String.valueOf(cha[j]).matches("[0-9]") && j<=cha.length) {
                        a = a + String.valueOf(cha[j]);
                        j++;
                }
                i = j-1;
                arr[i] = Integer.parseInt(a);
            }
                System.out.println("numero : " + arr[i] + "\n");
        }

            mayor = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > mayor) {
                    mayor = arr[j];
                }
            }

            System.out.println("El numero mayor es: " + mayor + "\n");
        return mayor;
        }

    }

