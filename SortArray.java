package stringpackage;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {13,7,6,45,21,9,2,100};
		Arrays.sort(arr,1,5);
		System.out.printf("Modified arr[] : %s",Arrays.toString(arr));

	}

}
