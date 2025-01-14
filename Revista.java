public class Revista extends Publicacion {
    private int numEdicion;

    public Revista(String titulo, String autor, int numEdicion) {
        super(titulo, autor);
        this.numEdicion=numEdicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista" + titulo + "Autor" + autor + "Edicion" + numEdicion);
    }

}
