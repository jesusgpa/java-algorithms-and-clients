
import edu.princeton.cs.algs4.StdOut;

public class Cadenas {

    

    public static void main(String[] args) {

        String s = "Hola Mundo";

        String r = s.concat(" que feo eres.");

        StdOut.println(s);
        StdOut.println(r);

        String t = s + " que feo eres.";

        StdOut.println(t);

        StdOut.println(isPalindrome("eres"));
    }

    public static boolean isPalindrome(String s) {

        int n = s.length();

        for (int i = 0; i < n/2; i++)
        {
            if (s.charAt(i) != s.charAt(n-1-i))
            {
                return false;
            }
        }    
        
        return true;

        

    }
}
