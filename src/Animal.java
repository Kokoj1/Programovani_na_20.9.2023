public class Animal {
    private final String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "Animal{name='" + this.name + "', age=" + this.age + "}";
    }

    public String getName() {
        return this.name;
    }
}
