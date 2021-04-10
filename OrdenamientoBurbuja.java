
public class OrdenamientoBurbuja {
    public static void main(String[] args){

        int[] datos = {2, 3, 1, 5, 4};
        int aux;

        for(int i=0; i < datos.length-1; i++){
            for(int j=0; j < datos.length-1; j++){
                if(datos[j] > datos[j+1]){
                    aux = datos[j];
                    datos[j] = datos[j+1];
                    datos[j+1] = aux;
                }
            }
        }

        System.out.println("Arreglo Ordenado");
        for(int i=0; i < datos.length; i++){  
            System.out.println(datos[i]);
        }
    }
}