import java.util.Scanner;

public class HillCipher
{
	
	public void  calcHillCipher(int key[][],int msg[][])
	{
		int i,j,k;
		int[][] Cipher=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(k=0;k<3;k++)
				{
					Cipher[i][j]+=key[i][k]*msg[k][j];
				}
			}
		}
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				Cipher[i][j]=Cipher[i][j]%26;
			}
		}
		
		System.out.println("Cipher = \n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(Cipher[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args)
	{
		HillCipher HC=new HillCipher();
		Scanner sc=new Scanner(System.in);
		int i,j;
		int[][] msg=new int[3][3];
		System.out.println("\n Please enter the message to be encoded in a 3x3 matrix below");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				msg[i][j]=sc.nextInt();
			}
		}
		
		int[][] key=new int[3][3];
		System.out.println("Please enter the key");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				key[i][j]=sc.nextInt();
			}
		}
		
		HC.calcHillCipher(key,msg);
	}
}