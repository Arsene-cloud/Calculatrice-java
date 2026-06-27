import java.util.Scanner;

public class Calculatrice {

    public double addition(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("CALCULATRICE ");

        System.out.print("Entrez le premier nombre : ");
        double nombre1 = clavier.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = clavier.nextDouble();

        Calculatrice calcul = new Calculatrice();

        double resultat = calcul.addition(nombre1, nombre2);

        System.out.println("Le résultat est : " + resultat);

        clavier.close();
    }
}