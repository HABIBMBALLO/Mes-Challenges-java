package ChallengePartie1_JAVA;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int a  ;

        System.out.println("Entrer la valeur correspondant:");
        a=scan.nextInt();

        for (int i = 1; i <10; i++) {
            System.out.println(i + " x " +  a  + "=" +i*a);
    }
}
}
