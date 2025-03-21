import java.util.List;
import java.util.ArrayList;


class Ciudad {
    String nombre;
    List<Conexion> conexiones;

    // constructor de mi clase ciudad
    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.conexiones = new ArrayList<>();
    }

    // metodo para agregar una conexión entre ciudades
    public void agregarConexion(Ciudad destino, int costo) {
        conexiones.add(new Conexion(destino, costo));
    }
}
