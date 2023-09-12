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
}
