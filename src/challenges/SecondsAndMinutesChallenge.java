package challenges;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3660));
        System.out.println(getDurationString(61,0));
    }

    public static String getDurationString(int minutes, int seconds) {
        final int minutesPerHour = 60;

        if (minutes <= 0 && seconds <= 0 || seconds > 59) {
            return "Invalid value";
        }
        minutes = minutes % minutesPerHour;
        int hours = minutes / minutesPerHour;

        return String.format("%02dh %02dm %02ds", hours, minutes, seconds);
    }

    public static String getDurationString(int seconds) {
        final int secondsPerMinute = 60;

        if (seconds <= 0) {
            return "Invalid value";
        }
        seconds = seconds % secondsPerMinute;
        int minutes = seconds / secondsPerMinute;

        return getDurationString(minutes, seconds);
    }
}
