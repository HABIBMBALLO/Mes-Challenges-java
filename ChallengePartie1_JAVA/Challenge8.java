package ChallengePartie1_JAVA;
import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        int b;
        int Temp;

        System.out.println("Entrer une valeur de a :");
        a = scan.nextInt();
        System.out.println("Entrer une valeur de b :");
        b = scan.nextInt();


        Temp = a ;
        a=b;
        b = Temp ;

        System.out.println("La permutation des valeurs a:" +a);
    
    }
}
