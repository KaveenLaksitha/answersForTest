import java.util.Scanner;

public class Q1 {

    //using recursion to calculate power
    public static int calculatePower(int base, int exp) {
        if (power != 0) {
            return (base * calculatePower(base, exp - 1));
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int base;
        int exp;
        int output;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input base: ");
        base = scanner.nextInt();
        System.out.print("Please input exponent: ");
        exp = scanner.nextInt();

        output = calculatePower(base,exp);
        System.out.println(base + " ^ "+ exp + " = " + output);
    }
}
