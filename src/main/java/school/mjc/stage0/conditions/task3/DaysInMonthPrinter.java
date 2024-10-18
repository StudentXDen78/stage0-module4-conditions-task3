package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        // Implement the program that will consume a number month
        // from method argument and print amount of days in that month,
        // if number is not a month number -> print: "wrong number!":
        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
            return;
        }
        if (month == 1) System.out.println(31);
        if (month == 2) System.out.println(28);
        if (month == 3) System.out.println(31);
        if (month == 4) System.out.println(30);
        if (month == 5) System.out.println(31);
        if (month == 6) System.out.println(30);
        if (month == 7) System.out.println(31);
        if (month == 8) System.out.println(31);
        if (month == 9) System.out.println(30);
        if (month == 10) System.out.println(31);
        if (month == 11) System.out.println(30);
        if (month == 12) System.out.println(31);
    }
}
