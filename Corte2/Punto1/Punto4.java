package punto4;
import java.util.*;

public class Punto4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Algebra<Integer> M1 = new Algebra<Integer>();
        Algebra<Integer> M2 = new Algebra<Integer>();
        
        Algebra<Integer> M3 = new Algebra<Integer>();

        System.out.print("Ingrese el tamaño de las matrices cuadradas: ");
        int n = sc.nextInt();

        M1.setTaman(n);
        M2.setTaman(n);
        M3.setTaman(n);

        System.out.println("\t Cargar Matriz 1 ");
        M1.cargar();
        System.out.println("\t Cargar Matriz 2");
        M2.cargar();

        System.out.println("\nResultados:");
        
        System.out.println("Suma:");
        M3.sumarMatriz(M1.getData(), M2.getData());
        M3.imprimir();
        
        
        System.out.println("Resta:");
        M3.restaMatriz(M1.getData(), M2.getData());
        M3.imprimir();
        
        
        System.out.println("Multiplicacion:");
        M3.Multiplicacion(M1.getData(), M2.getData());
        M3.imprimir();
        
        
        System.out.println("\t Matriz 1 transpuesta ");
        M1.Transpuesta(M1.getData());
        M1.imprimir();

        System.out.println("\t Matriz 2 transpuesta ");
        M2.Transpuesta(M2.getData());
        M2.imprimir();

        
    }
    
}
