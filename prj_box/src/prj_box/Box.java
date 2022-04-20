package prj_box;

public class Box {
	public int x;
	public int y;
	public int z;

	public Box() {

	}

	public Box(int pX, int pY, int pZ) {
		x = pX;
		y = pY;
		z = pZ;
	}

	public void showNum() {
		System.out.println("X is: " + x);
		System.out.println("Y is: " + y);
		System.out.println("Z is: " + z);
	}

	public void showBox(int pP) {
		double dia = (z * (Math.sqrt(2) / 2));
		int kath = (int) (dia * (Math.sqrt(2) / 2));
		int x_leng = x + kath;
		int y_leng = y + kath;
		switch (pP) {
		case 0:
			for (int i = 0; i < y_leng; i++) {
				for (int j = 0; j < x_leng; j++) {
					if ((i == 0 && j >= kath) || (i == (y_leng - 1) && j < x)) // print for Top and bottom
					{
						System.out.print("#");
					} 
					else if ((j == 0 && i >= kath) || (j == (x_leng - 1) && i < y)) // print for left and right edge
					{
						System.out.print("#");
					} 
					else if (j == (x - 1) && i >= kath) // print for inner left box line
					{
						System.out.print("#");
					} 
					else if (i == kath && j < x) // print for inner top box line
					{
						System.out.print("#");
					} 
					else if (j == (-i) + kath) // print for first diagonal line
					{
						System.out.print("/");
					} 
					else if ((j == (-i) + (kath + (x - 1))) && i < kath) // print for second diagonal line
					{
						System.out.print("/");
					} 
					else if (j == (-i) + (kath + x + y - 1)) // print for third diagonal line
					{
						System.out.print("/");
					} 
					else if ((j == (-i) + (y_leng - 1)) && i >= (y_leng - kath)) // Hidden diagonal line
					{
						System.out.print("o");
					} 
					else if ((j == (kath)) && (i < y_leng - kath)) // Hidden vertical line
					{
						System.out.print("o");
					} 
					else if ((i == y_leng - kath - 1) && (j > kath)) // Hidden horizontal line
					{
						System.out.print("o");
					} 
					else // empty character
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 1:
			for (int i = 0; i < y_leng; i++) {
				for(int j = 0; j < x_leng;j++) {
					if ((i == 0 ) && (j < (x_leng-kath)) || ((i == (y_leng-1)) && (j >=kath) ))  //Top and bottom
					{ 
						System.out.print("#");
					}
					else if ((j==0) && (i< (y_leng-kath)) || (j==(x_leng-1) && i >= kath)) 
					{
						System.out.print("#");
					}
					
					else if ((j==(i)) && (i<=(y_leng-y))) {
						System.out.print("o");
					}
					else if ((j==(i+(x-1)))) {
						System.out.print("\\");
					}
					else if (j==(i-(y))) {
						System.out.print("\\");
					}
					else if ((i==(y-1)) && (j<x)) 
					{
						System.out.print("#");
					}
					else if ((j==(x-1)) && (i<y))
					{
						System.out.print("#");
					}
					else if (j==(i-(y-x)) && (i>=y)) {
						System.out.print("\\");
					}
					else if ((j==(x_leng-x)&&(i>=(y_leng-y)))) 
					{
						System.out.print("o");
					}
					else if ((i==(y_leng-y)) && (j>=(x_leng-x))) 
					{
						System.out.print("o");
					}
					else 
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.println("Box");
			break;
		}

	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
