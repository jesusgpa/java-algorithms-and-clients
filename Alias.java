/*

Este código muestra en la salida estándar el String “2 ones”. 

Lo cuál es extraño pues sólo se ha llamado una vez a c1.increment().

La explicación es que a través del alias c2 se ha incrementado otra vez el contador “ones”, 
en la sentencia c2.increment();.

Se han declarado dos variables que almacenan referencias a objetos de clase Counter. 

Pero sólo se ha creado un objeto de esa clase con new. 

La dirección de memoria de ese objeto se ha almacenado en la variable

c1. Después se ha asignado dicha dirección o referencia a la variable

c2. Por tanto, el único objeto que se ha creado tiene una dirección que
está almacenada en ambas variables. 

Decimos a veces que c1 y c2 apuntan o referencian al mismo objeto.

*/

import edu.princeton.cs.algs4.StdOut;

public class Alias {
    public static void main(String[] args) {
        Counter c1 = new Counter("ones");
        c1.increment();
        Counter c2 = c1; // c2 es un alias de c1
        c2.increment();
        StdOut.println(c1); // muestra 2 ones
    }
}
