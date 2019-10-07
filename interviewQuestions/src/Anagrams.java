import java.util.Arrays;

//Check if two strings are anagrams of each other 


public class Anagrams
{
    private String word1;
    private String word2;
    public Anagrams(String word1, String word2)
    {
        this.word1 = word1;
        this.word2 = word2;

    }

    public boolean anagramChecker()
    {

        char temp[];
        char temp2[];
        int i = 0;

        temp = word1.toLowerCase().toCharArray();
        temp2 = word2.toLowerCase().toCharArray();

        

        Arrays.sort(temp);
        Arrays.sort(temp2);

        System.out.println(temp);
        System.out.println(temp2);

        while(i != word1.length() || i != word2.length() )
        {
            if(temp[i] != temp2[i])
            {
                return false;
            }
            else
            {
                i++;
            }
        }



        return true;
    }


}