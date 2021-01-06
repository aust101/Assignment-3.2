import java.util.Scanner;

/**
 * For some notes:
 * I decided to use {@link Integer#valueOf(int)} to obtain integers from the user input,
 * simply because the {@link Scanner#nextInt()} method does not consume the rest of the line,
 * while not also including the newline that is generated when pushing enter. The work around to this
 * would be either calling {@link Scanner#nextLine()} after every {@link Scanner#nextInt()}, or simply
 * parsing it just as I am doing.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many users should we build: ");
        final int GLOBAL_SIZE = Integer.valueOf(scanner.nextLine());

        String[] names = new String[GLOBAL_SIZE];
        int[] ages = new int[GLOBAL_SIZE];
        String[] jobs = new String[GLOBAL_SIZE];

        for (int i = 0; i < GLOBAL_SIZE; i++) {
            System.out.println("\nBeginning builder for user id " + i + ":");
            System.out.print("\t(" + i + "): Please enter a name: ");
            names[i] = scanner.nextLine();
            System.out.print("\t(" + i + "): Please enter an age: ");
            String ageInput = scanner.nextLine();
            ages[i] = Integer.valueOf(ageInput == null || ageInput.equalsIgnoreCase("") ? "0" : ageInput);
            System.out.print("\t(" + i + "): Please enter a Job Title (optional): ");
            jobs[i] = scanner.nextLine();
        }
        System.out.println("\nBUILDING COMPLETE! Outputting values [...]\n");
        //print out the saved information
        for (int i = 0; i < GLOBAL_SIZE; i++) {
            System.out.println("PERSON ENTRY " + i + ":");
            System.out.println("\tName: " + (names[i] == null || names[i].isEmpty() ? "N/A" : names[i]));
            System.out.println("\tAge: " + (ages[i] == 0 ? "N/A" : ages[i]));
            System.out.println("\tJob: " + (jobs[i] == null || jobs[i].isEmpty() ? "N/A" : jobs[i]));
        }
    }

}
