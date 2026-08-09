package searchalgorithm;

public class findevennoofdigit {
public static void main(String[] args) {
	int[] arr= {12,234,4,6,2341};
}
static void digit(int[] arr) {
	int count=0;
	int cnt=0;
	for(int i=0; i<arr.length; i++) {
		while(arr[i]>=0) {
			int rem=arr[i]%10;
			arr[i]=arr[i]/10;
			cnt++;
		}
		if(cnt%2==0) {
			count++;
		}
	}
	System.out.println(count);
}
}
