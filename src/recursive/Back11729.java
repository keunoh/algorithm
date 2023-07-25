package recursive;


public class Back11729 {

    public static void main(String[] args) {
        int N = 3;

        solve(N, 1, 3);
    }

    static void solve(int N, int a, int b) {
        if (N == 1) {
            System.out.println(a + " " + b);
            return;
        }

        solve(N - 1, a, 6 - a - b);
        System.out.println(a + " " + b);
        solve(N - 1, 6 - a - b, b);
    }
}













