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
        //index variables
        int i = 1, j = 1; 
        
        //string to character array
        char arr[] = word.toCharArray(); 
        //sorting array
        Arrays.sort(arr);
        
        //while loop till array length is reached
        while(j != arr.length)
        {
            //if the previous letter and the current letter are not the same
            //Put it in the current part of the array
            if(arr[j-1]!=arr[j])
            {
                arr[i] = arr[j];
                i++;
            }
            j++;
        }
        
        //Creates a String out of the array 
        word = new String(arr); 
        //Returns the String
        return word.substring(0,i);
    }

    //CODE FROM STACK OVERFLOW NOT MINE
       public String unique() 
    { 
        String str = new String(); 
        int len = word.length(); 
          
        // loop to traverse the string and 
        // check for repeating chars using 
        // IndexOf() method in Java 
        for (int i = 0; i < len; i++)  
        { 
            // character at i'th index of s 
            char c = word.charAt(i); 
            //System.out.println(c+":"+str.indexOf(c));
            System.out.println();
            // if c is present in str, it returns 
            // the index of c, else it returns -1 
            //Dan's commment I did not realise there is a string function for index of in java 
            if (str.indexOf(c) < 0) 
            { 
                
                // adding c to str if -1 is returned 
                str += c; 
            } 
        } 
          
        return str; 
    }
}