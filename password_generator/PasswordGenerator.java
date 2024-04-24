package password_generator;

import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    private static final String CHARACTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
    private static final SecureRandom random = new SecureRandom();

    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            password.append(CHARACTER.charAt(random.nextInt(CHARACTER.length())));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the length of the password?");
        int passLength = scanner.nextInt();
        System.out.println(generatePassword(passLength));
        scanner.close();
    }
}
