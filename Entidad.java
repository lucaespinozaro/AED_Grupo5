class Entidad {

    String nombre;
    int salud;
    int poder;

    public Entidad(String nombre, int salud, int poder) {
        this.nombre = nombre;
        this.salud = salud;
        this.poder = poder;
    }

    public void golpear(Entidad rival) {
        rival.salud = rival.salud - this.poder;
        System.out.println(nombre + " golpeó a " + rival.nombre + " y le quitó " + poder + " puntos de salud.");
    }

    public void verEstado() {
        System.out.println("Estado de " + nombre + ": " + salud + " puntos de salud.");
    }
}
