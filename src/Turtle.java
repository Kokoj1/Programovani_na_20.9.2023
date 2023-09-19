    public class Turtle extends Animal {
        private Lives lives;
        public Turtle(String name, int age) {
            super(name, age);
        }

        public void setLives(Lives lives) {
            this.lives = lives;
        }
        public String toString() {

            return "Turtle{name=" + getName() + " age=" + this.getAge() + " length of life=" + this.lives + "'}";
        }
        public String introduceyourself() {
            return String.format("Želva se jmenuje %s a je jí %d.", this.getName(), this.getAge());
        }
    }

