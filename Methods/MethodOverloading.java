public class MethodOverloading {
        public static void main(String[] args) {

        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.5));
    }

    // Method 1
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2
    public static double add(double a, double b) {
        return a + b;
    }
}
