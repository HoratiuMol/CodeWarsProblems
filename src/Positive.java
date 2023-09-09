public class Positive {
    /*You get an array of numbers, return the sum of all of the positives ones.

    Example [1,-4,7,12] => 1 + 7 + 12 = 20

    Note: if there is nothing to sum, the sum is default to 0.*/


    public static int sum(int[] arr){
        int suma=0;
        if(arr.length==0){
            suma=0;
            return 0;
        }else {
            for(int i=0;i< arr.length;i++){
                if(arr[i]>0){
                    suma=suma+arr[i];
                }
            }
        }
        System.out.println(suma);
        return suma;
    }
}
