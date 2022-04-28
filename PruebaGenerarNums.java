import edu.princeton.cs.algs4.*;
import java.util.Random;

class PruebaGenerarNums
{
    public static void main(String[] args)
    {
        int i;
        Random rnum = new Random();
        
        rnum.setSeed(20);
        
        //nextInt(5) devuelve un número aleatorio entre 0 y 4.

        i = 1 + rnum.nextInt(5); //deja en i un número entre 1 y 5
        StdOut.println("Num: " + i);
        
        i = 1 + rnum.nextInt(5);
        StdOut.println("Num: " + i);
    }
}