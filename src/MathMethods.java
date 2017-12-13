import java.util.Scanner;
import java.lang.Math;

public class MathMethods {
    public static void main(String[] args) {

        System.out.println("Fist number raised to the power of the second number is "+power(input()));
        System.out.println("The absolute value is "+(input()));
        System.out.println("The square root is "+ squareRoot(input()));
        System.out.println("A random number is "+ random(input()));
        System.out.println("The max number is "+ max(input()));
        System.out.println("The minimum number is "+ minimum(input()));
        System.out.println("The number rouded is "+ round(input()));
        System.out.println("The greater number (Ceiling) is "+ ceiling(input()));
        System.out.println("The lesser number (Floor) is "+ floor(input()));
    }

    public static int absolute(int x) {
        return Math.abs(x);
    }

    public static double power(double x) {
        return Math.pow(x,x);
    }

    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static double random(double x) {
        return Math.random();
    }

    public static int max(int x) {
        return Math.max(x,x);
    }

    public static int minimum(int x) {
        return Math.min(x,x);
    }

    public static double round(double x) {
        return Math.round(x);
    }

    public static double ceiling(double x) {
        return Math.ceil(x);
    }

    public static double floor(double x) {
        return Math.floor(x);
    }

    public static int input(){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter one or two numbers");
        return keyboard.nextInt();

    }
}
