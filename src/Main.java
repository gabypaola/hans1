public class Main {
    public static void main(String[] args) {
        //creacion del grafo
        Grafo grafo = new Grafo();

        // ciudades
        String[] ciudades = {"New York", "Toronto", "Chicago", "Calgary", "Denver", "Los Angeles", "Houston", "URB"};
        for (String ciudad : ciudades) {
            grafo.agregarCiudad(ciudad);
        }

        // conexion de ciudades
        grafo.conectarCiudades("New York", "Toronto", 5);
        grafo.conectarCiudades("New York", "Chicago", 4);
        grafo.conectarCiudades("New York", "Denver", 8);
        grafo.conectarCiudades("Toronto", "Calgary", 7);
        grafo.conectarCiudades("Toronto", "Los Angeles", 12);
        grafo.conectarCiudades("Chicago", "Denver", 3);
        grafo.conectarCiudades("Denver", "Los Angeles", 6);
        grafo.conectarCiudades("Denver", "Houston", 4);
        grafo.conectarCiudades("Houston", "Los Angeles", 5);
        grafo.conectarCiudades("Houston", "URB", 3);

        // realizamos la búsqueda de anchura desde "New York" hacia "Los Angeles"
        System.out.println("Búsqueda en anchura:");
        Busqueda.bfs(grafo.getCiudad("Denver"), "Los Angeles");
    }
}