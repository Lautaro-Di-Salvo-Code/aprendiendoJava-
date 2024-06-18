package Colecciones;
import java.util.ArrayList;
// HashSet contiene los datos pero sin que estén ordenados
// import java.util.HashSet;
// Linked si que los ordena en el sentido que fueron agregados los valores
// import java.util.LinkedHashSet;
// import java.util.Set;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        

        List<String> autos = new ArrayList<>();
        autos.add("Lamborghini");
        autos.add("Torino");
        autos.add("Mustang");
        autos.add("Bugatti");
        // con set() podemos modificar el valor
        // autos.set(1, "Pagani");
        
        // con remove obviamente elimina el elemento en el Array
        // autos.remove(0);
        
        // con size() podemos ver la longitud numerica del array
        // System.out.println(autos.size());

        for (String string : autos) {
        System.out.println(string);
        }
    }
}
