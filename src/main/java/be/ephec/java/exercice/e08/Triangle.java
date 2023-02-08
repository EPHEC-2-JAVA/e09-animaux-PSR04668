package be.ephec.java.exercice.e08;

public class Triangle extends Shape{
    @Override
    public void efface()
    {
        System.out.println("Je suis un triangle et je m'efface");
    }
    @Override
    public void affiche()
    {
        System.out.println("Je suis un triangle et je m'affiche");
    }
}
