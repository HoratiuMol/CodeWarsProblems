import java.text.DecimalFormat;
import java.util.Arrays;

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
        //MEGA OPTIMIZACION
        long total = n * 2;

        if (address % 2 == 0) {
            // Si la dirección es par, la dirección opuesta está en la posición impar.
            return total - address + 1;
        } else {
            // Si la dirección es impar, la dirección opuesta está en la posición par.
            return total - address + 1;
        }
    }
    /*
        //derecha
        long izq=1, drc=(n*2)+2, drcT=2,total=n*2;

        //izquierda
        long izq2=(2*n)+1, drc2=2, drcT2=2;

        //resultado
        long resultado=0;

        if(address%2==0) {

            for (long j = 1; drc2 <= address; j++) {

                izq2 = izq2 - 2;
                drc2 = drc2 + 2;
                drcT2 = drcT2 + 2;


            }
            resultado=izq2;
            System.out.println("izq ultimo es: " + izq2);
            System.out.println("derecha ultimo: " + total);
            System.out.println("La respuesta es: " + izq2);

            return resultado;

        } else if (address%2!=0) {

            for (long i = 1; izq <= address; i++) {

                izq = izq + 2;
                drc = drc - 2;
                drcT = drcT + 2;


            }
            resultado=drc;
            System.out.println("izq ultimo es: " + izq);
            System.out.println("derecha ultimo: " + total);
            System.out.println("La respuesta es: " + drc);

            return resultado;

        }else {
            return 0;
        }
    }*/


        public static String[] spacey(String[] array) {
            /*
            Kevin is noticing his space run out! Write a function that removes the spaces from the values and returns an array showing the space decreasing.
For example, running this function on the array ['i', 'have','no','space'] would produce ['i','ihave','ihaveno','ihavenospace']
             */
            String[] strN=new String[array.length];
            System.out.println(array);
            strN[0]=array[0];
            for(int i=1;i< array.length;i++){

                strN[i]=strN[i-1]+array[i];

            }
            System.out.println(Arrays.toString(strN));
            return strN;
        }

    public static double[][] getMatrixProduct(double[][] a, double[][] b) {

            /*
            In mathematics, a matrix (plural matrices) is a rectangular array of numbers. Matrices have many applications in programming,
             from performing transformations in 2D space to machine learning.

One of the most useful operations to perform on matrices is matrix multiplication, which takes a pair of matrices
and produces another matrix – known as the dot product. Multiplying matrices is very different to multiplying real numbers,
and follows its own set of rules.

Unlike multiplying real numbers, multiplying matrices is non-commutative: in other words, multiplying matrix a by matrix b
will not give the same result as multiplying matrix b by matrix a.

Additionally, not all pairs of matrix can be multiplied. For two matrices to be multipliable,
 the number of columns in matrix a must match the number of rows in matrix b.

There are many introductions to matrix multiplication online, including at Khan Academy,
 and in the classic MIT lecture series by Herbert Gross.

To complete this kata, write a function that takes two matrices - a and b - and returns
the dot product of those matrices. If the matrices cannot be multiplied, return null/None/Nothing
Each matrix will be represented by a two-dimensional list (a list of lists). Each inner list will contain one or more numbers, representing a row in the matrix.

For example, the following matrix:

|1 2|
|3 4|

Would be represented as:

[[1, 2], [3, 4]]

It can be assumed that all lists will be valid matrices, composed of lists
 with equal numbers of elements, and which contain only numbers. The
  numbers may include integers and/or decimal points.

             */
        int la=a.length;
        int lb=b.length;
        double[][] r = new double[a.length][a.length];
        System.out.println(la);
        System.out.println(lb);

        if (a.length >= b.length) {

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {

                    for (int k = 0; k < a[j].length; k++) {

                        r[i][j] += a[i][k] * b[k][j];

                    }//end k loop
                    System.out.println(r[i][j] + " ");
                }//end of j loop
                System.out.println();
            }
        }else{
            System.out.println("Matriz invalida");
            return null;
        }
        return r;
    }

}
