package Herencia;

public class Perro extends HerenciaAnimales  {

    public Perro(String animal, String EspecieAnimal){
        // Con super() asignamos la info heredada
        super(animal, EspecieAnimal);
    }
    // sobreescribe la informacion, esto es polimorfismo
    @Override
    public String EspecieAnimal(){
        return "Este "+ animal + " de raza "+ Especie;
   }
}
