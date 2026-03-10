import java.util.Scanner;

public class Mainn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Dulces que debemos encontrar
        String[] dulcesObjetivo = {"chocolate", "gomitas", "caramelo"};

        int encontrados = 0;

        System.out.println("🍬 Bienvenido al juego: Buscar Dulces");
        System.out.println("Debes encontrar 3 dulces escondidos.");

        while (encontrados < dulcesObjetivo.length) {

            System.out.print("Escribe el nombre de un dulce: ");
            String dulce = scanner.nextLine().toLowerCase();

            boolean correcto = false;

            for (int i = 0; i < dulcesObjetivo.length; i++) {

                if (dulce.equals(dulcesObjetivo[i])) {
                    System.out.println("✅ ¡Encontraste un dulce!");
                    dulcesObjetivo[i] = ""; // evitar repetir
                    encontrados++;
                    correcto = true;
                    break;
                }

            }

            if (!correcto) {
                System.out.println("❌ Ese dulce no es uno de los que buscamos.");
            }

            System.out.println("Dulces encontrados: " + encontrados + "/3");
        }

        System.out.println("🎉 ¡Ganaste! Encontraste todos los dulces.");
    }
}
