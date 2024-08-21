package ejecutables;

public class EjecutableEjercicioMetodoQuickSort {

    // Método público para iniciar el proceso de ordenación
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    // Método recursivo para ordenar el arreglo usando Quicksort
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) { // Condición de parada: el subarreglo debe tener más de un elemento
            int pivotIndex = partition(array, low, high); // Encuentra el índice del pivote
            quickSort(array, low, pivotIndex - 1); // Ordena la parte izquierda del pivote
            quickSort(array, pivotIndex, high); // Ordena la parte derecha del pivote
        }
    }

    // Método para reorganizar el arreglo alrededor del pivote
    private static int partition(int[] array, int low, int high) {
        int pivot = array[low + (high - low) / 2]; // Selecciona el pivote
        int left = low;
        int right = high;

        while (left <= right) { // Mientras los punteros no se crucen
        	
            while (array[left] > pivot) { // Mueve el puntero izquierdo
                left++;
            }
            while (array[right] < pivot) { // Mueve el puntero derecho
                right--;
            }
            if (left <= right) { // Si los punteros no se han cruzado
            	
                swap(array, left, right); // Intercambia los elementos
                left++;
                right--;
            }
        }
        return left; // Devuelve el índice del pivote
    }

    // Método para intercambiar dos elementos en el arreglo
    private static void swap(int[] array, int i, int j) {
        int temp = array[i]; // Guarda temporalmente el valor en i
        array[i] = array[j]; // Asigna el valor en j a i
        array[j] = temp; // Asigna el valor temporal a j
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        int[] array = {50, 27, 27, 10, 1, 2, 1,4,70};
        quickSort(array); // Llama al método quickSort para ordenar el arreglo
        for (int i : array) {
            System.out.print(i + " "); // Imprime el arreglo ordenado
        }
    }
}