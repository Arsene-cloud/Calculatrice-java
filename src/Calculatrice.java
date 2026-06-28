import java.util.Scanner;

public class Calculatrice {

    public double addition(double a, double b) {
        return a + b;
    }
    public double soustraction(double a, double b) {
        return a - b;
    }
    public double multiplication(double a, double b) {
    return a * b;
    }

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        Calculatrice calcul = new Calculatrice();

        System.out.println("CALCULATRICE");

        System.out.print("Entrez le premier nombre : ");
        double nombre1 = clavier.nextDouble();

        System.out.print("Entrez le deuxieme nombre : ");
        double nombre2 = clavier.nextDouble();

        double produit = calcul.multiplication(nombre1, nombre2);
        double somme = calcul.addition(nombre1, nombre2);
        double difference = calcul.soustraction(nombre1, nombre2);

        System.out.println("Multiplication : " + nombre1 + " * " + nombre2 + " = " + produit);
        System.out.println("Addition : " + nombre1 + " + " + nombre2 + " = " + somme);
        System.out.println("Soustraction : " + nombre1 + " - " + nombre2 + " = " + difference);

        clavier.close();
    }
}