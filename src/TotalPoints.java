import java.util.Arrays;

public class TotalPoints {
    /*
    Our football team has finished the championship.

Our team's match results are recorded in a collection of strings.
Each match is represented by a string in the format "x:y", where x is our team's score and y is our opponents score.

For example: ["3:1", "2:2", "0:1", ...]

Points are awarded for each match as follows:

if x > y: 3 points (win)
if x < y: 0 points (loss)
if x = y: 1 point (tie)
We need to write a function that takes this collection
and returns the number of points our team (x) got in the championship by the rules given above.

Notes:

our team always plays 10 matches in the championship
0 <= x <= 4
0 <= y <= 4

     */
    public static int points(String[] games) {
        String resultado,unoFor, dosFor;
        int uno, dos,total=0;

        for(int i=0;i< games.length;i++){
            resultado=games[i];

            String[] number=resultado.split(":");
            System.out.println(resultado);

                uno= Integer.parseInt(number[0]);
                dos=Integer.parseInt(number[1]);

                if(uno>dos){
                    total=total+3;
                }else if(uno<dos){
                    total=total+0;
                }else {
                    total=total+1;
                }

               System.out.println(number[0] + number[1]);

        }

        //System.out.println("Total is: " + total);
        return total;
    }
}
