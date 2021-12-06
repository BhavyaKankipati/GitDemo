package collections;

public class MutiDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		System.out.println(a[1][2]);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
		
		//intialization of arrays
		int b[][]= {{2,4,5},{1,2,3},{5,2,1}};
		

	}

}
