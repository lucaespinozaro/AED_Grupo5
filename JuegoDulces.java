import java.util.Scanner;

public class JuegoDulces
{

  private Scanner scanner;
  private Dulces dulces;
  private int encontrados;

  public JuegoDulces()
  {
    scanner = new Scanner(System.in);
    dulces = new Dulces();
    encontrados = 0;
  }

  public void iniciar()
  {

    System.out.println("Buscar Dulces");
    System.out.println("Debes encontrar 3 dulces escondidos");

    while (encontrados < dulces.totalDulces()) {

      System.out.print("Escribe el nombre de un dulce: ");
      String dulce = scanner.nextLine().toLowerCase();

      if (dulces.verificarDulce(dulce)) {
        System.out.println("Encontraste un dulce");
        encontrados++;

      } else {

        System.out.println("Ese dulce no es uno de los que buscamos");

      }

      System.out.println("Dulces encontrados: " + encontrados + "/3");

    }
    System.out.println(" Encontraste todos los dulces.");
  }

}
