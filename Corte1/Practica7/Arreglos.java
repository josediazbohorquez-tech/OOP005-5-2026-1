package arreglos;
import java.util.*;

public class Arreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamano del vector n: ");
        int n = sc.nextInt();

        Arreglo A1 = new Arreglo();
        A1.ArregloInt(n);
        A1.IngresoDeDatos();
        A1.suma();
        A1.Promedio();
        A1.Max();
        A1.Min();
    }
}
