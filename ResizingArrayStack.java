import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item>
{
    // Inicialmente el tamaño del array es 1
    private Item[] a = (Item[]) new Object[1]; 
    private int n = 0;

    public boolean isEmpty() {  return n == 0;  }
    public int        size() {  return n;       }

    private void resize(int max)
    {   // Mover pila a un nuevo array temp, de tamaño max
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < n; i++)  {  temp[i] = a[i];  }
        a = temp;
    }

    public void push(Item item)
    {   // Añadir item a la cima de la pila
        if (n == a.length) {  resize(2*a.length);  }
        a[n++] = item;
    }

    public Item pop()
    {   // Extraer item de la cima de la pila y devolverlo
        Item item = a[--n];
        a[n] = null;  // Evitar loitering
        if (n > 0 && n == a.length/4) {  resize(a.length/2);  }
        return item;
    }

    public Iterator<Item> iterator()
    {  return new ReverseArrayIterator();  }

    private class ReverseArrayIterator implements Iterator<Item>
    {   // Iterador que recorre en orden LIFO
        private int i = n-1; // posición actual del array en la que
                             // está el iterador: la que devolverá next()
        public boolean hasNext()  {  return i >= 0;  }
        public Item       next()  {  return a[i--];  } 
        public void     remove()  {                  }
    }
}
