package Array;

import java.util.Arrays;

public class swaparrayelement {
	public static void main(String[] args) {
    int[] arr= {1,2,3,4,5};
    
reverse(arr);
System.out.println(Arrays.toString(arr));

swap(arr,1,3);
System.out.println(Arrays.toString(arr));
	}
	
//function for reverse
static void reverse(int[] arr) {
	int start=0;
	int end=arr.length-1;
	while(start<end) {
		swap(arr,start,end);
		start++;
		end--;
	}
}
	
//function for swap elements of array
static void swap(int[] arr ,int ind1,int ind3) {
	int temp=arr[ind1];
	arr[ind1]=arr[ind3];
	arr[ind3]=temp;

	}
}
