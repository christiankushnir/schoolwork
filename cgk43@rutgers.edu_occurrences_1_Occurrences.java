public class Occurrences
{
  public static void main(String args[] )
  {
      // USED TO TEST YOUR METHOD
      double searchFor = 3.3;
      double[][] inputArray = {{1.2, 5.5, 4.4}, {3.3, 3.4, 7,7}, {8.2, 3.3, 4.1},{3.4, 2.2, 3.3}};
      int result = occurrences(searchFor, inputArray);
      System.out.println(result);
  }
    
  public static int occurrences(double target, double[][] array)
  {
      // WRITE YOUR CODE HERE
    int occurences = 0;
    for (int i=0; i<array.length;i++)
    {
      for (int j= 0; j<array[i].length;j++)
      {
        if (array[i][j]==target)
        {
          occurences++;
        }
      }
    }
    return occurences;









  }
}