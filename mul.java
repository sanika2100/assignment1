import java.util.Scanner;

public class mul {
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = obj.nextInt();

       
        System.out.print("Enter the second number: ");
        double num2 = obj.nextInt();

       
        double result = num1 * num2;
       System.out.println("The multiplication is: " + result);
    }
}