import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scc.nextInt();

        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);

    }
}
