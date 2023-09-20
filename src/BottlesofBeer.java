import java.util.Scanner;
public class BottlesofBeer {
    public static void main(String[] args) {
        int numberBeer;
        int originalBeer;
        Scanner in = new Scanner(System.in);

        System.out.println("How many bottles of beer?");
        numberBeer = in.nextInt();
        originalBeer = numberBeer;

        while (numberBeer > 0) {

            if (numberBeer == 1) {
                System.out.println(numberBeer + " bottle of beer on the wall, " + numberBeer + " bottle of beer!");
                numberBeer--;
                System.out.println("Take one down, pass it around, " + numberBeer + " bottles of beer on the wall!");
            } else if (numberBeer == 2) {
                System.out.println(numberBeer + " bottles of beer on the wall, " + numberBeer + " bottles of beer!");
                numberBeer--;
                System.out.println("Take one down, pass it around, " + numberBeer + " bottle of beer on the wall!");
            } else {
                System.out.println(numberBeer + " bottles of beer on the wall, " + numberBeer + " bottles of beer!");
                numberBeer--;
                System.out.println("Take one down, pass it around, " + numberBeer + " bottles of beer on the wall!");
            }}

            System.out.println(numberBeer + " bottles of beer on the wall, " + numberBeer + " bottles of beer!");
            System.out.println("Go to the store and buy some more, " + originalBeer + " bottles of beer on the wall!");


        }
    }
