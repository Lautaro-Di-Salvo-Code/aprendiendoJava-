package Colecciones.Map;
import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {

        Map<String, Double> frutas = new HashMap<>();  


        // en los casos de los mapas, las llaves/key son Peras y manzanas
        // y los valores son las cifras
        //{Peras=5.23, Manzanas=4.5}

        frutas.put("Manzanas", 4.5);
        frutas.put("Peras", 5.23);
        System.out.println(frutas);
        // KeySet me da un arreglo con las llaves
        for (String e : frutas.keySet()) {
            // con los get() se pueden obtener los valores
            System.out.println(e + " " + frutas.get(e) );
        }

        System.out.println(frutas.containsKey("Manzanas"));
    }
}   
