public class AppendRec 
{
	public static void main (String[] args) 
	{
		System.out.println(appendNTimes("tea", 0));
		System.out.println(appendNTimes("t", 0));
		System.out.println(appendNTimes("tea", 1));
		System.out.println(appendNTimes("tea", 4)); 
	} 
	public static String appendNTimes (String original, int n) 
	{ 
		
		if (n==0)
		{
			return original;
		}
		return original + appendNTimes(original, n-1);



	} 
} 