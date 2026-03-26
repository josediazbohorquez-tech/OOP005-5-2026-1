package modificadoresdeacceso;

public class ModificadoresdeAcceso {

    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante E1= new Estudiante();
        
        E1.setNombre("Julian");
        E1.setCodigo(345);
        E1.setEdad(23);
        
        E1.Mostrar();
        
        E1.setCodigo(343);
        E1.setEdad(17);
        E1.Mostrar();
        
    }
    
}
