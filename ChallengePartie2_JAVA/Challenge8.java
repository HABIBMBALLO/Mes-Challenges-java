package ChallengePartie2_JAVA;
    import java.util.List;
import java.util.ArrayList;

public class Challenge8 {

    public static ArrayList reverse(ArrayList<Integer> liste)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (Integer i: liste)
        {
                res.add(0, i);
        }
        return res;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> liste = new ArrayList<Integer>();
    
        int[] nbrs = {1, 2, 3, 4, 5, 6, 7};
    
        for (int i = 0; i < nbrs.length; i++)
        {
            liste.add(nbrs[i]);
        }
    
        ArrayList<Integer> res = reverse(liste);
        System.out.println(res);
    }
}
