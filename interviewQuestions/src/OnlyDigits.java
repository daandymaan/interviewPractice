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
        char digits[] = {'1','2','3','4','5','6','7','8','9','0'};

        int index = 0;
        int i = 0;
        int common = 0;

        while(index != digits.length || i != arr.length || common != arr.length)
        {
            if(arr[i] != digits[index] )
            {
                System.out.println(arr[i] + "is not equal to " + digits[index] );
                index++;
                common++;
            }
            else
            {
                System.out.println(arr[i] + "is  equal to " + digits[index] );
                i++;
                common++;
            }
        }



        return true;
    }


}