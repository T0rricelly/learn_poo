public class Person {
    // Atributos
    String name;
    String last_name;
    int age;
    String[] technology;
    boolean isStudent;

    // Metodos
    public String giveCompletName() {
        return last_name + ", " + name;
    }
    public String sendGreeting(String name){
        if (age > 40) return "Hola señor " + name;
        return "Hola, " + name;
    }
}
