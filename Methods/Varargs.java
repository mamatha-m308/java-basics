//variable number of argumemt
public class Varargs {
public static void main(String[] args) {
	fun(1,2,55,6);
	multiple(21 , 32, "mamatha","anu","hema");
}
static void multiple(int a, int b, String ...s) {
	System.out.println(Arrays.toString(s));
}

static void fun(int ...s) {
	System.out.println(Arrays.toString(s));
}
}
