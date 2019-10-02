//Determine if a string is a palindrome

public class Palindrome 
{
    private String word1 = "racecar";
    private String word2 = "Navan";
    private String word3 = "danSimons";
    private String randomWord;

    public Palindrome()
    {

    }
    

    public boolean isPalindrome(String word)
    {
        
        if(word == null)
        {
            return false;
        }
        String wordConverted = word.toLowerCase();
        
        for(int i = wordConverted.length()-1,y = 0; i > 0 ; i--,y++)
        {
           if( wordConverted.charAt(i) != wordConverted.charAt(y))
           {
               return false;
           }
        }
        return true; 


    }

    
}
