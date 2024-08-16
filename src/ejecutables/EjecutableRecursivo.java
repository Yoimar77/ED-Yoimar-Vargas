package ejecutables;

public class EjecutableRecursivo {
	

	    public static void quickSort(int[] array) {
	        quickSort(array, 0, array.length - 1);
	    }

	    private static void quickSort(int[] array, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(array, low, high);
	            quickSort(array, low, pivotIndex - 1);
	            quickSort(array, pivotIndex, high);
	        }
	    }

	    private static int partition(int[] array, int low, int high) {
	        int pivot = array[low + (high - low) / 2];
	        int left = low;
	        int right = high;

	        while (left <= right) {
	            while (array[left] > pivot) {
	                left++;
	            }
	            while (array[right] < pivot) {
	                right--;
	            }
	            if (left <= right) {
	                swap(array, left, right);
	                left++;
	                right--;
	            }
	        }
	        return left;
	    }

	    private static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }

	    public static void main(String[] args) {
	        int[] array = {50, 27, 27, 3, 1, 2, 1};
	        quickSort(array);
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	    }
	
}
