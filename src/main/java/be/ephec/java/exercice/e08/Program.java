package be.ephec.java.exercice.e08;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random rng = new Random();
        int number;
        Shape[] tab = new Shape[10];
        for (int i = 0; i < tab.length; i++){
            number = rng.nextInt(3);
            if (number == 0)
            {
                tab[i] = new Triangle();
            }
            else if (number == 1)
            {
                tab[i] = new Square();
            }
            else tab[i] = new Circle();
        }

        for (int i = 0; i < tab.length; i++) {
            tab[i].affiche();
            tab[i].efface();
        }
    }
}
