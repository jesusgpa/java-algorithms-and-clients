public class Evaluate
{
    private static boolean isBinOperand(String op)
    {
        String ops = "+-*/";
        return ops.contains(op);
    }
    private static double evalOp(Stack<Double> vals, double v1, String op)
    {
        double v = 0.0;
        double v2 = 0.0;
        if (isBinOperand(op)) {
            v2 = vals.pop();
        }
        if      (op.equals("+"))    { v = v1 + v2; }
        else if (op.equals("-"))    { v = v1 - v2; }
        else if (op.equals("*"))    { v = v1 * v2; }
        else if (op.equals("/"))    { v = v1 / v2; }
        else if (op.equals("sqrt")) { v = Math.sqrt(v1)  ; }
        return v;
    }
    public static void main(String[] args)
    {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while (!StdIn.isEmpty())
            {   // Leer token, push si es operador
                String s = StdIn.readString();
                if      (s.equals("("))    {            ; }
                else if (isBinOperand(s) || s.equals("sqrt"))
                    { ops.push(s); }             
                else if (s.equals(")"))
                    {   // Pop->eval->push(resultado) si el token es ")"
                        String op = ops.pop();
                        double v = vals.pop();
                        v = evalOp(vals, v, op);
                        vals.push(v);
                    } 
                else
                    {   // El token no es un operador o paréntesis:
                        // push de un double
                        vals.push(Double.parseDouble(s));
                    }
            }
        StdOut.println(vals.pop());
    }
}
