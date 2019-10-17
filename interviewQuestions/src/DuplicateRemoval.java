import java.util.Arrays;

//To remove duplicate characters within a string 

public class DuplicateRemoval
{
    private String word;
    public DuplicateRemoval(String input)
    {
        word = input;
    }


    public String remove()
    {   
        

        for(int i = 0; i < word.length(); i++)
        {
            for(int j = 0; j < word.length(); j++)
            {
                if(word.charAt(i) == word.charAt(j))
                {
                    System.out.println("Yep");
                }
                
            }
           
        }

        
        return null;
    }



}