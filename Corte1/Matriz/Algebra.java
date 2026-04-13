package punto4;
import java.util.*;

class Algebra<f> {
    Scanner sc= new Scanner(System.in);
    public int [][] data;
    public int Filas;
    public int Columnas;
    
    
    public void Taman(int n){
        Filas=n;
        Columnas=n;
        
        data =new int[Filas][Columnas];
    }
    
    
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
//        return resultado;
    }
    
    public void restaMatriz(int[][] M1, int[][] M2 ){
         
        for (int i = 0; i < Filas ; i ++) {
            for (int j = 0; j < Columnas ; j ++) {
                this.data[i][j]=M1[i][j]-M2[i][j];
            }
        }
//        return resultado;
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
//        return resultado;
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
        
//        return resultado;
    }
    
//    public int determinante(int[][] M1){
//        int resultado=1;
//        int suma; 
//        for (int i = 0; i < Filas ; i ++) {
//            for (int j = 0; j < Columnas ; j ++) {
//                
//                suma=()
//                
//                resultado=1;
//            }
//        }
//        
//        
//        
//        return resultado;
//    } 
    
}//Corchete del codigo
