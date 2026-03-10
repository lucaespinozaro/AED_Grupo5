class Caballero extends Entidad {

    public Caballero(String nombre) {
        super(nombre, 130, 18);
    }

    public void ataqueEspecial(Entidad rival) {
        int dano = poder * 2;
        rival.salud -= dano;

        System.out.println(nombre + " realizó un ataque especial a " + rival.nombre + " causando " + dano + " de daño.");
    }
}
