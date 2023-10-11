import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[100];
        System.out.println("Enter elements for array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            if (a[i] == -1) {
                break;
            }
        }
        for (int i = a.length - 1; i > -1; i--) {
            if (a[i] > 0) {
                System.out.print(a[i] + " ");


            }
        }
    }
}