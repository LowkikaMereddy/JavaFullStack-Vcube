package operators;

public class Unaryoperators {

	public static void main(String[] args) {
		int x = 0;
		int y = -1;
		//int z = x*x + (--y)*(--y) - (x++)*(x++)  - y++ + x-- + y--;
		//int z = (x++ * 2) - (y - 2) + ((x--)- 4) + (y++ * 4);
		int z = (x + y) - --x + (x + 1) - y-- + x--;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		

	}

}
