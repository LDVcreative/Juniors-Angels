import java.util.Scanner;
import java.io.*;


public class UserFeedbackCollector {
    public static void main(String[] args) {

        //Color for different first string:
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLUE = "\u001B[34m";

        //RATING COLLECTOR:
        System.out.println(
                ANSI_BLUE
                + "Hello, Java Junior. "
                + "\nLooks like you want to ad HR-manager to your remember-list. So... \nDo it!"
                + ANSI_RESET);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the company name of this HR-manager:");
            String hrCompanyName = scanner.next();
            System.out.println("Enter the name of this HR-manager:");
            String hrFirstName = scanner.next();
            System.out.println("Enter the last name of this HR-manager:");
            String hrLastName = scanner.next();
            System.out.println("Enter e-mail of this HR-manager:");
            String hrEmail = scanner.next();

            System.out.println("Rate this HR-manager (0-10):");
            int hrRateByUser = Integer.parseInt(scanner.next());
            System.out.println("Leave a comment about communication with this HR-manager:");
            scanner.nextLine();
            String userCommentAboutHr = scanner.nextLine();


            HrProfile hrProfile = new HrProfile(hrCompanyName, hrFirstName, hrLastName, hrEmail);
            HrRateSystem hrRateSystem = new HrRateSystem(hrRateByUser, userCommentAboutHr);

            System.out.println("Profile of this HR-manager added to your remember-list:");
            System.out.println(ANSI_BLUE
                    + hrCompanyName
                    + ", " + hrFirstName
                    + " " + hrLastName
                    + ", " + hrEmail + "\nRated by you: "
                    + hrRateByUser
                    + "\nYour comment: "
                    + userCommentAboutHr
                    +ANSI_RESET);
            System.out.println("\nNow enter \"a\" to add new HR-manager or \"q\" to quit: ");
            if (scanner.next().equals("q")) {
                return;
            }
        }
    }
}
