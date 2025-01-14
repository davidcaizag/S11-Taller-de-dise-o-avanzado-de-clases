import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nombre;
    private String id;
    private List<Publicacion> publicacionesPrestadas;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.publicacionesPrestadas = new ArrayList<>();
    }

    public void prestarPublicacion(Biblioteca biblioteca, Publicacion publicacion) throws NoDisponibleException {
        if (publicacion instanceof Prestable) {
            Prestable prestable = (Prestable) publicacion;
            prestable.prestar();
            publicacionesPrestadas.add(publicacion);
        } else {
            throw new NoDisponibleException("La publicación no es prestable.");
        }
    }

    public void devolverPublicacion(Biblioteca biblioteca, Publicacion publicacion) throws NoPrestadoException {
        if (publicacionesPrestadas.contains(publicacion)) {
            Prestable prestable = (Prestable) publicacion;
            prestable.devolver();
            publicacionesPrestadas.remove(publicacion);
        } else {
            throw new NoPrestadoException("La publicación no está prestada por este usuario.");
        }
    }

    public void mostrarPublicacionesPrestadas() {
        System.out.println("Publicaciones prestadas por " + nombre + ":");
        for (Publicacion p : publicacionesPrestadas) {
            p.mostrarInformacion();
        }
    }
}
