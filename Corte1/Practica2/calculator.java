 
package calculator;

public class calculator
{
    public double x1 , x2;
       
    public calculator(int a, int b)
    {
        x1 = a;
        x2 = b;
    }
    public double add()
    {
        return x1 + x2;
    }
    public double subs()
    {
        return x1 - x2;
    }
    public double mult()
    {
        return x1*x2;
    }
    public double div()
    {
        if(x2!=0){
            return x1 / x2;
            
        }
        else{
           System.out.println("Error: División por cero");
           return Double.NaN; 
        }
    }
        
    
    
    public static void main(String[] args)
    {
        calculator m = new calculator(34,43);
        System.out.println("La suma de m es: " + m.add());
        System.out.println("La resta de m es: " + m.subs());
        System.out.println("La multiplicación de m es: " + m.mult());
        System.out.println("La división de m es: " + m.div());
        
        calculator n = new calculator(15,0);
        System.out.println("La suma de n es: " + n.add());
        System.out.println("La resta de n es: " + n.subs());
        System.out.println("La multiplicación de n es: " + n.mult());
        System.out.println("La división de n es: " + n.div());
        
        
    }
}