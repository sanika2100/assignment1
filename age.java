import java.util.Scanner;

class age {public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
    
}
}