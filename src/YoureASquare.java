import static java.lang.Math.*;

public class YoureASquare {
    public static boolean isSquare(int n) {

        double d = sqrt(n);
        System.out.println(sqrt(n));
        //return sqrt(n)%2==0; esto revisa si es par
        return sqrt(n)%1==0; //esto mira que sea enterO!!
    }
}
