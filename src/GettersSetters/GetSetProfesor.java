package GettersSetters;
public class GetSetProfesor {

    private String profesor;
    private int edad;

    // Contructor
    public GetSetProfesor(String profesor, int edad){
        this.profesor = profesor;
        this.edad = edad;
    }

    public String DescripcionProfe(){
        return "El profe se llama " + profesor + "y tiene "+ edad + " años";
    }
    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
   
}
