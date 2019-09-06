import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=x/10;
      int z=y%10;
      System.out.println(z);
	}
}