//To check if a string contains only digits , the string is presumed to be not null.

import java.util.regex.Pattern;

public class OnlyDigits
{
    String word;
    public OnlyDigits(String input)
    {
        word = input;
    }

    //The first digit check solution 
    //Uses parsing into a double with an exception clause as the solution 
    public Boolean digitCheck()
    {
        word = word.toLowerCase();
        boolean result = true ;
       
        try {
            Double num = Double.parseDouble(word);
        } catch (NumberFormatException e) {
            result = false;
        }
        if(result)
            System.out.println(word + " is a number");
        else
            System.out.println(word + " is not a number");
    
        return result;
    }

    //The second solution uses regex to check if a string contains only numbers 
    public Boolean digitCheck2()
    {
        Pattern p = Pattern.compile(".*[^0-9].*");

        if(p.matcher(word).matches())
        {
            return false;
        }
        return true;
    }


}