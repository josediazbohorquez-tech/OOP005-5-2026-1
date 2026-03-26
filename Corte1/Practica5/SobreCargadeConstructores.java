package sobrecargadeconstructores;

public class SobreCargadeConstructores {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto P1= new Producto();
        Producto P2= new Producto("Cuaderno");
        Producto P3= new Producto("Esfero", 2500, 4,5);
        
        System.out.println("\n Producto 1");
        P1.Mostrar();
        System.out.println("\n Producto 2");
        P2.Mostrar();
        System.out.println("\n Producto 3");
        P3.Mostrar();
    }
    
}
