public class Juego {

    public static void main(String[] args) {

        Caballero c1 = new Caballero("Arthur");
        Hechicero h1 = new Hechicero("Gandalf");

        c1.verEstado();
        h1.verEstado();

        System.out.println("Batalla:");

        c1.golpear(h1);
        h1.magia(c1);
        c1.ataqueEspecial(h1);

        System.out.println("Resultados:");

        c1.verEstado();
        h1.verEstado();
    }
}
