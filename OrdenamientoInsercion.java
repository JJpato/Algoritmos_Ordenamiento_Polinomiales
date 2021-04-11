
public class OrdenamientoInsercion {
    public static void main(String[] args){
        int[] datos = {2, 3, 1, 5, 4};
        int aux, posicion;
    
        for(int i=0; i<datos.length; i++){
            posicion = i; 
            aux = datos[i]; 

            while(posicion > 0 && datos[posicion-1] > aux){
                datos[posicion] = datos[posicion-1];
                posicion--;

            }
            datos[posicion] = aux;
        }

        System.out.println("Arreglo Ordenado");
        for(int i=0; i < datos.length; i++){  
            System.out.println(datos[i]);
        }
    }
}