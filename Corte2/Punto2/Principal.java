package principal;

import java.util.*;


public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Codigos numbers = new Codigos();
        Scanner sc = new Scanner(System.in);
        char GN;// generar de nuevo 
        
//        do{
//            System.out.println("Ingresa un dato a la posicion "+ i +"Solo se permiten numeros ");
//            int dato = sc.nextInt();
//            numbers.add(dato);
//            System.out.println("Quiere ingresar otro dato\n s/n");
//            GN = sc.next().charAt(0);
//            i++;
//        }while(GN=='s'||GN=='S');
        
        numbers.IngresodeDatos();
        numbers.Impresion("Coleccion");
        numbers.modificarposicion();
        numbers.Impresion("Coleccion");
        numbers.Print1_5();
        System.out.println ( numbers ) ;

    }
   
}
