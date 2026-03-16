public class Dulces
{
  private String[] dulcesObjetivo = {"chocolate", "gomitas", "caramelo"};

  public boolean verificarDulce(String dulce)
  {
    for (int i = 0; i < dulcesObjetivo.length; i++) {
      if (dulce.equals(dulcesObjetivo[i])) {
        dulcesObjetivo[i] = "";
        return true;
      }
    }

    return false;
  }

  public int totalDulces()
  {
    return dulcesObjetivo.length;
  }

}
