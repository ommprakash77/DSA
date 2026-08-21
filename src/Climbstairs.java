public class Climbstairs {
    public static int solve(int n) {

        if (n < 0 ) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int one_step = solve(n - 1);
        int two_step = solve(n - 2);

        return one_step + two_step;
    }

    int climbstairs(int n) {
        return solve(n);
    }

    public static void main(String[] args) {
        System.out.println(solve(3));
    }
}
