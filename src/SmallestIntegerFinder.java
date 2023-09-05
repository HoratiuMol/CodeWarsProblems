public class SmallestIntegerFinder {
    /*Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.*/
    public static int findSmallestInt(int[] args) {
        int min=args[0],uno,dos;


        for(int i=1;i<args.length;i++){
//PROBLEMA, SOLO MEMORIZA LOS ÚLTIMOS DOS ESTUDIADOS
            //probar con un for anidado
            int medio=0;
            uno=args[i-1];
             // dos =args[1]
        for(int j=0;j< args.length;j++) {
             //es decir uno=args[0]
            dos=args[j];

            if (uno <= dos) {
                medio = uno;
            } else {
                medio = dos;
            }
        }
        if(min<=medio){
            min=min+0;
        }else{
            min=medio;
        }
    }

        System.out.println(min);
        return min;
    }
}