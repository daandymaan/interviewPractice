//Determine if a string is a palindrome

public class Palindrome 
{
    //Palindrome empty contructor method
    public Palindrome()
    {

    }
    
    //Method to check if word entered is a palindrome 
    public boolean isPalindrome(String word)
    {
        //Initial check to see if word is null
        if(word == null)
        {
            return false;
        }

        //Edge case to make sure all letters are in the same case
        String wordConverted = word.toLowerCase();
        
        //For loop to check all letters are the same from start to finish 
        for(int i = wordConverted.length()-1,y = 0; i > 0 ; i--,y++)
        {
            //Checks to see if each letter is equal from front to back 
           if( wordConverted.charAt(i) != wordConverted.charAt(y))
           {
               return false;
           }
        }
        //Returns true if it passes each test 
        return true; 
    }

    
}
