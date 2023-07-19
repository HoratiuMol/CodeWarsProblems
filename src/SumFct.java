import java.math.BigInteger;
/*
The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that the sum of the perimeters of these squares

is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80

Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed in the same manner as in the drawing:

alternative text

Hint:
See Fibonacci sequence

Ref:
http://oeis.org/A000045

The function perimeter has for parameter n where n + 1 is the number of squares (they are numbered from 0 to n) and returns the total perimeter of all the squares.
perimeter(5)  should return 80
perimeter(7)  should return 216
 */
public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        // your code
        BigInteger per= new BigInteger("0");
        int m=6;
        int inicial=1;
        int segundo=1;
        int fin=0;
        for(int i=0;i<m;i++){

            fin=inicial +segundo;

            segundo=fin;
            inicial=segundo;


        }

        System.out.println(fin);
//4(1+1+2+3+5+8+13..); n=(n-1)+(n-2)
        //(1+1) cuenta como uno
        //  ergo si n=6 es (1+1+2+3+5+8+13)*4= x

        return n;
    }
}
