package Colecciones.List;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Vector;

public class Lists {
    public static void main(String[] args) {

        // List<String> personas = new ArrayList<>();
        Vector<String> personas = new Vector<>();
        personas.add("Gustavo");   
        personas.add("Matias");   
        personas.add("Sofia");   
        personas.add("Melina");   
        personas.add("Carlos");   

        personas.get(1);

        
        personas.add("Sebastian");
        personas.remove(0);


        for (String string : personas) {
            System.out.println(string);
        }

    }

}
