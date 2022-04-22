package ChallengePartie2_JAVA;
import java.util.ArrayList;
import java.util.List;

public class Collections {
    
  public static void afficherListe(final String nom,
    final List<String> sousListe) {
    int i = 0;
    for (String element : sousListe) {
      System.out.format("%s  %2d : %s\n", nom, i, element);
      i++;
    }
  }

  public static void main(final String[] args) {
    List<String> liste = new ArrayList<String>();
    liste.add("dame");
    liste.add("emma");
    liste.add("libasse");
    liste.add("houleye");
    liste.add("kaba");
    
    List<String> sousListe = liste.subList(1, 4);
    afficherListe("sous liste", sousListe);
    System.out.println("");
   
    sousListe.remove(1);
    afficherListe("liste",liste);
    System.out.println("");
   
    afficherListe("sous liste", sousListe);
   
    System.out.println("");
    liste.remove(1);
    afficherListe("liste", liste);
    System.out.println("");
   
    afficherListe("sous liste", sousListe);
    System.out.println("");
  }

public static void reverse(List<String> liste) {
}
}

