/**
 * El código de la clase Rolls.java es otro cliente del TAD Counter 
 * que simula el lanzamiento de un dado de 6 caras. 
 * 
 * Usa la variable rolls para almacenar una referencia a un array de objetos Counter para contabilizar 
 * el número de ocurrencias de cada valor posible del dado.
 */

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

public class Rolls {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int SIDES = 6;

        // initialize counters
        Counter[] rolls = new Counter[SIDES+1];
        for (int i = 1; i <= SIDES; i++) {
            rolls[i] = new Counter(i + "s");
        }

        // flip dice
        for (int j = 0; j < n; j++) {
            int result = StdRandom.uniform(1, SIDES+1);
            rolls[result].increment();
        }

        // print results
        for (int i = 1; i <= SIDES; i++) {
            StdOut.println(rolls[i]);
        }
    }
}
