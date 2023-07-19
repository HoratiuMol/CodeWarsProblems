import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

    /*
    Write a function that takes an array of numbers (integers for the tests) and a target number.
     It should find two different items in the array that, when added together, give the target value.
     The indices of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).
     For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
     The input will always be valid (numbers will be an array of length 2 or greater, and all the items will be numbers;
      target will always be the sum of two different items from that array).
    Based on: http://oj.leetcode.com/problems/two-sum/

    EX: two_sum([1, 2, 3], 4) == {0, 2}

    */
    public static int[] twoSum(int[] numbers, int target) {
        int suma=0;
        int[] resultado = new int[2];
       List lista= new ArrayList<>();
        System.out.println(Arrays.toString(numbers));
        for(int i=0;i<numbers.length;) {
            if (i == numbers.length) {
                break;
            }else{
                for(int j=i+1;j<numbers.length;j++) {

                    if(numbers[i] + numbers[j] == target) {
                        //"==" porque es una operación true/false
                        //lista.add(numbers[i],numbers[j]);
                        resultado[0] = i;
                        resultado[1] = j;
                        i++;
                        System.out.println("\nEXITO");
                        System.out.println("lista = " + lista);

                        System.out.println("resultado = " + Arrays.toString(resultado));
                        return resultado;
                    }

                }
            }
            i++;
        }
        System.out.println("\nResultado Fallido:");
        System.out.println("lista = " + lista);
        System.out.println("resultado = " + Arrays.toString(resultado));

        return resultado; // Do your magic!
    }
}