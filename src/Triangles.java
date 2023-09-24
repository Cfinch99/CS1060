import java.util.Scanner;

public class Triangles {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String again = "y";

        while (again.equals("y")) {
            //Entire program is fit within a while loop, so that the user can be asked if they want to do it again

            System.out.println("Enter number of rows: ");
            int rows = in.nextInt();

            while (rows < 1 || rows > 50){
                System.out.println("Enter a number between 1 and 50");
                rows = in.nextInt();
                // Short while loop to continue prompting the user for the correct input, if not correct the first time.
        }

         System.out.println("Enter character for triangle: ");
         char character = in.next().charAt(0);

         for (int a = 1; a <= rows; a++){
             // for loop for the number of rows

             for (int b = rows; b >= a; b--) {
                 System.out.print(" ");
                 //for loop to print the spaces between each character in the triangle
                }

             for (int b = 1; b <= a; b++){
                 System.out.print(character + " ");
                 //for loop to print the characters
                }

             System.out.println();
            //for printing a newline after each row, otherwise the characters would all be in the same row
            }
         System.out.println("Do you want to make another triangle? y or n");
         again = in.nextLine();
         again = in.nextLine();

         //Had to put two in.nextLine, I had a newline somewhere that kept eating my input and ending the program.
         //One of these eats the newline so the program will wait for input instead of ending.
        }
         System.out.println("Goodbye!");

    }}


