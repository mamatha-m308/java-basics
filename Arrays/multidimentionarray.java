public class multidimentionarray {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int[][] arr=new int[3][3];  //3 means row and empty braces is column
	
	for(int row=0; row<arr.length; row++) {           //input for row
		for(int col=0; col<arr[row].length; col++) {  //input for column
			arr[row][col]=sc.nextInt();
		}
		
	}
	
	for(int row=0; row<arr.length; row++) {           //print row
		for(int col=0; col<arr[row].length; col++) {  //print column
			System.out.print(arr[row][col]+" ");
		}
		System.out.println();
	}
	
	//another method of printing matrix
	for(int row=0; row<arr.length;row++) {
		System.out.println(Arrays.toString(arr[row]));
}
	
	//another method of printing matrix
	for(int[] a:arr) {
		System.out.println(Arrays.toString(a));
	}
	
}
}
