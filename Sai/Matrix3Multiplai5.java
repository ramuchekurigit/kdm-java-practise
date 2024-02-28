
public class Matrix3Multiplai5 
{

	public static void main(String[] args) 
	{
		int[][] Matrix= {
				{10,20,30,40,50},
				
				{60,70,80,90,99},
				
				{91,92,93,94,95}
				};
		
		
		System.out.print("Matrix:");
		
		for(int i=0;i<Matrix.length;i++)
		{
			for(int j=0;j<Matrix[i].length;j++)
			{
				System.out.print(Matrix[i][j] +" ");
			}
			System.out.println();
		}
	

	}

}
