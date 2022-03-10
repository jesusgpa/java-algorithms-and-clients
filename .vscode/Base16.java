import edu.princeton.cs.algs4.StdOut;

public class Base16 {

    public static final int FirstChar = 'A';
    public static final int LastChar = 'Z';

    public static void main(String[] args) {

        StdOut.println(FirstChar);

        byte b;
        int i;
        i = 2452345;
        b = (byte)(i & 0xff); //me quedo con el byte menos significativo del entero
        // b = 121 en binario 01111001
        b = (byte) ((0x0f) & (i >> 4)); //me quedo con los bits 4 5 6 y 7
        // b = 7 en binario 0111

        StdOut.println(b);
        
    }

    public static String encode(byte[] content){
        String encode = "XXX";

        return encode;
    }

    public static byte[] decode(String text){
        byte[] decode = new byte[0];

        return decode;
    }

}
