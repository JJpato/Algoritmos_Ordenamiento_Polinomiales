
public class OrdenamientoSeleccion {
    public static void main(String[] args){
        int[] datos = {2, 3, 1, 5, 4, 6};
        int aux, min;
    
        for(int i=0; i<datos.length-1; i++){
            min = i; 
            //aux = datos[i]; 

            for(int j = i+1; j < datos.length; j++){
                if(datos[j] < datos[min]){
                    min = j;
                }
            }
            aux = datos[i];
            datos[i] = datos[min];
            datos[min] = aux;
        }

        System.out.println("Arreglo Ordenado");
        for(int i=0; i < datos.length; i++){  
            System.out.println(datos[i]);
        }
    }
}