//Count the amount of constants or vowels in an string 
//The string is taken to not be null 


public class VowelConstonant
{

    private String input;

    //Constructor to set the word input to the local variable
    public VowelConstonant(String word)
    {
        input = word;
    }

    //Method to count both vowels and constonants
    public void countMethod()
    {
        //A string array with all vowels within 
        String vowels[] = {"a","e","i","o","u"};
        int vowelcount = 0;
        int constonantcount = 0;
        int wordcount = 0;
        
        input = input.toLowerCase();

        //A for each loop cycling through all arrays 
        for(String word : vowels)
        {
            //If the input contains a vowel it counts it 
            if(input.contains(word))
            {
                vowelcount++;
            }
            else
            {
                //else it counts the constonants 
                constonantcount++;
            }
        }

        
        //Finally the method prints out both the constonats and vowels it counted 
        System.out.println("Vowel Count: "+ vowelcount);
        
        System.out.println("Constonant Count: "+ constonantcount);
    }

}