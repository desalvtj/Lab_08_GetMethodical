import java.util.Scanner;

public class Reggie
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        String SSN = "";
        String studentID = "";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        studentID = SafeInput.getRegExString(in, "Enter your M ID: ", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Choose a menu choice: (O)pen (S)ave (V)iew (Q)uit: ", "^[OoSsVvQq]$" );

        System.out.println("Your SSN is: " + SSN);
        System.out.println("Your student ID is: " + studentID);
        System.out.println("Your menu choice is: " + menuChoice);
    }

}
