import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;



class Busqueda {

    // metodo para realizar la búsqueda en anchura
    public static void bfs(Ciudad inicio, String objetivo) {
        // cola para almacenar el camino actual
        Queue<List<Ciudad>> cola = new LinkedList<>();

        // lista para almacenar todos los caminos encontrados
        List<List<String>> todosLosCaminos = new ArrayList<>();

        // inicializacion de la cola
        List<Ciudad> camino = new ArrayList<>();
        camino.add(inicio);
        cola.add(camino);

        // para ver si ahi caminos para explorar
        while (!cola.isEmpty()) {
            // camino actual de la cola
            camino = cola.poll();
            // obtener la ciudad en el extremo del camino
            Ciudad actual = camino.get(camino.size() - 1);

            // si llegamos al final se almacena el camino encontrado
            if (actual.nombre.equals(objetivo)) {
                List<String> nombresCamino = new ArrayList<>();
                for (Ciudad ciudad : camino) {
                    nombresCamino.add(ciudad.nombre);
                }
                todosLosCaminos.add(nombresCamino);
            }

            // todas las conexiones
            for (Conexion conexion : actual.conexiones) {
                // se crea un nuevo camino
                List<Ciudad> nuevoCamino = new ArrayList<>(camino);
                nuevoCamino.add(conexion.destino);
                cola.add(nuevoCamino);  // añadimos nuevo camino a la cola
            }
        }

        // mostramos los caminos si se encontraron
        if (!todosLosCaminos.isEmpty()) {
            System.out.println("busqueda en anchura - todos los caminos encontrados:");
            for (List<String> ruta : todosLosCaminos) {
                System.out.println(String.join(" -> ", ruta));
            }
        } else {
            System.out.println("no se encontró un camino hacia " + objetivo);
        }
    }
}