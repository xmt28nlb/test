import java.util.*;
import java.io.*;

public class SomeClass {
	private static final int SIZE = 100;
	public static void main(String[] args) {
		int[] arr = new int[SIZE];

		for (int i = 0; i < SIZE; i++){
			arr[i] = (int) (Math.random() * 100);
		}
		//System.out.print(Arrays.toString(arr));
	
		for (int i = 0; i < arr.length; i++){
			for(int j = arr.length -1; j > 0; j--){
				if (arr[j] > arr[j-1]){
					continue;
				} else {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}