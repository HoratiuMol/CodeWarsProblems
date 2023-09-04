public class ZywOo {

    public static String warnTheSheep(String[] array) {
        //Your code)))
        String respuesta;
        for(int i=0;i<array.length;i++){
            if(array[i]=="wolf" && i<array.length-1){
                respuesta="Oi! Sheep number "+(array.length-i-1)+"! You are about to be eaten by a wolf!";
                System.out.println(respuesta);
                return "Oi! Sheep number "+(array.length-i-1)+"! You are about to be eaten by a wolf!";


            } else if (array[i]=="wolf" && i==array.length-1) {
                respuesta="Pls go away and stop eating my sheep";
                System.out.println(respuesta);
                return "Pls go away and stop eating my sheep";

            }
        }
        System.out.println("\nWolf not found");
        return "Wolf not found";
    }

}