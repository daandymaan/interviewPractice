public class OnlyDigits
{
    String word;
    public OnlyDigits(String input)
    {
        word = input;
    }

    public Boolean digitCheck()
    {
        word = word.toLowerCase();
        char arr[] = word.toCharArray();
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


}