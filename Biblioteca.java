import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Publicacion> publicaciones;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public void mostrarPublicaciones() {
        System.out.println("Publicaciones en la biblioteca:");
        for (Publicacion p : publicaciones) {
            p.mostrarInformacion();
        }
    }
}