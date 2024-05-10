public class MatrixOps 
{
	public static double[][] multiply(double[][] A, double[][] B) 
 	{ 
 	// WRITE YOUR CODE HERE 
 		double [][] C = new double [A.length] [B[0].length];
 		for (int a=0; a < A.length; a++)
 		{
 			for (int b = 0; b < B.length; b++)
 			{
 				for (int c = 0; c < B[0].length; c++)
 					{
 						C[a][c]=C[a][c]+(A[a][b]*B[b][c]);

 					}
 			}
 		}
 	return C;
 	}


 	public static void main(String[] args)
 	{
 		double [][] A = {{0, -2, 0}, {3, -1, 4}};
 		double [][] B = {{1, 0}, {0, 3}, {-2, -1}};
 		double [][] C = multiply (A, B);
 		printMatrix(C);
 	}

 	public static void printMatrix(double[][] matrix)
 	{
 		for (int row = 0; row < matrix[0].length; row++)
 		{
 			for (int col = 0; col < matrix[0].length; col++)
 			{
 				System.out.println(matrix[row][col]);
 			}
 		}
 	}


}

