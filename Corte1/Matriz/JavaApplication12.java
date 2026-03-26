package javaapplication12;
import java.util.*;

public class JavaApplication12 {
    public int[][] data;
    public int filas;
    public int columnas;
    
    public JavaApplication12(){
        filas = 2;
        columnas= 2;
        data = new int[filas][columnas];
    }
    
    public void set (){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.println("data["+i+"]["+j+"]:");
                data[i][j]= sc.nextInt();
            }
        }
    }
    public void get (){
        System.out.println("\t Matriz2x2");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
     public void suma (JavaApplication12 m, JavaApplication12 n){
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                    this.data[i][j]= m.data[i][j] + n.data[i][j];
            }
        }
        
    }
    
    public void Multiplicar (JavaApplication12 m, JavaApplication12 n) {
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                    this.data[i][j]= 0;
                    
                    for(int k=0; k<columnas; k++){
                        this.data[i][j]=this.data[i][j]+m.data[i][k]*n.data[k][j];
                    }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        JavaApplication12 m = new JavaApplication12();
           JavaApplication12 n = new JavaApplication12();
           JavaApplication12 s = new JavaApplication12();
           m.set();
           n.set();
           s.suma(m, n);
           s.get();
           s.Multiplicar(m, n);
           s.get();
    }
    
}