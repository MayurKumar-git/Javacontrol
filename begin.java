import java.util.Scanner;
public class begin {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter the OTP: ");
        int OTP = myobj.nextInt();
        if(OTP==2456){
            System.out.println("Login successful ");
        }
        else if(OTP==0000){
            System.out.println("Remote Access granted. System rebooting OS.");
        }
        else{
            System.out.println("User invalid ");
        }
    }
}
