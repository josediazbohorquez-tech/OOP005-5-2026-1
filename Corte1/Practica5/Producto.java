package sobrecargadeconstructores;

public class Producto {
    public String Nombre;
    public double Precio;
    public int x, y;

    public Producto() {
        
    }
    
    public Producto(String Nombre) {
        this.Nombre = Nombre;
    }

    public Producto(String Nombre, double Precio, int x, int y) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.x = x;
        this.y = y;
    }

    public void Mostrar(){
        System.out.println("Nombre="+ Nombre);
        System.out.println("Precio="+ Precio);
        System.out.println("Posicion del Producto: ( Pasillo " + x + ", Estanteria " + y + ")");
    }

}