import java.util.Map;
import java.util.HashMap;


class Grafo {
    Map<String, Ciudad> ciudades;

    // constructor de la clase Grafo
    public Grafo() {
        ciudades = new HashMap<>();
    }

    // metodo para agregar una ciudad
    public void agregarCiudad(String nombre) {
        ciudades.putIfAbsent(nombre, new Ciudad(nombre));
    }

    // metodo para conectar dos ciudades con costos
    public void conectarCiudades(String origen, String destino, int costo) {
        Ciudad ciudadOrigen = ciudades.get(origen);
        Ciudad ciudadDestino = ciudades.get(destino);
        if (ciudadOrigen != null && ciudadDestino != null) {
            ciudadOrigen.agregarConexion(ciudadDestino, costo);
        }
    }

    // metodo para obtener la ciudad por nombre
    public Ciudad getCiudad(String nombre) {
        return ciudades.get(nombre);
    }
}