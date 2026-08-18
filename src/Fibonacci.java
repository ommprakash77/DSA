public class Fibonacci {

        public static int fib(int n) {

            if (n <= 1) {
                return n;
            }

            int a = 0, b = 1;

            for (int i = 1; i < n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }

            return b;
        }

        public static void main(String[] args) {
            System.out.println(fib(5));
        }
    }
