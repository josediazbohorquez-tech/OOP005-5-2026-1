package clasesyatributos;

public class ClasesyAtributos {

    public static void main(String[] args) {
        // TODO code application logic here
        Libro L1=new Libro();
        Libro L2=new Libro();
        
        L1.Autor= "K. Alexander";
        L1.Publicacion= 2004;
        L1.Titulo="Circuitos electricos";
        
        L1.Mostrar();
        
        L2.Autor= "HUGH D. YOUNG";
        L2.Publicacion= 2009;
        L2.Titulo="Fisica Universitaria";
        
        L2.Mostrar();
    }
    
}
