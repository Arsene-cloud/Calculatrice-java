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

    public double diviser(double a, double b) {
        return a / b;
    }
    public double racineCarree(double a) {
    return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("CALCULATRICE");
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = clavier.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = clavier.nextDouble();

        Calculatrice calcul = new Calculatrice();

        double somme = calcul.addition(nombre1, nombre2);
        double difference = calcul.soustraction(nombre1, nombre2);
        double produit = calcul.multiplication(nombre1, nombre2);
        double quotient = calcul.diviser(nombre1, nombre2);
        double racine = calcul.racineCarree(nombre1);

        System.out.println("Addition : " + somme);
        System.out.println("Soustraction : " + difference);
        System.out.println("Multiplication : " + produit);
        System.out.println("Division : " + quotient);
        System.out.println("Racine carree du premier nombre : " + racine);
    }
}