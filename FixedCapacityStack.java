import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStack<Item>
{
    private Item[] a;     // elementos de la pila
    private int    n = 0; // número de elementos en la pila

    public FixedCapacityStack(int capacity)
    {  a = (Item[]) new Object[capacity]; }

    public boolean isEmpty() { return n == 0; }
    public int size()        { return n; }

    public void push(Item item)
    { a[n++] = item; }

    public Item pop()
    { return a[--n]; }

    public static void main (String[] args)
    {
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<String>(100);
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-")) { s.push(item); }
            else if (!s.isEmpty()) { StdOut.print(s.pop() + " "); }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
