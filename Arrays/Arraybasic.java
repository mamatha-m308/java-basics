 public class Arraybasic{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
 	int[] arr=new int[5]; //defining array
	String[] names= {"mamatha","spoorthi","hema"};
	
	System.out.println("enter array element");
	for(int i=0; i<arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	

	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]);
	}
System.out.println("");
//access array element
System.out.println(arr[3]);

//update array element using index
arr[0]=99;


//another ways of print the output
System.out.println(Arrays.toString(arr));

for(int num:arr) {
	System.out.print(num);
}

}
}
