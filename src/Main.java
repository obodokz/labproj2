import java.util.Scanner;

public class Main {
    public static int powerOfTwo(int n){
        int result = 1;
        for(int i=0; i<n; i++) {
            result *= 2;
        }
        return result;
    }

    public static int factorialNumber(int n){
        if (n > 10) {
            return -1;
        }
        else {
            if (n <= 1) {
                return 1;
            }
            else{
                return (n * factorialNumber(n-1));
            }
        }
    }

    public static double MultiplyNums(double n1, double n2) {
        int result = 0;
        for(int i=0; i<n2; i++) {
            result += n1;
        }
        return result;
    }

    public static double freeFallTime(double h) {
        return Math.sqrt(2*h/9.80665);
    }

    public static double triangleLeg(double hypotenuse, double leg){
        return Math.sqrt(hypotenuse * hypotenuse - leg * leg);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter task number: ");
        int task = input.nextInt();
        switch (task) {
            case 1 -> {
                System.out.print("Enter n variable: ");
                int localNum = input.nextInt();
                System.out.printf("Result = %s", powerOfTwo(localNum));
            }
            case 2 -> {
                while (true) {
                    System.out.print("Enter n variable: ");
                    int localNum = input.nextInt();
                    if (factorialNumber(localNum) != -1) {
                        System.out.printf("Factorial = %s", factorialNumber(localNum));
                        break;
                    } else {
                        System.out.println("Wrong range! n should be less then 10. Try again.");
                    }
                }
            }
            case 3 -> {
                System.out.print("Enter n1, n2 variables: ");
                double n1 = input.nextDouble(), n2 = input.nextDouble();
                System.out.printf("Sum = %s, Diff = %s, Multi = %s", n1 + n2, n1 - n2, MultiplyNums(n1, n2));
            }
            case 4 -> {
                System.out.print("Enter h: ");
                double h = input.nextDouble();
                System.out.printf("Time = %s", freeFallTime(h));
            }
            case 5 -> {
                System.out.print("Enter hypotenuse and leg: ");
                double hypotenuse = input.nextDouble();
                double leg = input.nextDouble();
                System.out.printf("Leg = %s", triangleLeg(hypotenuse, leg));
            }
            default -> System.out.println("Wrong input");
        }
    }
}