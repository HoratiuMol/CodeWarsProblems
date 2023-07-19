import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UnflattenAList_Easy {
    static Object[] unflatten(int[] flatArray) {
        var list = new ArrayList<>();
        for (int i = 0; i < flatArray.length; ) {
            if (flatArray[i] < 3) {
                list.add(flatArray[i++]);
            } else {
                list.add(Arrays.copyOfRange(flatArray, i, Math.min(i += flatArray[i], flatArray.length)));
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
        return list.toArray();
    }
}
