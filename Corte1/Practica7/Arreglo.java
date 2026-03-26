package arreglos;
import java.util.*;

class Arreglo {
    public int[] data;
    public int n;
    public int s;//suma
    public int Ma;//Maximo
    public int Mi;//Minimo

    public void ArregloInt(int n){
        this.n = n;
        this.data = new int[n];
    }

    public void print(String name) {
       System.out.print(name + " = [ ");
       for (int i = 0; i < n; i++) {
           System.out.print(data[i]);
           if(i < n - 1) System.out.print(", ");
       }
       System.out.println(" ] ");
    }

    public void IngresoDeDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese datos al vector");
        for(int i = 0; i < n; i++){
            System.out.println("Ingrese dato a la posicion " + (i+1));
            data[i] = scanner.nextInt();
        }
    }

    public void suma() {
        s = 0;
        for (int i = 0; i < n; i++) {
            s += data[i];
        }
        System.out.println("La suma total del vector: " + s);
    }

    public void Promedio() {
        double R = (double) s / n; 
        System.out.println("El promedio del vector: " + R);
    }

    public void Max() {
        Ma = data[0];
        for (int i = 0; i < n; i++) {
            if (data[i] > Ma) {
                Ma = data[i];
            }
        }
        System.out.println("El valor maximo del vector: " + Ma);
    }

    public void Min() {
        Mi = data[0];
        for (int i = 0; i < n; i++) {
            if (data[i] < Mi) {
                Mi = data[i];
            }
        }
        System.out.println("El valor minimo del vector: " + Mi);
    }
}
