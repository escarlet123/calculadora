import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contadorTemperaturas = 0;

        for (int i = 1; i <= 5; i++) { 
            System.out.println("Dame la temperatura " + i + ": ");
            double temperatura = leer.nextDouble();

            if (temperatura > 35.0) {
                contadorTemperaturas++;
            }
        }

        // ✅ Se muestra el resultado y se cierra el scanner AFUERA del ciclo for
        System.out.println("Número total de temperaturas mayores a 35°C: " + contadorTemperaturas);
        leer.close(); 
    }
}
