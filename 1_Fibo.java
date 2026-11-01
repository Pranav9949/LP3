
import java.util.Scanner;

class 1_Fibo{

    // Non-recursive method
    static void nonRecursive(int n) {
        int a = 0, b = 1, c;

        System.out.print("Non-Recursive: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Recursive method
    static int recursive(int n) {
        if (n <= 1)
            return n;
        return recursive(n - 1) + recursive(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        nonRecursive(n);

        System.out.print("Recursive: ");
        for (int i = 0; i < n; i++) {
            System.out.print(recursive(i) + " ");
        }

        sc.close();
    }
}
