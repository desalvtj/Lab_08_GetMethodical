import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        boolean notDone = true;

        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter item price: ", 00.50, 10.00);
            totalPrice += itemPrice;
            notDone = SafeInput.getYNConfirm(in, "Do you have another item [Y/N]?: ");
        }while(notDone);

        System.out.println("Your total is: ");
        System.out.printf("%.2f%n", totalPrice);
    }

}
