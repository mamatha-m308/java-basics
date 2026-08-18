package Binarysearch;

public class cilingofnumber{
public static void main(String[] args) {
	int[] arr= {1,3,4,6};
	int target=5;
	fun( arr,target);
}
static void fun(int[] arr, int target) {

    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            System.out.println("Ceiling = " + arr[mid]);
            return;
        }

        if (target > arr[mid]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    if (low == arr.length) {
        System.out.println("No ceiling exists");
    } else {
        System.out.println("Ceiling = " + arr[low]);
    }
}
}

