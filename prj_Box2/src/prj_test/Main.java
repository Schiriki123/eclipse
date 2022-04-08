package prj_test;

public class Main {

	public static void main(String[] args) {
		int x = 9;
		int y = 5;
		int z = 8;
		double dia = (z*(Math.sqrt(2)/2));
		int kath = (int) (dia*(Math.sqrt(2)/2));
		int x_leng = x + kath;
		int y_leng = y + kath;
		System.out.println(kath);
		System.out.println(dia);
		for (int i=0; i < y_leng; i++) 
		{
			for (int j=0;j < x_leng;j++) 								
			{
				if ((i==0 && j>=kath) && (j!=(x_leng-1))) 									//print for Top and bottom 
				{
					System.out.print("_");
				}
				else if((j==0 && i>=kath)) 	//print for left and right edge
				{
					System.out.print("|");
				}
				else if ((j==(x_leng-1) && i<y) && (i!=0)) {
					System.out.print("|");
				}
				else if (j==(x-1) && i>=kath) 							//print for inner left box side
				{
					System.out.print("|");
				}
				else if (j==(-i)+kath) 									//pint for first diagonal line
				{
					System.out.print("/");
				}
				else if (i==(kath-1) && (j<x) && (j!=0) && (j!=(x-1))) {//print for inner top box side
					System.out.print("_");
				}			
				else if ((j==(-i)+(kath+(x-1))) && (i<kath) && (i!=0))
				{
					System.out.print("/");
				}
				else if (j==(-i)+(kath+x+y-1)) 
				{
					System.out.print("/");
				}
				else if (i==(y_leng-1) && j<x) {
					System.out.print("_");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
