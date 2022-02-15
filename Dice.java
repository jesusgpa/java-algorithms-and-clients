/**
 * Escribe un programa en Java llamado Dice.java . 
 * 
 * El programa recibe dos argumentos obligatorios que son ficheros en texto plano. 
 * 
 * Un fichero con tiradas de dados y un fichero con puntuaciones para cada tirada. 
 * 
 * El fichero de tiradas de dados contendrá 3 líneas por tirada. 
 * 
 * La primera será el nombre, una cadena de texto libre. 
 * 
 * Las siguientes dos serán números del 1 a 6 con la tirada.
 * 
 * % cat tiradas.txt
 * pepe
 * 3
 * 6
 * ...
 * 
 * % cat juego.txt
 * 1 1 5
 * 1 2 0
 * 1 3 9
 * 1 4 3
 * 1 5 6
 * 1 6 6
 * ...
 * 
 * El programa tiene que tener el siguiente método en la clase Dice:
 * 
 * String[] Top(String filename) 
 * 
 * Devuelve los nombres de los jugadores que han sacado mayor puntuación. 
 * 
 * El método debe devolver los nombres de los 10 jugadores que hicieron las mejores tiradas. 
 * 
 * No es necesario que estén ordenados. 
 * 
 * Si hay empates se puede elegir quién entra (de los que tienen menor puntuación) mediante cualquier criterio. 
 * 
 * Si el fichero de tiradas contiene menos de 10 jugadores, esos están garantizados de entrar en 
 * el top, que en ese caso contendrá menos de 10 strings.
 * 
 * También tiene que tener un programa principal, de forma que, cuando se ejecute con los dos 
 * ficheros como argumentos obligatorios, escriba el resultado de top por la salida:
 * 
 * % java -cp .:algs4.jar Dice tiradas.txt juego.txt
 * pepe
 * juan
 * alberto
 * Pepe 2
 * 
 */

import edu.princeton.cs.algs4.StdOut;

public class Dice {
    public static void main(String[] args) {
        StdOut.println("vacio");

        /** Asumimos que los ficheros llegan en el orden tiradas juego */

        /** Leer Fichero tiradas.txt */
        /** Encontrar, leer, almacenar F.tiradas*/

        /** Leer Fichero juego.txt */
        /** Encontar, leer, almacenar F.juego*/


        /** Declarar el array tiradas (nombre, dado1, dado2) */

        /** Declarar el array juego (dado1, dado2, valor tirada) */

        /** Declarar el array top10 (nombre, valor tirada) */

        /** Cargar el fichero tiradas en el array de tiradas */

        /** Cargar el fichero juego en el array de juego */

        /** Obtener el valor de cada tirada y almacenarlo en el array top10 */

        /** Mostrar el resultado almacenado en top10 */


    }

    public static String[] Top(String filename) {

        String[] top = {"Rafa"};

        return top;
    }
}
