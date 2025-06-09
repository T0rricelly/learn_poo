public class Animal {
    String name;
    int age;
    int amount;
    static int countAnimals = 0;

    // Constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        this.amount = amount;
        countAnimals++;
    }

    // Metodo
    public String makeNoise(){
        return "Grrrr";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public static int getCountAnimals(){
        return countAnimals;
    }
}
