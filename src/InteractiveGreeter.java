import java.util.Scanner;
public class InteractiveGreeter {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name;
        String origin;
        String age;
        String favActivity;
        String donation;

        System.out.print("Hello, what is your name?");
        name = in.nextLine();
        System.out.println("Nice to meet you " + name + "!");

        System.out.println("Where are you from?");
        origin = in.nextLine();

        System.out.println("How old are you?");
        age = in.nextLine();

        System.out.println("You are " + age + " years old, and you are from " + origin + ".");

        System.out.println("What is your favorite thing to do?");
        favActivity = in.nextLine();
        System.out.println("Have fun next time you " + favActivity + "!");

        System.out.println("How much would you like to donate today?");
        donation = in.nextLine();
        System.out.println("Thank you! Your donation is $" + donation + ", have a nice day!");




    }
}
