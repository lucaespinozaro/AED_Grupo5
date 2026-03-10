class Hechicero extends Entidad {

    public Hechicero(String nombre) {
        super(nombre, 90, 22);
    }

    public void magia(Entidad rival) {
        int dano = poder + 12;
        rival.salud -= dano;

        System.out.println(nombre + " lanzó magia contra " + rival.nombre + " y causó " + dano + " de daño.");
    }
}
