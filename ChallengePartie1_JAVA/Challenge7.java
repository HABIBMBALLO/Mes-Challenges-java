package ChallengePartie1_JAVA;
import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c;
        int moyenne;

        System.out.println("Entrer une valeur donne pour a : ");
        a=scan.nextInt();
        System.out.println("Entrer une valeur doonne pour b : ");
        b=scan.nextInt();
        System.out.println("Entrer une autre valeur donne pour c : ");
        c=scan.nextInt();

        moyenne = (a+b+c)/3;

        System.out.println("La moyenne des valeurs est :" +moyenne);
        
    }
}
