import java.util.Scanner; //imported Scanner from library so that java knows I am using scanner
//java might think I am trying to initialise a new variable called "Scanner" if it is not imported
public class TempConv {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        double kelvin;
        //Declared variables as doubles, to maintain decimal precision
        //Declared Scanner so java knows that in.nextDouble means to pick up input as a double value

        // Ask user to input fahrenheit, scanner then picks up input and assigns it to fahrenheit variable
        System.out.print("What is the temperature in fahrenheit?");
        fahrenheit = in.nextDouble();

        // Calculations for Celsius and Kelvin are assigned to their corresponding variables
        // This makes printing them simple and easy, and there is little confusion as to where the numbers came from
        celsius = (fahrenheit - 32) * 5/9;
        kelvin = (celsius + 273.15);

        //Output the temperature and it's units, println is used to space the different units on different lines
        //I did this, so it would be easier to read the output, rather than having them pushed together
        System.out.println("The temperature is " + celsius + " degrees Celsius");
        System.out.println("The temperature is " +kelvin + " degrees Kelvin");

    }
}
