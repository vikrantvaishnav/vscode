package commandline;

public class ConvertDays {
    public static void main(String[] args) {

        int totalDays = Integer.parseInt(args[0]);

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }

}
