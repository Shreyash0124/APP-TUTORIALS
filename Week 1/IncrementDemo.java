public class IncrementDemo {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("Original x = " + x);
        System.out.println("Post-increment x++ = " + (x++)); // Prints 5 then increases
        System.out.println("After post-increment, x = " + x);
        System.out.println("Pre-increment ++x = " + (++x)); // Increases first, then prints
        System.out.println("After pre-increment, x = " + x);
    }
}

