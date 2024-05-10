/*************************************************************************
 *  Compilation:  javac WCS111FM.java
 *  Execution:    java WCS111FM 53
 *
 *  The program takes the number of hours the listener spends
 *  programming as an int argument. Based on the number of hours spent
 *  programming, display the listener prize
 *
 *  @author: Christian Kushnir, cgk43@scarletmail.rutgers.edu, 188000659
 *
 *  % java WCS111FM 3
 *  T-shirt
 *
 *  % java WCS111FM 9
 *  Laptop
 *  TV
 * 
 *  % java WCS111FM 0
 *  Nothing
 *************************************************************************/

public class WCS111FM {

    public static void main(String[] args) {

    	
    	int h = Integer.parseInt(args[0]);

    	if (h < 0)
    	{
    		System.out.println("Illegal input");
    		
    	}
    	else if (h == 0)
    	{
    		System.out.println("Nothing");
    	}
    	else if (h >= 1 && h <= 5)
    	{
    		System.out.println("T-shirt");
    	}
    	else if (h >=6 && h<= 400)
    	{
    		if (h%10==9)
    		{
    			System.out.println("Laptop");
    		}
    		if (h%2==0) 
    		{
    			System.out.println("Hat");
    		}
    		if (h%3==0)
    		{
    			System.out.println("TV");
    		}
    	}
    	else if (h>400)
    	{
    		System.out.println("Cat");
    	}

    }

}
