public class Circle {
    /*Complete the function which will return the area of a circle with the given radius.

Returned value is expected to be accurate up to tolerance of 0.01.

If the radius is not positive, throw IllegalArgumentException.

     */

    public static double area(double radius) {
        double radio=0;
        if(radius<0){
            throw new IllegalArgumentException();
        } else if (radius==0) {
            throw new IllegalArgumentException();
        }else if (radius>0){
            radio=Math.PI*radius*radius;
            System.out.println(radio);
            return radio;
        }
        return radio;
    }
}
