import java.util.Random;
import java.util.Scanner;

public class AdivinaAdivinador {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; 
        int intento;
        int intentos = 0;

        System.out.println("Adivina el número:");
        System.out.println("He pensado un número entre 1 y 100.");
        System.out.println("Intenta adivinarlo.");

        do {

            System.out.print("Escribe tu número: ");
            intento = teclado.nextInt();

            intentos++;

            if (intento > numeroSecreto) {
                System.out.println("Muy alto. Intenta con un número más pequeño.");
            } 
            else if (intento < numeroSecreto) {
                System.out.println("Muy bajo. Intenta con un número más grande.");
            } 
            else {
                System.out.println("¡Correcto! Adivinaste el número.");
                System.out.println("Lo lograste en " + intentos + " intentos.");
            }

        } while (intento != numeroSecreto);

        teclado.close();
    }
}
