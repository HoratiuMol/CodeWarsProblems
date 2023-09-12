import java.math.BigInteger;
import java.sql.Array;

public class PasamosMétodos extends Kata{

    public static void main(String[] args) {
        Boolean [] array={true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true,
                false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};

        countSheeps(array);
    }


}
