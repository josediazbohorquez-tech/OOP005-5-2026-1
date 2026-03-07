package arreglos;
import java.util.Scanner;

public class arreglos {
    public int [] data ;
    public int n ;
    public int s;//suma
    public int p;//promedio
    public int Ma;//Maximo
    public int Mi;//Minimo
    
// Constructor : crea vector de t a m a o n
    public arreglos( int n ) {
       this . n = n ;
       this . data = new int[n];
    }

    public void print( String name ) {
    System.out.print(name + " = [ " ) ;
       for (int i = 0; i < n ; i ++) {
           System . out . print ( data [ i ]) ;
           if(i < n - 1) System . out . print ( " , " ) ;
       }
       System.out.println(" ] ") ;
    }
    public void IngresoDeDatos(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese datos al vector");
        for(int i=0; i<n; i++){
            System.out.println("Ingrese dato a la posicion "+ (i+1));
            data[i] = scanner.nextInt();
        }
    }
    
    public void suma () {
    for (int i = 0; i < n; i++) {
        s = s + data[i];
    }
    System.out.println("la suma total del vector " + s);
}

    public void Promedio() {
        for (int i = 0; i < n; i++) {
            p++;
        }
        double R = (double) s / p;
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
    public static void main(String[] args) {
        arreglos ob1 = new arreglos(8);
        arreglos ob2 = new arreglos(8);
        
        ob1.IngresoDeDatos();
        ob1.print("Vector 1:");
        ob1.Max();
        ob1.Min();
        ob1.suma();
        ob1.Promedio();
        ob2.IngresoDeDatos();
        ob2.print("Vector 2:");
        ob2.Max();
        ob2.Min();
        ob2.suma();
        ob2.Promedio();
    }
}