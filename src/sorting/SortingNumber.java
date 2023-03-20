package sorting;

import java.util.Arrays;

public class SortingNumber {

	int arr[] = {30, 25, 11, 23, 16, 10, 26};
	String nameArr[] = {"Kamesh","Nandha ganesh","Veeravel","Neveen raj","Obadiah"};
	
	public void sortingMethods() {
		Arrays.sort(arr);
		Arrays.sort(nameArr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(nameArr));
		
	}

}
