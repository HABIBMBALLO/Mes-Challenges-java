package ChallengePartie1_JAVA;
import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a ;
        int f = 1 ;

        System.out.println("Entrer une valeur donnee de a :");
        a=scan.nextInt();

        for (int i = 1; i <= a; i++) {
            
            f = f*i; 
        }

        System.out.println("Le factoriel du nombre saisie est :" +f);

    }
}
