public class Person {
    // Atributos
    String name;
    String last_name;
    int age;
    String[] technology;
    boolean isStudent;
    Master master;
    // Constructor
    public Person(String name, String last_name, int age, String name_master, int durationMaster, Boolean inProgress){
          master = new Master(name_master, durationMaster, inProgress);
          this.name = name;
          this.last_name = last_name;
          this.age = age;
    }

    // Metodos
    public String giveCompletName() {
        return last_name + ", " + name;
    }
    public String sendGreeting(String name){
        if (age > 40) return "Hola señor " + name;
        return "Hola, " + name;
    }
}
