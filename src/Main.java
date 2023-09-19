
import java.util.Scanner;
public class Main {


    public Main() {
        }

        public static void main(String[] args) {
            Scanner cs = new Scanner(System.in);
            System.out.println("Napište jméno želvy:");
            String nameTurtle = cs.nextLine();
            System.out.println("Napište věk želvy:");
            int ageTurtle = Integer.parseInt(cs.nextLine());
            System.out.println("Napište jméno ještěra");
            String h = cs.nextLine();
            System.out.println("Napište věk ještěra:");
            int ageLizard = Integer.parseInt(cs.nextLine());

            Turtle myTurtle = new Turtle(nameTurtle, ageTurtle);
            System.out.println(myTurtle.introduceyourself());
            if(ageTurtle>40) {
                myTurtle.setLives(Lives.LONG);
            }
            else{myTurtle.setLives(Lives.SHORT);}
            Lizard myLizard = new Lizard(h, ageLizard);
            if(ageLizard>10) {
                myLizard.setLives(Lives.LONG);
            }
            else{myLizard.setLives(Lives.SHORT);}
            System.out.println(myLizard.introduceyourself());
            System.out.println();
            System.out.println(myTurtle);
            System.out.println(myLizard);

        }

    }