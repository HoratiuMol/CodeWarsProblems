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
}
