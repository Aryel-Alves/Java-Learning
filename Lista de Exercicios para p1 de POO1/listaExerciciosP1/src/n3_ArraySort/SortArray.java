package n3_ArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	
	private static Scanner sc;
	
  public static void insertionSort(int[] array) {
	    int j, key, i;
	    
	    for (j = 1; j < array.length; j++){
	      key = array[j];
	      
	      for (i = j - 1; (i >= 0) && (array[i] > key); i--){
	    	  array[i + 1] = array[i];
	      }
	      array[i + 1] = key;
	    }
	}

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do array: ");
		int length = sc.nextInt();
		int[] arrayExemple = new int[length];
		
		for (int i = 0; i < arrayExemple.length; i++) {
			arrayExemple[i] = (int) (Math.random()*length*10);
	    }
		
		System.out.printf("Desodernado : %s \n", Arrays.toString(arrayExemple)); 
		
		insertionSort(arrayExemple);
		
		System.out.printf("Odernado : %s", Arrays.toString(arrayExemple)); 
	}
	
	
}
