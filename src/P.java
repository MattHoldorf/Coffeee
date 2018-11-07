import java.util.Scanner;

public class P
{

    public P()
    {
        
    }
    
    public static boolean isP(String str)
    {
        str = str.toLowerCase();
        if (str.length() <= 1)
        {
            return true;
        }
        else if (str.charAt(0) != str.charAt(str.length()-1))
        {
            return false;
        }
        else 
        {
            return isP(str.substring(1, str.length()-1));
        }
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        boolean valid = true;
        while (valid)
        {
            System.out.println("Is this a magic word");
            String given = s.nextLine();
            
            if (given.equals("stop"))
            {
                valid = false;
            }
            
            System.out.println(">" + given + "< is P" + isP(given));
            
        }
        s.close();
    }

}
