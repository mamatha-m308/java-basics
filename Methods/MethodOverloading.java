public class funoverloading {
 
	public static void main(String[] args) {
		fun(3.4,3.5);
		fun(1,2);
		fun("mamatha");
		fun("mamathabm",10);
	}
	
	static void fun(int a,int b) {
		int sum=a+b;
		System.out.println("sum is:"+sum);
	}
	
	static void fun(double a,double b) {
		double sum=a+b;
		System.out.println("sum of this:"+sum);
	}
	
	static void fun(String name) {
		System.out.println(name);
	}
	
	static void fun(String name,int a) {
		System.out.println(name+" "+a);
	}
}
