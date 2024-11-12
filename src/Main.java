//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

/// Calculadora ///

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        float n1 = scanner.nextFloat();

        System.out.print("Ingrese el segundo número: ");
        float n2 = scanner.nextFloat();

        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        int opcion = scanner.nextInt();

        float r = 0;

        switch (opcion) {
            case 1:
                r = n1 + n2;
                System.out.println("Resultado de la suma: " + r);
                break;
            case 2:
                r = n1 - n2;
                System.out.println("Resultado de la resta: " + r);
                break;
            case 3:
                r = n1 * n2;
                System.out.println("Resultado de la multiplicación: " + r);
                break;
            case 4:
                if (n2 != 0) {
                    r = n1 / n2;
                    System.out.println("Resultado de la división: " + r);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción inválida. Por favor, vuelva a intentarlo.");
                break;
        }
        scanner.close();
    }
}