package variables;

public class Time {
    
    public static void main(String[] args) {
        final int totalSeconds = 5450;

        // Direct conversions
        double minutes = totalSeconds / 60.0;
        double hours = totalSeconds / 3600.0;
        double days = totalSeconds / (3600.0 * 24.0);
        double weeks = totalSeconds / (3600.0 * 24.0 * 7.0);

        // Breakdown into weeks, days, hours, minutes, and seconds
        int remainingSeconds = totalSeconds;
        int weeksInt = remainingSeconds / (60 * 60 * 24 * 7);
        remainingSeconds %= (60 * 60 * 24 * 7);
        int daysInt = remainingSeconds / (60 * 60 * 24);
        remainingSeconds %= (60 * 60 * 24);
        int hoursInt = remainingSeconds / (60 * 60);
        remainingSeconds %= (60 * 60);
        int minutesInt = remainingSeconds / 60;
        int secondsInt = remainingSeconds % 60;

        
        System.out.printf("Initial value: %d seconds%n", totalSeconds);
        System.out.println("------------------------------");
        System.out.printf("Minutes: %.2f minutes%n", minutes);
        System.out.printf("Hours: %.2f hours%n", hours);
        System.out.printf("Days: %.2f days%n", days);
        System.out.printf("Weeks: %.2f weeks%n", weeks);
        System.out.println("------------------------------");
        System.out.println("Breakdown into Weeks, Days, Hours, Minutes, and Seconds:");
        System.out.printf("%d Weeks, %d Days, %d Hours, %d Minutes, %d Seconds%n", weeksInt, daysInt, hoursInt, minutesInt, secondsInt);
    }

}
