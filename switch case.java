import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     Scanner data = new Scanner(System.in);
        
        System.out.println("enter the day");
        int day = data.nextInt(); 
        switch (day)
        {
            case 1:
                 System.out.println("this is monday");
                 break;
                 
            case 2:
                System.out.println("this is wednesday");
                break;
                
            case 3:
                System.out.println("this is friday");
                break;
                
            
            default:
               System.out.println("day is invalid");
            
        }
        
        
    }
}
