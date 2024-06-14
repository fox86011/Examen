public class Pasajero extends NormalyVip{
    String nombre;
    int edad;

    public Pasajero(String fecha, String ruta, String normal, String VIP, double costo, String nombre, int edad) {
        super(fecha, ruta, normal, VIP, costo);
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
