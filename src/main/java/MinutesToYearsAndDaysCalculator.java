public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    private static void printYearsAndDays(long minutes) {

        final int MINUTES_IN_YEAR = 525600;
        final int MINUTES_IN_DAY = 1440;

        if(minutes<0) {
            System.out.println("Invalid Value");
            return;
        }
        int years = (int) minutes / MINUTES_IN_YEAR;
        int days = (int) (minutes % MINUTES_IN_YEAR) / MINUTES_IN_DAY;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
