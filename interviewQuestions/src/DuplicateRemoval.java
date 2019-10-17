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
         int i = 1, j = 1; 
        
        char arr[] = word.toCharArray(); 
        Arrays.sort(arr);
          
        
        while(j != arr.length)
        {
            if(arr[j-1]!=arr[j])
            {
                arr[i] = arr[j];
                i++;
            }
            j++;
        }
      
        
        word = new String(arr); 
        return word.substring(0,i);
    }

}