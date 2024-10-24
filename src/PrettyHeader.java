import java.io.IOException;
import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String args[])
    {

        Scanner in = new Scanner(System.in);

        SafeInput.prettyHeader(in, "Input message for the header");

    }
}
