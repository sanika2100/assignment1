import java.util.Scanner; 

public class userid
 {  
    public static void main(String[] args)
     {
        Scanner sc2 = new Scanner(System.in);  
        System.out.print("enter user id: ");
        String Userid = sc2.nextLine();  

        if (Userid.equals("555")) 
        {
            System.out.println("name:sanika");
            System.out.println("age:20");
        } 
        else 
        {
            System.out.println("User ID not found.");
        }
    }
}