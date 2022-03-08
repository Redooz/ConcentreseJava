package controlador;

public class Usuario {
    private String acronimo;
    private String nombre;
    private int puntaje;

    public Usuario() {
    }

    public Usuario(String acronimo, String nombre, int puntaje) {
        this.acronimo = acronimo;
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Usuario{" + "acronimo=" + acronimo + ", nombre=" + nombre + ", puntaje=" + puntaje + '}';
    }    
}
