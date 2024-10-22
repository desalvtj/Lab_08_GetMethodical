import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 1;
        int numberOfDays = switch (birthMonth)
        {
            case 1, 3, 5, 7, 9, 11 -> 31;
            case 4, 6, 8, 10, 12 -> 30;
            case 2 -> (0 == birthYear / 4) ? 29 : 28;
            default -> throw new IllegalArgumentException("Month not 1-12");
        };
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthMonth = 0;
        birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, numberOfDays);
        birthHour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        System.out.println("You were born " + birthMonth + " " + birthDay + " "+ birthYear + ". At " + birthHour + ":" +birthMinute);
    }

}
