/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author: Christian Kushnir, cgk43@scarletmail.rutgers.edu, 188000659
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

	System.out.println("Enter the first integer");
	int first = IO.readInt();
	System.out.println("Enter the second integer");
	int second = IO.readInt();
	System.out.println("Enter the third integer");
	int third = IO.readInt();
	System.out.println("Enter the fourth integer");
	int fourth = IO.readInt();

	boolean check = false;

	if (first < second && second < third && third < fourth)
	{
		check = true;
	}
	IO.outputBooleanAnswer(check);
    }
}
