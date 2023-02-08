package be.ephec.java.exercice.e09;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Animal[] tab = new Animal[10];

        Random nrg = new Random();
        int nb;
        for (int i = 0 ; i < tab.length; i++)
        {
            nb = nrg.nextInt(2);
            if (nb == 0){
            tab[i] = new Cat();}
            else tab[i] = new Dog();
        }
        for (int i = 0 ; i < tab.length; i++) {

           tab[i].makeNoise();
        }
    }
}
