import java.util.Scanner;

class Main{
    public static void main(String[] args){
        String User = "Admin";
        String Password = "admin@123";
        Scanner data = new Scanner(System.in);
        
        System.out.println("Enter the Username");
        String user = data.nextLine();
        
        System.out.println("Enter the Password");
        String password = data.nextLine();
        
        if (User==user && Password == password){
            System.out.println("Login Successfully");
        }
        else{
            System.out.println("Invalid Userword or Password");
        }
    } 
}
