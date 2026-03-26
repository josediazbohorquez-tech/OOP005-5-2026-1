package modificadoresdeacceso;

class Estudiante {
    private String Nombre;
    private int Codigo;
    private int Edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public double getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public void Mostrar(){
        System.out.println("Nombre: "+ Nombre);
        System.out.println("Codigo: "+ Codigo);
        System.out.println("Edad: "+ Edad);
    }
}
