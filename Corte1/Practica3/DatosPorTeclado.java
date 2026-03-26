package datosporteclado;
import java.util.*;

public class DatosPorTeclado {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String Cuidad;
        int Semestre;
        double Promedio;
        
        System.out.println("Ingrese cuidad:");
        Cuidad = sc.nextLine();
        
        System.out.println("Ingrese semestre:");
        Semestre = sc.nextInt();        
        
        System.out.println("Ingrese Promedio:");
        Promedio = sc.nextDouble();
        
        System.out.println("Datos por teclado");
        System.out.println("Cuidad: "+ Cuidad);
        System.out.println("Semestre: "+ Semestre);
        System.out.println("Promedio: "+ Promedio);
    }
    
}
