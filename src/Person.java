public class Person {
    // Atributos
    private String name;
    private String last_name;
    private int age;

    // Constructor
    public Person(String name, String last_name, int age) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }

    // Metodos
    public String giveCompletName() {
        return last_name + ", " + name;
    }

    public String sendGreeting(String name) {
        if (age > 40) return "Hola señor " + name;
        return "Hola, " + name;
    }
    // Getters

    public int getAge() {
        return age;
    };
    public String getName(){
        return this.name;
    };
    public String getLast_name(){
        return this.last_name;
    };

    // Setters
    public void setAge(int age){
        this.age = age;
    };
    public void setName(String name){
        this.name = name;
    };
    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

}
