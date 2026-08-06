package Array;

public class maxeleofarray {
	static int maximum=0;
public static void main(String[] args) {
	int[] arr= {1,26,32,65,23};
	System.out.println(max(arr));
	
}
static int max(int[] arr) {
	for(int i=0; i<arr.length; i++) {
       if(arr[i]>maximum) {
    	   maximum=arr[i];
       }
	}
	return maximum;
}


}
