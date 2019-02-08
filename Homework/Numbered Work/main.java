public class Main
{
	public static void main(String[] args) {
		int input = 255;
		int base = 8;
		int [] con = new int[9];
		for(int i = 0; i < 9; i++){
		    if(input % base == 0)
		    con[i] = 0;
		    else
		    con[i] = 1;
		    input /= base;
		}
		for(int i = 8; i > -1; i--)
		    System.out.print(con[i]);
	}
}
