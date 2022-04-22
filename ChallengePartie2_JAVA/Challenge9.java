package ChallengePartie2_JAVA;
import java.util.*;
public class Challenge9 {
    


    public static void displayEvenIndex(ArrayList list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> liste = new ArrayList<Integer>();
    
        int[] nbrs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    
        for (int i = 0; i < nbrs.length; i ++)
        {
            liste.add(nbrs[i]);
        }
        displayEvenIndex(liste);
    }
}


//affiche les entiers aux index pairs de la liste passée en argument.
