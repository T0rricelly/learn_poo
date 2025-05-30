import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Instanciando a la persona 1
        Person personOne  = new Person();
        personOne.name = "Santiago";
        personOne.last_name = "Torres";
        personOne.age = 18;

        // Instanciar el objeto carrera 1
        Master masterOne = new Master();
        masterOne.name = "Analisis y desarrollo de software";
        masterOne.duration = 2;
        masterOne.inProgress = true;

        // Instanciando a la persona 2
        Person personTwo  = new Person();
        personTwo.name = "Alfredo";
        personTwo.last_name = "Alvarez";
        personTwo.age = 62;

        // Instanciar el objeto carrera 2
        Master masterTwo = new Master();
        masterTwo.name = "Ingenieria de software";
        masterTwo.duration = 5;
        masterTwo.inProgress = false;




        System.out.println(personOne.last_name + ", " + personOne.name + " tiene " + personOne.age);
        System.out.println(personTwo.last_name + ", " + personTwo.name + " tiene " + personTwo.age);


        System.out.println(personOne.giveCompletName() + " tiene " + personOne.age);
        System.out.println(personOne.sendGreeting("santiago"));

    }
}