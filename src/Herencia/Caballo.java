package Herencia;

public class Caballo extends HerenciaAnimales {
  
    public Caballo(String animal, String EspecieAnimal ){
        // Con super() asignamos la info heredada
        super(animal,EspecieAnimal);
    }
    // sobreescribe la informacion, esto es polimorfismo
    @Override
    public String EspecieAnimal(){
        return "Este "+ animal+ EspecieAnimal();
    }
}
