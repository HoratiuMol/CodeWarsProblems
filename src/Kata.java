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
}
