
public class OrdenamientoSeleccion {
    public static void main(String[] args){
        int[] datos = {8, 14, 67, 98, 87, 29, 35, 74, 44, 55, 2, 
            17, 100, 78, 46, 6, 30, 28, 18, 33, 38, 1, 4, 15, 84, 
            82, 27, 36, 64, 68, 41, 50, 43, 96, 45, 79, 22, 37, 54, 
            25, 39, 48, 86, 71, 76, 47, 21, 75, 93, 7, 63, 26, 69, 92, 
            42, 31, 58, 20, 49, 90, 66, 10, 52, 51, 9, 88, 85, 53, 77, 
            11, 23, 95, 57, 40, 97, 5, 91, 61, 3, 72, 59, 80, 12, 81, 
            60, 83, 16, 34, 62, 13, 56, 94, 32, 70, 89, 24, 73, 99, 65, 19};
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

        int saltoCont=0;
        System.out.println("Ordenamiento por seleccion:");
        for(int i=0; i < datos.length; i++){  
            saltoCont++;
            System.out.print(datos[i] + ", ");
            if(saltoCont >= 10){
                System.out.println("");
                saltoCont = 0;
            }
        }
    }
}