import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        System.out.println("The sum of this number and 2 is " + f(input()));
        System.out.println("This number to the 10th power is " + power(input()));
        System.out.println("The square root of this number is " + root(input()));
        System.out.println("The absolute value of this number is " + absolute(input()));
    }

    public static int f(int x) {
        return x + 2;
    }

    public static int power(int x) {
        return x * x * x * x * x * x * x * x * x * x;
    }

    public static double root(int x) {
        return Math.sqrt(x);
    }

    public static int absolute(int x) {
        return (x >= 0) ? x : (-1 * x);
    }

    public static int input() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        return keyboard.nextInt();
    }
}

