public class Lizard extends Animal {
    private Lives lives;
    public Lizard(String name, int age) {
        super(name, age);
    }

    public void setLives(Lives lives) {
        this.lives = lives;
    }
    public String toString() {
        return "Lizard{name=" + this.getName() + " age=" + this.getAge() + " length of life=" + this.lives + "'}";
    }
    public String introduceyourself() {
        return String.format("Ještěr se jmenuje %s a je mu %d.", this.getName(), this.getAge());
    }
}