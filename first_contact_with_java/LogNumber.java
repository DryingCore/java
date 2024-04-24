import java.util.Scanner;

public class LogNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("Você digitou: " + numero);
        
        // Feche o scanner para liberar os recursos associados
        scanner.close();
    }
}
