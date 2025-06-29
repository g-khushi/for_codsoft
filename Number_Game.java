import java.util.*;
public class Number_Game{
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        Random random = new Random();
    
       

        //loop for guessing
while(true)
     {
          int number= random.nextInt(100)+1;    //this will generate random number from 1 to 100
          int c=0;
                  

    while(true)
    {
        System.out.print("enter the number: ");    //input
        int user_number= obj.nextInt();

        if(user_number<1 || user_number>100)     //range
        {
            System.out.println("Number entered is out of range");
            continue;
        }

        if(user_number== number)                 //conditions
        {
            System.out.println("Hurray!! You Guessed");
            c++;
            break;
        }
        else if(user_number < number)
        {
            System.out.println("Low");
            c++;
        }
        else
        {
            System.out.println("High");
            c++;
        }
        if(c==10)                                   //rounds
        {
            System.out.println("Guesses are over");
            break;
        }
     }
        
        //scorecard

        if(c==1)
        {
            System.out.println("Best guess");
          
        }
        else if( c>1 && c<=5)
        {
            System.out.println("Good");
            
        }
        else
        {
            System.out.println("Bad guess");
            System.out.println("The number was: "+number);
            
        }
 
        System.out.println("Number of rounds it took: "+c);

        //restart game
        obj.nextLine();
        System.out.println("Wants to play again:  ");
        String ans= obj.nextLine();

        if(!ans.equalsIgnoreCase("yes"))
        {
            System.out.println("Thankyou for playing ");
            break;
        }
    }
    
}
}