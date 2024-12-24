package Loop;

public class WhileAndDoWhile {
	public static void main(String[] args) {
		System.out.println("while");
		int i=1;
		while (i<=5) {
			System.out.print(i+" ");
			i++; 
			}
		System.out.println();
		System.out.println("Do-while");
		int j=1;
		do {
		System.out.print(j+" ");
		j++;
		}while(j<5);
		
    }
}