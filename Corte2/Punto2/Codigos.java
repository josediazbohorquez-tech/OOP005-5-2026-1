package principal;
import java.util.*;


public class Codigos {
    Scanner sc = new Scanner(System.in);
    public ArrayList<Integer> numbers = new ArrayList<Integer>();
    public void IngresodeDatos(){
    
        int i=0;
        char GN;// generar de nuevo 
        
        do{
            System.out.println("Ingresa un dato a la posicion "+ i +"\nSolo se permiten numeros ");
            int dato = sc.nextInt();
            numbers.add(dato);
            System.out.println("Quiere ingresar otro dato\n s/n");
            GN = sc.next().charAt(0);
            i++;
        }while(GN=='s'||GN=='S');
    }
    
    
    public void modificarposicion(){
        System.out.println("Cual es la posicion que se va a cambiar");
        int P=sc.nextInt();
        System.out.println("Cual es el nuevo dato");
        int DN=sc.nextInt();
        numbers.set(P,DN);

    }
    
    public void Impresion(String name){
        
        System.out.println(name + " = " + numbers );
        
    }
    
    public void Print1_5(){
        
        int First=numbers.getFirst();
        int Last=numbers.getLast();
        
        System.out.println("El primer dato de la coleccion es: "+First+"\nEl ultimo dato de la coleccion es:"+Last);
        
    }
}
