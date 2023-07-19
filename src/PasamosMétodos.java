import java.math.BigInteger;

public class PasamosMétodos extends BouncingBall{
   /* public static void main(String[] args) {
        int [] flatArray= new int[]{1, 2, 3, 5, 4, 2, 4, 3, 6};
        unflatten(flatArray);
    }
    Hecho
    */

   /* public static void main(String[] args) {
        //int [] passArray =new int[]{1,4,5,2,4,5,6,23,6,6,7,4,10};
        int [] passArray =new int[]{2,2,3};
        twoSum(passArray,4);
    }*/

    /*public static void main(String[] args) {
        BouncingBall(40,0.9);
    }*/

    public static void main(String[] args){

        int m=5;
        int inicial=1;
        int parcial=1;
        int fin=0;
        int suma=1;
        int perimetro;

        for(int i=0;i<m;i++){
            //System.out.println("\nBucle " + (i+1));
          fin=parcial + inicial;
            //System.out.println(fin);
          inicial=parcial;
            //System.out.println(inicial);
          parcial=fin;
           // System.out.println(parcial);
            //System.out.println("Fin bucle " + (i+1));

            //System.out.println("\nsuma " + (i+1));

            suma=suma+inicial;

            //System.out.println(suma);
        }

        perimetro=suma*4;
        System.out.println("\nSuma : " + suma);
        System.out.println("\nPerimetro : " + perimetro);
//4(1+1+2+3+5+8+13..); 1n + 1n + [n+n]"2n" + [(n+n)+n]"3n" + [((n+n)+n)+(n+n)]"5n" + {[((n+n)+n)+(n+n)]+[(n+n)+n]}"8n"
        //              0   1     2             3                   4                             5
        //(1+1) cuenta como uno
        //  ergo si n=6 es (1+1+2+3+5+8+13)*4= x

    }

}
