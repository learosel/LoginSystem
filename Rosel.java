package login_system;
import java.util.Scanner;

public class Login_System {

    public static void main(String[] args) {
        Scanner ikaw = new Scanner(System.in);
        
        boolean at = true;

        String [][] account = new String [10][2];
        int count = 0;
        String user;
        String pass;
        
        while (at){
        
        System.out.println("===LOGIN SYSTEM===");
        System.out.println("[1]Login");
        int ako = 1;
        System.out.println("[2]Register");
        int ay = 2;
        System.out.println("[3]Exit");
        int mandirigma = 3;
            System.out.println("");
        
        int choose = ikaw.nextInt();ikaw.nextLine();
        
            if (choose==ako){
                System.out.println("Enter Username: ");
                user = ikaw.nextLine();
                System.out.println("Enter Password: ");
                pass = ikaw.nextLine();
                
                boolean correct = false;
                
                for (int i = 0; i<count; i++){
                    if (account [i][0].equals(user) && account [i][1].equals(pass)){
                        correct = true;
                        break;
                            
                    }}
                    
                    if (correct){
                        System.out.println("Hello "+user+"!");
                    }else {
                        System.out.println("Invalid Username or Password!");
                    }
                }
            
            if (choose==ay){
                System.out.println("Enter Username: ");
                user = ikaw.nextLine();
                              
                boolean naa = false;
                    for (int i = 0; i<count; i++){
                        if (account [i][0].equals(user)){
                            naa = true;
                            break;
                        }}
                        
                        if (naa){
                            System.out.println("Username already exist!");
                        } else {
                        
                System.out.println("Enter Password: ");
                pass = ikaw.nextLine();
                System.out.println("Confirm Password: ");
                String confi = ikaw.nextLine();
                
                if (confi.equals(pass)){
                    System.out.println("Successfully Registered!");
                    
                    account [count][0] = user;
                    account [count][1] = pass;
                    count++;
                    
                }else {System.out.println("Password and Confirm Password did not match!!");}
                
                        }
                    }
            
                System.out.println("");
        
            if (choose==mandirigma){at = false;System.out.println("Goodbye!");at=false;}
        }

                }
        }
