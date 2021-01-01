import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {

        int[] targetHRate = new int[2];

        Scanner input = new Scanner(System.in);

        String firstName, lastName;
        int year, month, day, maximumHeartRate;

        System.out.print("First Name: ");
        firstName = input.next();

        System.out.print("Last Name: ");
        lastName = input.next();

        System.out.print("Day of Birth: ");
        day = input.nextInt();

        System.out.print("Month of Birth: ");
        month = input.nextInt();

        System.out.print("Day of Birth: ");
        year = input.nextInt();

        input.close();

        HeartRate hRate = new HeartRate(firstName, lastName, year, month, day);

        System.out.println();
        System.out.println(hRate);
        System.out.println();

        maximumHeartRate = hRate.maxHeartRate(hRate.calculateAge());
        targetHRate = hRate.targetHeartRate(maximumHeartRate);

        System.out.printf("%s: %d%n%s: %d - %d", "Maximum Heart Rate", maximumHeartRate, "Target Heart Rate", targetHRate[0], targetHRate[1]);
    }
}
