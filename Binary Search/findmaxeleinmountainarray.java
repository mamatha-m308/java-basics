package Binarysearch;

public class findmaxeleinmountainarray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2};

        int result = fun(arr);

        System.out.println(result);

    }

    static int fun(int[] arr) {

        int start = 0;

        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {

                // this is decreasing part of the array
                end = mid;

            } else {

                // this is increasing part of the array
                start = mid + 1;
            }
        }

        // In the end start and end point to the maximum element
        return start;
    }
}
