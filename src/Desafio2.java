import java.util.Scanner;
import java.util.Random;

/// Adivinanza ///

public class Desafio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int intento = 0;
        int numeroUsuario;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He pensado en un número entre 1 y 100. ¿Puedes adivinar cuál es?");

        do {
            System.out.print("Ingresa tu adivinanza: ");
            numeroUsuario = scanner.nextInt();
            intento++;
                if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El número es mayor. ¡Intenta de nuevo!");
                } else if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El número es menor. ¡Intenta de nuevo!");
                } else {
                    System.out.println("¡Felicidades! Adivinaste el número en " + intento + " intentos.");
                }
            } while (numeroUsuario != numeroAleatorio);

            scanner.close();
    }
}
