public class bwop {
    public static void main(String[] args)
    {
        // Valores iniciales
        int a = 5;
        int b = 7;
 
        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));
 
        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));
 
        // bitwise xor
        // 0 ^ 0 = 0
        // 1 ^ 0 = 1
        // 0 ^ 1 = 1
        // 1 ^ 1 = 0                                        
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));
 
        // bitwise not
        // ~0101=1010
        // will give 2's complement of 1010 = -6
        System.out.println("~a = " + ~a);

        // bitwise << left shift
        // 0101 <<2 10100
        System.out.println("a<<2");        
        System.out.println(a<<2);

        // bitwise >> right shift
        // 0101 >>2 0001        
        System.out.println("a>>2");        
        System.out.println(a>>2);

        // bitwise >>> unsigned right shift
        // 0101 >>>2 0001        
        System.out.println("a>>>2");        
        System.out.println(a>>>2);        

        // también se puede combinar con asignaciones de valor
        // a=a&b
        a &= b;
        System.out.println("a &= b ");        
        System.out.println("a= " + a);


    }
}