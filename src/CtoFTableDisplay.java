public class CtoFTableDisplay
{
    public static void main(String[] args)
    {

        System.out.print("Celsius  |  Fahrenheit");
        System.out.println();
        System.out.println("-----------------------");

        for (double c = -100; c <= 100; c++) {
            System.out.printf("%8.2f\t%8.2f\n", c, cToF(c));
            c++;
        }
    }
    public static double cToF (double c)
    {
        final double CONVERSION = 1.8;
        final int CONSTANT = 32;

        return c * CONVERSION + CONSTANT;
    }


}

