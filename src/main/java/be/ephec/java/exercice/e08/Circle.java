package be.ephec.java.exercice.e08;

public class Circle extends Shape{

    @Override

    public void efface()
    {
        System.out.println("Je suis un cercle et je m'efface");
    }
    @Override
    public void affiche()
    {
        System.out.println("Je suis un cercle et je m'affiche");
    }
}
