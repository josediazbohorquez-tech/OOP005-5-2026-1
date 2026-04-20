package GetAndSet;
import java.util.*;

public class GetAndSet {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        Objetos OB1 =new Objetos("Cartulinas", 500);
        Objetos OB2 =new Objetos("Esferos", 1500);
        Objetos OB3 =new Objetos("Lapizes", 1000);
        Objetos OB4 =new Objetos("Plastilina", 5000);
        Objetos OB5 =new Objetos("Blocs", 5000);
        Objetos OB6 =new Objetos("Temperas", 10000);
        
        System.out.println(OB1.getNombre()+"\n"+OB1.getPrecio());
        System.out.println(OB2.getNombre()+"\n"+OB2.getPrecio());
        System.out.println(OB3.getNombre()+"\n"+OB3.getPrecio());
        System.out.println(OB4.getNombre()+"\n"+OB4.getPrecio());
        System.out.println(OB5.getNombre()+"\n"+OB5.getPrecio());
        System.out.println(OB6.getNombre()+"\n"+OB6.getPrecio());
        
        
        System.out.println("Se vendieron todas las cartulinas se obtuvieron 240 mil");
        System.out.println("Se nos acabo la cartulina asigne un nuevo objeto y valor");
        String ObjR=sc.next();
        OB1.setNombre(ObjR);
        int ObjP=sc.nextInt();
        OB1.setPrecio(ObjP);
        System.out.println(OB1.getNombre()+"\n"+OB1.getPrecio());
    }
    
}
