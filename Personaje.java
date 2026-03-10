class Personaje {
    String nombre;
    int vida;
    int ataque;

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void atacar(Personaje enemigo) {
        enemigo.vida -= this.ataque;
        System.out.println(nombre + " atacó a " + enemigo.nombre + " y le quitó " + ataque + " de vida.");
    }

    public void mostrarDatos() {
        System.out.println(nombre + " tiene " + vida + " de vida.");
    }
}
