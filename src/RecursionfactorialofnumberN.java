
public class RecursionfactorialofnumberN {
    public static int calculetfactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;

        }
        int factorial_nm1 = calculetfactorial(n - 1);
        int factorial_n = n * factorial_nm1;
        return factorial_n;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans= calculetfactorial(n);
        System.out.println(ans);
    }
}
