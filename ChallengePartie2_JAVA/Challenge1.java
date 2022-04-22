package ChallengePartie2_JAVA;
import java.util.*;
public class Challenge1 {
   public static void main(String args[]) {
      // créer la liste  
      List<String> liste = new ArrayList<String>();
      // remplir la liste
      liste.add("MBALLO");
      liste.add("BELLA");
      liste.add("EMMA");
      liste.add("DEO");
      liste.add("CHEIKH");
      
      System.out.println("Liste d'origine: " + liste);   
      // inverser la liste
      Collections.reverse(liste);
      System.out.println("Liste inversée: " + liste);          
   }    
}

