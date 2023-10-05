import java.util.Scanner;

public class StringWorkshop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String startingString = in.nextLine();
        String ans = "y";

        while (ans.equals("y")) {
            System.out.println("Current String is: " + startingString);
            System.out.println("Choose an option: ");
            System.out.println("1. Add content");
            System.out.println("2. Check if string contains substring");
            System.out.println("3. Output length");
            System.out.println("4. Output substring after prefix");
            System.out.println("5. Output substring before suffix");
            System.out.println("6. Output substring between prefix and suffix");
            System.out.println("7. Exit");
            int input = in.nextInt();

            if (input == 1) {
                startingString = addinator(startingString);
            }
            if (input == 2) {
                System.out.println(checksubinator(startingString));
            }
            if (input == 3) {
                System.out.println(lengthinator(startingString));
            }
            if (input == 4) {
                System.out.println("Substring: " + prefixinator(startingString));
            }
            if (input == 5) {
                System.out.println("Substring: " + suffixinator(startingString));
            }
            if (input == 6) {
                System.out.println("Substring: " + suffandprefinator(startingString));
            }
            if (input == 7) {
                ans = ("n");
                System.out.println("Goodbye!");
            }
        }

    }

    public static String addinator(String startingString) {
        Scanner in = new Scanner(System.in);
        String addStuff = in.nextLine();
        startingString = startingString + addStuff;
        return startingString;

    }

    public static boolean checksubinator(String startingString) {
        Scanner in = new Scanner(System.in);
        String substring;
        substring = in.next();
        return (startingString.contains(substring));

    }

    public static int lengthinator(String startingString) {
        return startingString.length();
    }

    public static String prefixinator(String startingString) {
        Scanner in = new Scanner(System.in);
        String prefix;
        prefix = in.next();
        int index = startingString.indexOf(prefix);

        return startingString.substring(index + 1);
    }

    public static String suffixinator(String startingString) {
        Scanner in = new Scanner(System.in);
        String suffix;
        suffix = in.next();
        int indexOfSuffix = startingString.indexOf(suffix);

        return startingString.substring(0, indexOfSuffix);
    }

    public static String suffandprefinator(String startingString) {
        Scanner in = new Scanner(System.in);
        String prefix;
        String suffix;
        System.out.println("Prefix: ");
        prefix = in.next();
        System.out.println("Suffix: ");
        suffix = in.next();

        int indexOfSuffix = startingString.indexOf(suffix);
        int indexOfPrefix = startingString.indexOf(prefix);

        return startingString.substring(indexOfPrefix + 1, indexOfSuffix);
    }
}
