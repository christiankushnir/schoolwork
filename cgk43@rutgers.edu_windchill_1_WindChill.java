/*************************************************************************
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill 35.0 10.0
 *
 *  @author:Christian Kushnir, cgk43@scarletmail.rutgers.edu, 188000659
 *
 *  That takes two double command-line arguments temperature and velocity 
 *  and prints the wind chill (a double) according to the following:
 *
 *  w = 35.74 + 0.6215 * T + (0.4275 * T - 35.75) v^0.16
 *
 *  % java WindChill 35.0 10.0
 *  27.445420765619037
 *
 *  The formula is not valid if T is larger than 50 in absolute value or if 
 *  v is larger than 120 or less than 3.
 *
 *  Assume the inputs are valid values
 *
 *
 *************************************************************************/

public class WindChill {

    public static void main(String[] args) {

	System.out.println("What is the temperature?");
	double T = IO.readDouble();
	System.out.println("What is the wind velocity?");
	double v = IO.readDouble();
	double w=0;

	if (T <= 50.0 && T >= -50.0)
	{
		w = 35.74 + 0.6215 * T + (0.4275 * T - 35.75)*(Math.pow(v,0.16));
	}
	else
	{
		IO.reportBadInput();
	}

	IO.outputDoubleAnswer(w);
    }
}
