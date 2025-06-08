// Extends sirve para especificar que gato hereda de animal
public class Cat extends Animal{



    public Cat(String name, int age){
        // Super sirve para asignar la informacion heredada
        super(name, age);
    }
    // Override sirve para sobrescribir un metodo
    @Override
    public String makeNoise(){
        return "Miau";
    }
}
