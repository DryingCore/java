package is_even;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Is not even");
        }
        scanner.close();
    }
}
