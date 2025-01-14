class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(String titulo, String autor) {
        super(titulo, autor);
        this.prestado = false;
    }

    @Override
    public void prestar() throws NoDisponibleException {
        if (prestado) {
            throw new NoDisponibleException("El libro ya está prestado.");
        }
        prestado = true;
    }

    @Override
    public void devolver() throws NoPrestadoException {
        if (!prestado) {
            throw new NoPrestadoException("El libro no estaba prestado.");
        }
        prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo + " - Autor: " + autor + " - Prestado: " + (prestado ? "Sí" : "No"));
    }
}
