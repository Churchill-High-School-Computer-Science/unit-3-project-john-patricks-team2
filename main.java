import java.util.Scanner;
public class main {

    
 
    public static void main(String []args) {
    Scanner s = new Scanner(System.in); 
   
    String word = "pizza";
    String a = "p";
    String b = "i";
    String c = "z";
    String d = "z";
    String e = "i";
    System.out.println("welcome to wordle please import each letter one by one ");
    System.out.print("import the first letter ");
    String v = s.next();
    
    System.out.print("import the second letter ");
    String w = s.next();
    
    System.out.print("import the third letter ");
    String x = s.next();
    
    System.out.print("import the fourth letter ");
    String y = s.next();
    
    System.out.print("import the fifth letter ");
    String z = s.next();
    
    String j = v + w + x + y + z;
    
    if (j.equals("pizza"))
    {
        System.out.print("\u001b[32myou guessed the word correct pizza");
    }

    else if(v.equals("p"))
    {
        System.out.println("\u001b[32m p is in the right location");
        
        if(w.equals("i"))
        {
            System.out.println("\u001b[32m i is in the right location");
        }
        
        else if(w != ("i"))
        {
            System.out.println("\u001b[31m" + w + "\u001b[31m is in the wrong location or not in the word");
        }
        
       
        
        
        
        
        if(x.equals("z"))
        {
        System.out.println("\u001b[32m z is in the right location");
        }
        
        else if(x !=("z"))
        {
        System.out.println("\u001b[31m" + x + "\u001b[31m is in the wrong location or not in the word");
        }
        
        if(y.equals("z"))
        {
        System.out.println("\u001b[32m z is in the right location");
        }
        
        else if(y != ("z"))
        {
        System.out.println("\u001b[31m" + y + "\u001b[31m is in the wrong location or not in the word");
        }
        
        if(z.equals("a"))
        {
        System.out.println("\u001b[32m a is in the right location");
        }
        
        
       else if(z != ("a"))
        {
            System.out.println("\u001b[31m" + z + "\u001b[31m is in the wrong location or not in the word"); 
        }
        else
        {
            System.out.print("you guessed the word incorrect");
        }
    }
    
        else if(v != ("p"))
        {
            System.out.println("\u001b[31m" + v + "\u001b[31m is in the wrong location or not in the word");
            
            if(w.equals("i"))
            {
                System.out.println("\u001b[32m i is in the right location");
            }
            
            else if(w != ("i"))
            {
                System.out.println("\u001b[31m" + w + "\u001b[31m is in the wrong location or not in the word");
            }
            
            if(x.equals("z"))
            {
            System.out.println("\u001b[32m z is in the right location");
            }
            
            else if(x !=("z"))
            {
            System.out.println("\u001b[31m" + x + "\u001b[31m is in the wrong location or not in the word");
            }
            
            if(y.equals("z"))
            {
            System.out.println("\u001b[32m z is in the right location");
            }
            
            else if(y != ("z"))
            {
                System.out.println("\u001b[31m" + y + "\u001b[31m is in the wrong location or not in the word");
            }
            
            if(z.equals("a"))
            {
            System.out.println("\u001b[32m a is in the right location");
            }
            
            if(z != ("a"))
            {
                System.out.println("\u001b[31m" + z + "\u001b[31m is in the wrong location or not in the word");
            }
            
            else
            {
                System.out.print("you guessed the word incorrect");
            }
            
        
        }
    
    
    
    else
    {
        System.out.print("you guessed the word incorrect");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    }
    }
 