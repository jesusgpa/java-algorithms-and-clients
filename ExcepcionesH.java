import edu.princeton.cs.algs4.*;

public class ExcepcionesH {
    public static void main (String[] args)
    {
        int i = 1;
        int j = 0;

	try {
	    i = i/j;
	}
	catch (java.lang.ArithmeticException e) {
	    System.err.println("División entre 0");
	    System.exit(1);
	}

        StdOut.println("Después de excepción");        
    }
}
