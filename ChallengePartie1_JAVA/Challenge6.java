package ChallengePartie1_JAVA;
import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        int r;
        double surface,perimetre, pi = 3.14;

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez le rayon du cercle svp Emma : ");
        r = scan.nextInt();

        surface = pi * r * r;

        perimetre = 2*pi*r;

        System.out.println("Le perimetre du cercle de Emma est " + perimetre + "La surface du cercle de Emma est : " +surface);
    }
}
