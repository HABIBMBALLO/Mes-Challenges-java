package ChallengePartie2_JAVA;
  import java.util.*;
public class Challenge7 {
  
  public static void main(String[] args) {
    
    List<String> languages = new ArrayList<String>();
  
    languages.add("PHP\n");
    languages.add("Java\n");
    languages.add("C++\n");
    languages.add("Python\n");
  
    //parcourir tout le arrayList
    for (String lang : languages) {
        System.out.println(lang);
    // System.out.println(languages);
 }
  // Récupérer le troisième élément
  String lang = languages.get(2);
  System.out.println("Le troisième élément: "+ lang);
  }
}

