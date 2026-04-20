package punto4;
import java.util.*;

class Algebra<f> {
    Scanner sc= new Scanner(System.in);
    private int [][] data;
    private int Filas;
    private int Columnas;

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
        this.Filas=data.length;
        this.Columnas=data[0].length;
    }

    public int getFilas() {
        return Filas;
    }

    public void setFilas(int Filas) {
        this.Filas = Filas;
    }

    public int getColumnas() {
        return Columnas;
    }

    public void setColumnas(int Columnas) {
        this.Columnas = Columnas;
    }
    
    public void setTaman(int n){
        Filas=n;
        Columnas=n;
        
        data =new int[Filas][Columnas];
    }
    
    ////METODOS
    public void cargar(){
        
        for(int i=0; i<Filas; i++){
            for(int j=0; j<Columnas; j++){
                System.out.println("Dato ["+ i+"]["+j+"]:");
                data[i][j]=sc.nextInt();
            }
        }
        
    }
    
    public void imprimir () {
        System .out. println ("\n Matrix :");
        for (int i = 0; i < Filas ; i ++) {
            for (int j = 0; j < Columnas ; j ++) {
                System . out. print ( data [i][j] + " ");
            }
            System .out. println ();
        }
    }
    
    
    public void sumarMatriz(int[][] M1, int[][] M2 ){
        //
        for (int i = 0; i < Filas ; i ++) {
            for (int j = 0; j < Columnas ; j ++) {
                this.data[i][j]=M1[i][j]+M2[i][j];
            }
        }
    }
    
    public void restaMatriz(int[][] M1, int[][] M2 ){
         
        for (int i = 0; i < Filas ; i ++) {
            for (int j = 0; j < Columnas ; j ++) {
                this.data[i][j]=M1[i][j]-M2[i][j];
            }
        }
    }
    
    public void Transpuesta(int[][] M1){
         
        int P1;
        int P2;
        
        for (int i = 0; i < Filas ; i ++) {
            for (int j = 0; j < Columnas ; j ++) {
                
                if(i!=j){
                    P1=M1[i][j];
                    P2=M1[j][i];
                
                    this.data[i][j]=P2;
                    this.data[j][i]=P1;
                }
                else{
                    this.data[i][j]=M1[i][j];
                }
                
            }
        }
    }
    
    public void Multiplicacion(int[][] M1, int[][] M2){
         
        
        for (int i = 0; i < Filas ; i ++) {
            for (int j = 0; j < Columnas ; j ++) {
                this.data[i][j]=0;
                
                for(int k=0; k<Columnas; k++){
                    this.data[i][j]=this.data[i][j]+M1[i][k]*M2[k][j];
                }
            }
        }
    }
    

    
}//Corchete del codigo
