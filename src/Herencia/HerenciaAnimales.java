package Herencia;
public class HerenciaAnimales {
     String animal;
     String Especie;

     // Constructor
     public HerenciaAnimales(String animal, String Especie){
          this.animal = animal;
          this.Especie = Especie;
     }

    public String EspecieAnimal (){
     return "El "+ animal + " es de Especie" + Especie;
    }
     
}
