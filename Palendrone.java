/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palendrone;

import java.sql.Time;
import java.util.Scanner;

/**
 *
 * @author le nde
 */
public class Palendrone 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        for(;;)
        {
            System.out.print("Enter a word .. . .. to check wherether .. .. .. ");
            String word = input.nextLine();

            Time hi = new Time(2000);
            hi.setSeconds(200);
            
            int number = word.length(); 

            String[] clone = new String[number];

            char[] c =  new char[number];

            c = word.toCharArray();
            //System.out.println(c[1] + " this word " + word + " is of " + number + " caracter(s)\n\n\n");
            int ii = 0;
            //int jj = 0;

            for(int i = 0; i < number - 1; i++)
            {        
                int test = (number - 1) - i;
               // System.out.println(c[i] + "and" + c[test]);
                if( c[i] == c[test])
                {
                    ii = ii + 1;
                    
                    //   System.out.println("when correct " + ii);
                }
                else
                {
                    continue;
                    
                    //jj = jj + 1;
                    
                    //  System.out.println("when not correct " + ii);
                    
                }
            }
            if(ii == (number - 1))
                System.out.println( word + " is a paledrone" + hi);
            else
                System.out.println(word + " is not a paledrone");
        }
    }
}