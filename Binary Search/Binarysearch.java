package Binarysearch;

public class Binarysearch {
public static void main(String[] args) {
	int[] arr= {1,2,3};
	int target=3;
	fun( arr,target);
}
static void fun(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
        int mid = low + (high-low) / 2;

        if (arr[mid] == target) {
            System.out.println("Target found at index " + mid);
            return;
        }

        if (target > arr[mid]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    System.out.println("Target not found");
}
}
