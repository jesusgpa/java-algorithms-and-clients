import edu.princeton.cs.algs4.StdOut;

public class CounterWithName extends Count {
    private final String name;
    
    public CounterWithName (String id)
    { name = id; }

    public String toString()
    { return super.toString() + " " + name; }

    public static void main(String[] args)
    {
	CounterWithName heads = new CounterWithName("heads");
	heads.increment();
	StdOut.println(heads.toString());
	// La anterior línea se puede escribir sin llamar explícitamente
	// a toString():  StdOut.println(heads);
    }
}
