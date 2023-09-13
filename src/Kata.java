import jdk.nashorn.api.tree.FunctionDeclarationTree;

import java.text.DecimalFormat;

public class Kata {
    /*Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 1^2+2^2+2^2=9


     */
    public static int squareSum(int[] n)
    {int result=0,cua;
        for(int i=0;i<n.length;i++){
            cua=n[i]*n[i];
            result=result+cua;

        }
        System.out.println(result);
        return result;//Your Code
    }
    public static String numberToString(int num) {
        // Return a string of the number here!
        return String.valueOf(num);
    }

    public static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) {
        //opcion 1: area 1 triángulo por N triángulos
        double ladoEqui,areaT, areaTotal,ladoequiDF,areaTDF;
        DecimalFormat df= new DecimalFormat("####.###");
//(nr2/2) sin (2π/n) square units.
        double sen;
        sen=Math.sin(2*Math.PI/numberOfSides);
        double sup;


        sup=((numberOfSides*(circleRadius*circleRadius))/2)*sen;
        System.out.println("seno :" + sen);
        System.out.println("superficie :"+ sup);
        df.format(sup);
        System.out.println("superfi :" + df.format(sup));
        //S=(1/2)*N*r^2*sen(360/N)

        return Double.parseDouble(df.format(sup));

    }

    public static double find_average(int[] array){
        double pro=0,proM=0;

        for(int i=0;i<array.length;i++){
            pro=pro + array[i];
        }
        proM=pro/array.length;

        System.out.println(proM);
        return proM;

    }
    /*Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

For example,

[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
The correct answer would be 17.

Hint: Don't forget to check for bad values like null/undefined

     */

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int nSheeps=0;
        Boolean b=new Boolean(true);
        boolean value=b.booleanValue();

       for(int i=0; i<arrayOfSheeps.length;i++){
           if(arrayOfSheeps[i]==Boolean.TRUE && arrayOfSheeps[i]!=null){
               nSheeps++;
           }else {
               continue;
           }
       }
        System.out.println(nSheeps);
        return nSheeps;
    }

    public static String accum(String s) {
        /*
        This time no story, no theory. The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
         */

        String fin="a";
        String medio;
        char[] cha=s.toCharArray();
        for(int i=0;i<cha.length;i++){
            if(i==0){
                fin=String.valueOf(cha[i]).toUpperCase();

            }else{
                for(int j=0;j<=i;j++){
                    if(j==0){
                        fin=fin+"-"+ String.valueOf(cha[i]).toUpperCase();
                    }else{
                        fin=fin+String.valueOf(cha[i]).toLowerCase();
                    }
                }
            }
            //System.out.println(cha[i]);
        }
        System.out.println(fin);
        return fin;

    }
    public static String getMiddle(String word) {
        /*
        You are going to be given a word. Your job is to return the middle character of the word.
         If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

#Examples:

Kata.getMiddle("test") should return "es"

Kata.getMiddle("testing") should return "t"

Kata.getMiddle("middle") should return "dd"

Kata.getMiddle("A") should return "A"
#Input

A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000
in some test cases due to an error in the test cases). You do not need to test for this.
 This is only here to tell you that you do not need to worry about your solution timing out.

#Output

The middle character(s) of the word represented as a string.
         */

        int n=word.length();
        String res="1";
        System.out.println(n);

        char[] cha=word.toCharArray();
        if(n%2!=0){
            res= String.valueOf(cha[(n/2)]);
        } else if (n%2==0) {

            res=String.valueOf(cha[(n/2)-1]) + String.valueOf(cha[(n/2)]) ;

        }
        System.out.println(res);
    return res;
    }

    public static String bmi(double weight, double height) {
        /*
        Write function bmi that calculates body mass index (bmi = weight / height2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
         */
        double bmi;
        String bmiS="a";

        bmi=(weight/(height*height));
        System.out.println(bmi);
        if(bmi<=18.5){
            bmiS="Underweight";
        } else if (bmi<=25.0) {
            bmiS="Normal";
        } else if (bmi<=30.0) {
            bmiS="Overweight";
        }else {
            bmiS="Obese";
        }

        return bmiS;
    }
    public static long overTheRoad(long address, long n) {
        /*
        Task
You've just moved into a perfectly straight s
treet with exactly n identical houses on either side of the road.
 Naturally, you would like to find out the house number of the people on the other side of the street.
 The street looks something like this:

Street
1|   |6
3|   |4
5|   |2
  you

Evens increase on the right; odds decrease on the left. House numbers start at 1 and increase without gaps. When n = 3, 1 is opposite 6, 3 opposite 4, and 5 opposite 2.
         Example (address, n --> output)
Given your house number address and length of street n, give the house number on the opposite side of the street.

1, 3 --> 6
3, 3 --> 4
2, 3 --> 5
3, 5 --> 8
Note about errors
If you are timing out, running out of memory, or get any kind of "error", read on.
Both n and address could get upto 500 billion with over 200 random tests. If you try to store the addresses of 500
billion houses in a list then you will run out of memory and the tests will crash.
This is not a kata problem so please don't post an issue. Similarly if the tests don't complete
 within 12 seconds then you also fail.

To solve this, you need to think of a way to do the kata without making massive lists or huge for loops. Read the discourse for some inspiration :)

         */
        long izq=1, drc=n*2, drcT=2,total=n*2;
        long fin=2;

        for(int i=1;i<address;i++){

            izq=izq+2;
            drc=drc-2;
            drcT=drcT+2;


        }


        System.out.println("izq último es: " + izq);
        System.out.println("derecha ultimo: " + total);
        System.out.println("drc primero es: " + drc);


        return drc;
    }

}
