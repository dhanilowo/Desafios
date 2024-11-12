import java.util.Scanner;

/// Conversión ///

class Desafio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Euros a Dólares");

        int opcion = scanner.nextInt();
        float valor, resultado;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el valor en Celsius: ");
                valor = scanner.nextFloat();
                resultado = convertirCelsiusAFahrenheit(valor);
                System.out.println("Resultado: " + valor + "°C es igual a " + resultado + "°F");
                break;

            case 2:
                System.out.print("Ingrese el valor en Euros: ");
                valor = scanner.nextFloat();
                float valorCambio = 1.06f;
                resultado = convertirEurosADolares(valor, valorCambio);
                System.out.println("Resultado: " + valor + "€ es igual a $" + resultado);
                break;

            default:
                System.out.println("Opción inválida. Por favor seleccione una opción válida.");
                break;
        }

        scanner.close();
    }

    public static float convertirCelsiusAFahrenheit(float celsius) {
        return (celsius * 9/5) + 32;
    }

    public static float convertirEurosADolares(float euros, float valorCambio) {
        return euros * valorCambio;
    }
}
